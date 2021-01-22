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

    public Veicolo(String marca, String anno, String cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
    
    @Override
    public String toString() {
        return "Marca: " + marca + ", anno: " + anno + ", cilindrata: " + cilindrata;
    }
    
}
