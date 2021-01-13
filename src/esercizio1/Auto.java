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
public class Auto extends Veicolo{

    int porte;
    public static enum Alimentazione{
        Benzina, Diesel
    } 
    Alimentazione alimentazione;

    public Auto(int porte, Alimentazione alimentazione, String marca, String anno, String cilindrata) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    

    @Override
    public String toString() {
        return "Di tipo auto\n"+ super.toString()+ ", porte: "+porte+" alimentazione: "+alimentazione;
    }
    
    
    
}
