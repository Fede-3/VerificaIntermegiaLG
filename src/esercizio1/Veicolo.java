/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author Fedep
 */
public class Veicolo {
    private String marca, anno, cilindrata;
    private int postoOccupato;

    public Veicolo(String marca, String anno, String cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public int getPostoOccupato() {
        return postoOccupato;
    }

    public void setPostoOccupato(int postoOccupato) {
        this.postoOccupato = postoOccupato;
    }

    
    
    @Override
    public String toString() {
        return "Marca: " + marca + ", anno: " + anno + ", cilindrata: " + cilindrata;
    }



    

    
    
    
    
    
}
