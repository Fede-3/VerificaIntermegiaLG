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
public class Riparazione {
    private final String descrizione;
    private final float costo;

    public Riparazione(String descrizione, float costo) {
        this.descrizione = descrizione;
        this.costo = costo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Riparazione{" + "descrizione=" + descrizione + ", costo=" + costo + '}';
    }
    
    
    
    
}
