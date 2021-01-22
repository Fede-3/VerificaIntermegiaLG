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
public class Ordine extends Attrezzo{
    private final int id_ordine;
    static private int cont;

    public Ordine(String marca) {
        super(marca);
        this.id_ordine = cont++;
    }
    
    
    
}
