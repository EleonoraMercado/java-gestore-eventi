package org.milestone2.java;

//importo le utilità del pacchetto java.time, ho fatto tre importazioni differenti
//per poter elaborare l'ora, la data e l'ora e solo la data

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime; 

public class Concerto extends Evento {
    
    //aggiungo le proprietà richeste
    
    private LocalTime ora;
    private double prezzo;

    //faccio il costruttore con i dati della super classe x
    // e dei delle  nuove proprietà
    
    public Concerto(String titolo, LocalDate dataEvento, int numeroTotalePosti, LocalTime ora, double prezzo) {
	super(titolo, dataEvento, numeroTotalePosti);
	this.ora = ora;
	this.prezzo = prezzo;
    }
    
    //eseguo i getter e setter come da assegnazione

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    //faccio override come da consegna, e utilizzo le classi di utilità che ho creato per formattare sia la data che l'ora
    
    @Override
    public String toString() {
	
	//unisco la data e l'ora in un singolo oggetto
	
	LocalDateTime dataOraCompleta = LocalDateTime.of(getDataEvento(), ora);
	
	//utilizzo il metodo che ho creato nella classe di utilita
	//per formattare la data e l'ora, cosi da ottenere una stringa
	
	String dataOraFormattata = FormattatoreDataOra.formattaDataOra(dataOraCompleta);
	
	//uilizzo il metodo creato nella classe di utilità per ottenere il prezzo come da consegna
	
	String prezzoFormattato = FormattatorePrezzo.formattaPrezzo(prezzo);
	
	//stringa finale che mi deve apparire a schermo
	
	return dataOraFormattata + " - " + getTitolo() + " - " + prezzoFormattato + " a biglietto";
	
    }
 
   
    

}
