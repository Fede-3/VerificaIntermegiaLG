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
public class Moto extends Veicolo{
    int tempi;

    public Moto(int tempi, String marca, String anno, String cilindrata) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    @Override
    public String toString() {
        return "Di tipo moto\n"+super.toString()+", Tempi: "+tempi;
    }

    
    
    
}
