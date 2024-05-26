package org.milestone2.java;

//creo questa classe di utilita per formattare il prezzo, e poterla utilizzare successivamento 
//nei nuovi oggetti che andrò a creare
//la creerò statica perchè ogni evento che andrò a creare dovrà mostrarmi il prezzo formttato in questo modo,
//ma sopratutto perchè non dovro istanziarlo prima di utilizzarlo ogni vola che mi servirà
//non ho preso in considerazione l'elaborazione dell'iva nel mio ragionamento

public class FormattatorePrezzo {

    public static String formattaPrezzo(double prezzo) {
	return String.format( "%.2f€", prezzo);
    }
}
