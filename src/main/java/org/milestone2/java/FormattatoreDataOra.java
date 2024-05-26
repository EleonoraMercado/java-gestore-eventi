package org.milestone2.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//creo questa classe di utilita per formattare la data, la data e l'ora e l'ora, e poterla utilizzare successivamente 
//nei nuovi oggetti che andrò a creare
//la creerò statica e final perchè ogni evento che andrò a creare dovranno avere questo tipo di comportamento
//nell'ipotesi che tutti gli eventi siano fatti in italia perciò con data italiana
//ma sopratutto perchè non dovro istanziarlo prima di utilizzarlo ogni volta che mi servirà
//mi sembra un modo completo visto che queste proprietà si dividono nelle diverse classi e non sono tutte in una unica

public class FormattatoreDataOra {

     //formattatore per la data e l'ora
        
     private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm",Locale.ITALY);
     
     //formattatore per la data
     
     private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy",Locale.ITALY);
     
     //formattatore per l'ora
     private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm",Locale.ITALY);
     
     //creo un metodo per formattare la data e l'ora
     
     public static String formattaDataOra(LocalDateTime dataOra) {
         return dataOra.format(DATE_TIME_FORMATTER);
     } 
     
     //metodo per formattare solo la data
     
     public static String formattaData(LocalDate dataEvento) {
         return dataEvento.format(DATE_FORMATTER);
     }
     
     //metodo per formattare solo ora
     
     public static String formattaOra(LocalTime ora) {
         return ora.format(TIME_FORMATTER);
     }
 
}
