/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author Fedep
 */
public abstract class AtrezzoConRuote extends Attrezzo{
    private final int numeroRuote;

//    public AtrezzoConRuote(int numeroRuote, String marca, int id_ordine) {
//        super(marca, id_ordine);
//        this.numeroRuote = numeroRuote;
//    }

    public AtrezzoConRuote(int numeroRuote, String marca) {
        super(marca);
        this.numeroRuote = numeroRuote;
    }


    public int getNumeroRuote() {
        return numeroRuote;
    }
    
    
}
