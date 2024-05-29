package org.milestone2.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestEventi {

    public static void main(String[] args) {
	
	//utilizzo Scanner per leggere l'imput dell'utente dalla console
	
	Scanner scan = new Scanner (System.in);
	
	//chiedero all'utente informazioni sull'evento che vorrebbe prenotare
	
	System.out.println("Inserisci il titolo del'evento che vuoi prenotare: ");
	String titolo = scan.nextLine();
	
	
	System.out.println("Inserisci la data dell'evento");
	String dataStringa = scan.nextLine();
	LocalDate data = LocalDate.parse(dataStringa, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	
	System.out.println("Inserisci l'ora in cui vuoi prenotare: ");
	String oraStringa = scan.nextLine();
	LocalTime ora = LocalTime.parse(oraStringa, DateTimeFormatter.ofPattern("HH:mm"));

	
	System.out.println("Inserisci il numero di posti che vedi disponibili: ");
	int numeroTotalePosti = scan.nextInt();
	
	
	System.out.println("Inserisci il prezzo del biglietto: ");
	double prezzo = scan.nextDouble();
	
	//l'ho inserito perche dopo gli imput numerici non aveva il comportamento giusto di lettura ai seguenti imput
	scan.nextLine();
	
	//adesso creo l'evento cosi da continuare a inserire i dati richiesti da consegna
	//per poi mostrarli a schermo
	
	Concerto concerto = new Concerto(titolo, data, numeroTotalePosti, ora, prezzo);
	
	//chiedo i dati sulle prenotazioni
	
	System.out.println("Quanti posti vuoi prenotare?");
	int postiDaPrenotare = scan.nextInt();
	scan.nextLine();
	
	if (postiDaPrenotare > 0) {
	    concerto.prenota(postiDaPrenotare);
	    System.out.println("prenotati: " + concerto.getNumeroPostiPrenotati());
	} else {
	    System.out.println("Non hai aggiunto nessuna prenotazione");
	}
	
	//stampo i posti rimasti dopo la prenotazione
	
	concerto.mostraPostiDisponibili();
	
	//chiedo i dati sulla disdetta delle prenotazioni
	
	System.out.println("Quanti posti vuoi disdire?");
	int postiDaDisdire = scan.nextInt();
	scan.nextLine();
	
	if (postiDaDisdire > 0) {
	    concerto.disdici(postiDaDisdire);
	    System.out.println("Disdetti " + postiDaDisdire);
	} else {
	    System.out.println("Non hai effettuato alcuna disdetta");
	}
	
	//stampo i posti disponibili dopo la disdetta
	
	concerto.mostraPostiDisponibili();
	
	scan.close();
	
	System.out.println(concerto);

    }

}
