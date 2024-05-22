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

    //creo il metodo prenota posti che andrà implementato nelle sottoclassi
    
    public abstract void prenota();
    
    //creo il metodo disdici che andra implementato nelle sottoclassi
    
    public abstract void disdici();
    
    //creo il metodo toString nella classe astratta perchè ogni oggetto di 
    //un evento(concerto, conferenza, spettacolo etc.)
    //che dovro istanziare dovra mostrarmi le proprietà all'interno 
    //di questa classe

    @Override
    public String toString() {
	return "Evento titolo= " + titolo + "\n dataEvento= " + dataEvento + "\n numeroTotalePosti= " + numeroTotalePosti
		+ "\n numeroPostiPrenotati= " + numeroPostiPrenotati;
    }
       
    
}