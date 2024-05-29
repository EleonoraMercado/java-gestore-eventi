package org.milestone2.java;

//importo il localDate per poter elaborate la propietà data 

import java.time.LocalDate;

//creo la classe evento astratta perche i metodi e le proprietà che mettero
//al suo interno mi serviranno per tutte le classi che estenderò

public abstract class Evento {

    //creo gli attributi della mia classe astratta
    
    private String titolo;
    private LocalDate dataEvento;
    private int numeroTotalePosti;
    private int numeroPostiPrenotati;
    
    //valorizzo gli attributi nel costruttore,  
    //tranne posti prenotati che va inizializzato a 0
    
    public Evento(String titolo, LocalDate dataEvento, int numeroTotalePosti) {
	
	this.titolo = titolo;
	this.dataEvento = dataEvento;
	this.numeroTotalePosti = numeroTotalePosti;
	this.numeroPostiPrenotati = 0;
	
	//aggiungo i metodi getter e setter come specificato
	
	
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getNumeroTotalePosti() {
        return numeroTotalePosti;
    }

    public int getNumeroPostiPrenotati() {
        return numeroPostiPrenotati;
    }

    
    
  //metodo di prenotazione che controllerà se la data 
    //è gia passata, se il numero di posti prenotati piu il
    //numero di prenotazioni aggiunte è minore dei posti disponibili
    //e aggiungerò il numero di posti appena prenotati 
    
    public void prenota(int numeroPosti) {
   	if (this.dataEvento.isBefore(LocalDate.now())) {
   	    System.out.println("L'evento è gia passato, non puoi effettuare la prenotazione");
   	
   	//devo controlare se ci sono abbastanza posti disponibili
   	
   	} else if (numeroPostiPrenotati + numeroPosti > numeroTotalePosti) {
   	    System.out.println("I posti disponibili sono terminati.");
   	   	
   	//aggiungo posti
   	    
   	} else {
   	    numeroPostiPrenotati += numeroPosti;
   	    System.out.println("Hai prenotato per " + numeroPosti + " posti.");
   	}
    }
    
    
    //creo il metodo disdici che verifichera se la data è gia passata, 
    
    public void disdici(int numeroPosti) {
	if (LocalDate.now().isAfter(getDataEvento())) {
   	    System.out.println("L'evento è gia passato, non puoi effettuare una disdetta");
   	    return;
   	}
	
	
	if (numeroPosti <= numeroPostiPrenotati) {
	    numeroPostiPrenotati -= numeroPosti;
	    System.out.println("Hai disdetto " + numeroPosti + " posti.");
	}
    }
    
    
    //metodo per vedere i posti disponibili
    
    public void mostraPostiDisponibili() {
	    int postiDisponibili = getNumeroTotalePosti() - getNumeroPostiPrenotati();
		System.out.println("Posti rimasti a disposizione: " + postiDisponibili);
	
}
    
    
    //creo il metodo toString nella classe astratta perchè ogni oggetto di 
    //un evento(concerto, conferenza, spettacolo etc.)
    //che dovro istanziare dovra mostrarmi le proprietà all'interno 
    //di questa classe

    @Override
    public String toString() {
	return "Evento titolo= " + titolo + "\n dataEvento= " + dataEvento;
    }
    
    //creo il metodo per vedere se l'evento è passato da utilizzare all'interno del metodo prenota 
    //quando lo andrò a implementare nella classe concerto o altri eventi
    
    public boolean seEventoPassato() {
	return LocalDate.now().isAfter(dataEvento);
    }
    
       
    
}
