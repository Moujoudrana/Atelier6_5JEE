# Atelier6 

Objectif:

1. - Télécharger Kafka
    
  - Démarrer Zookeeper
    
  - Démarrer Kafka-server
    
  - Tester avec Kafka-console-producer et kafka-console-consumer
    
2. Avec Docker (voir https://developer.confluent.io/quickstart/kafka-docker/) https://www.youtube.com/watch?v=9O1Kuk2xXO8
   
  - Créer le fichier docker-compose.yml
    
  - Démarrer les conteneurs docker : zookeeper et kafka-broker
    
  - Tester avec Kafka-console-producer et kafka-console-consumer
    
3. En Utilisant KAFKA et Stpring Cloud Streams, Créer : https://www.youtube.com/watch?v=eo8pSWpj2os&authuser=0
   
  - Un Service Producer KAFKA via un Rest Controler
    
  - Un Service Consumer KAFKA
    
  - Un Service Supplier KAFKA
    
  - Un Service de Data Analytics Real Time Stream Processing avec Kaflka Streams
    
  - Une application Web qui permet d'afficher les résultats du Stream Data Analytics en temps réel

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/e56d94ea-9f46-46e5-94dd-0c6608a9e8a3)

Un broker est un serveur qui fait partie d'un cluster Kafka. Les brokers sont responsables du stockage, de la gestion et du transfert des données au sein de la plateforme de streaming de données. Un cluster Kafka est constitué de plusieurs brokers qui travaillent ensemble pour offrir une haute disponibilité, une tolérance aux pannes et une distribution des charges de travail.

Chaque broker dans le cluster Kafka conserve une partie des données et des partitions des topics. Les partitions permettent une distribution parallèle des données, ce qui facilite la scalabilité horizontale. Chaque partition est répliquée sur plusieurs brokers pour assurer la résilience en cas de panne d'un broker.

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/20323cbf-a7dc-42dd-8ce3-b180f433fe87)

ZooKeeper est un service de coordination distribuée open source qui joue un rôle crucial dans la gestion et la coordination des composants d'un système distribué. Il a été conçu pour résoudre des problèmes tels que la gestion de configuration, la synchronisation, la détection de pannes, et la gestion de verrous dans des environnements distribués.

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/cb85bbad-9a1b-424d-8bab-b8b87c328d56)

Première étape:

<img width="541" alt="1" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/ea1eed0a-b596-4596-b65e-caf242ec4c72">

<img width="614" alt="2" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/8c5275f1-60d4-4ad6-bc5b-af3089d5de44">

    -Test

    <img width="866" alt="3" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/d67cc544-ef1d-40b6-90bc-1b9983ee1048">

Deuxième étape:

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/32037552-9bf6-470c-a899-264e1ad8deb5)

    -Test

    <img width="960" alt="4" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/f1faba5c-0af3-4caa-84ff-a7423030a991">

Troisième étape:

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/3be1b6a1-6181-4837-a36e-bf533c9ba85f)

    -Test

    <img width="750" alt="5" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/31a4fcc6-6afc-4c6a-b234-5c48029966f3">

Quatrième étape:

![image](https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/cd17173c-2a17-48a2-a73f-d549083c4681)

    -Test

    <img width="955" alt="6" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/8e373506-775e-405b-af60-b43a239c3a13">

Cinquième étape:

<img width="702" alt="7" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/3afb597e-14dd-4d9b-8aee-56e2851020fd">

    -Test

    <img width="951" alt="8" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/d5701494-924b-4694-8e89-874f81d1f8fb">

Sixième étape:

<img width="960" alt="9" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/79862e4b-3cad-458e-b241-781c22e3ba6f">

Affichage de la courbe:

<img width="960" alt="10" src="https://github.com/Moujoudrana/Atelier6_5JEE/assets/93864104/cbd4b6c1-aa9c-4087-a0f1-76e334a2bbf3">


















