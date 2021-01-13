/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;

/**
 *
 * @author Fedep
 */
public class App {
    
    static Garage g1=new Garage();
    
    public static void main(String[] args) {
        Furgone f = new Furgone(1000, "Fiat", "1990", "2600");
        g1.aggiungiVeicolo(f);
        Moto m = new Moto(2, "Cagiva", "2006", "50");
        g1.aggiungiVeicolo(m);
        Auto a = new Auto(5, Auto.Alimentazione.Benzina, "Fiat", "2010", "1900");
        g1.aggiungiVeicolo(a);
        g1.rimuoviVeicolo(5);
        g1.rimuoviVeicolo(1);
        
        g1.stampaGarage();
    }
    
}
