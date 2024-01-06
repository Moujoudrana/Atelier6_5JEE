package org.sid.atelier6.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PageEvent {
    private String name; //nompage
    private String user;//Nomuser qui utilise la page
    private Date date;
    private long duration;//duree passer dans la page
}
