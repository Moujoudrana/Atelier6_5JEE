package org.sid.atelier6.services;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.apache.kafka.streams.kstream.internals.TimeWindow;
import org.sid.atelier6.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class PageEventService {
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){//fonc qui a un param mais retourne rien(fait un subscribe vers le topic et des quil a un msg il laff
        return (input)->{
            System.out.println("*******");
            System.out.println(input.toString());
            System.out.println("*******");
        };
    }
    @Bean
    public Supplier<PageEvent> pageEventSupplier(){//fonc qui na pas de param mais retourne
        return ()-> new PageEvent(Math.random()>0.5
                ?
                "P1"
                :
                "P2",
                Math.random()>0.5
                        ?
                        "U1"
                        :
                        "U2",
                new Date(),
                new Random().nextInt(9000));
    }

    @Bean
    public Function<PageEvent,PageEvent> pageEventFunction(){
        return (input)->{
            input.setName("Page Event");
            input.setUser("UUUU");
            return input;
        };
    }

    @Bean
    public Function<KStream<String,PageEvent>,KStream<String,Long>> kStreamFunction(){
        return (input)->{
            return input
                    .filter((k,v)->v.getDuration()>100)//garder que les enreg qui on la duree sup a 100
                    .map((k,v)->new KeyValue<>(v.getName(),0L))//map prend un objet est le transforme ne un autre objet, dans ce cas chaque objet devient a cle est le nom de la page et la valeur est 0
                    .groupBy((k,v)->k,Grouped.with(Serdes.String(),Serdes.Long()))//il faut obligatoirement specifier le type de la cle et de la valeur, il est souvent accompagner avec un calcule (count)
                    .windowedBy(TimeWindows.of(Duration.ofSeconds(5)))//produire les resultat que sur les 5derniere seconde
                    .count(Materialized.as("page-count"))//pour chaq groupe fait la somme de la valeur,page-count est un ktable dans lequel les données sont stocké
                    .toStream()//pour convertir lobjet en un stream
                    .map((k,v)-> new KeyValue<>("=>"+k.window().startTime()+k.window().endTime()+":"+k.key(),v));
        };
        //start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R4 --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
        //start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R2
    }
}
