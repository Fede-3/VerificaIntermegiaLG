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
public class Furgone extends Veicolo{
    int capacita;

    public Furgone(int capacita, String marca, String anno, String cilindrata) {
        super(marca, anno, cilindrata);
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return "Di tipo furgone\n"+super.toString()+", capacità: "+capacita;
    }


    
    


    
    
    
}
