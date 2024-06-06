package org.milestone2.java;

//creo questa classe di utilita per formattare il prezzo, e poterla utilizzare successivamento 
//nei nuovi oggetti che andrò a creare
//la creerò statica perchè ogni evento che andrò a creare dovrà mostrarmi il prezzo formttato in questo modo,
//ma sopratutto perchè non dovrò istanziarlo prima di utilizzarlo ogni volta che mi servirà
//inserito controllo in caso si inserisca un numero negativo


public class FormattatorePrezzo {

    public static String formattaPrezzo(double prezzo) {
	if (prezzo < 0) {
	    return "Il prezzo non può essere negativo.";
	}
    
	return String.format( "%.2f€", prezzo);
    }
    
}
