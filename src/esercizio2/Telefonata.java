/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Fedep
 */
class Telefonata {

    private final String destinatario;
    private final int durata;

    public Telefonata(String destinatario, int durata) {
        this.destinatario = destinatario;
        this.durata = durata;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public int getDurata() {
        return durata;
    }

    String getData(){
        return "----\nDestinatario: "+ this.destinatario + "\nDurata: "+ this.durata +"\n"; 
    }

    
}
