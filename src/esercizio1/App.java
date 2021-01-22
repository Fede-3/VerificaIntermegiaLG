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
public class App {

    public static void main(String[] args) {
        Garage g = new Garage(15);

        g.stampaGarage();
        g.addVeicolo(new Furgone(1000, "Fiat", "1990", "2600"));
        g.addVeicolo(new Moto(2, "Cagiva", "2006", "50"));
        g.addVeicolo(new Auto(5, Auto.Alimentazione.Benzina, "Fiat", "2010", "1900"));
        g.stampaGarage();
        g.removeVeicolo(2);
        g.stampaGarage();
        g.addVeicolo(new Auto(3, Auto.Alimentazione.Diesel, "Fiat", "2020", "1300"));
        g.stampaGarage();
    }

}
