/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author Fedep
 */
public class App {

    public static void main(String[] args) {
        try {
            Sim s1 = new Sim("12345678", 5);
            s1.aggiungiTelefonata("pluto", 2);
            s1.aggiungiTelefonata("pippo", 5);
            s1.aggiungiTelefonata("topolino", 20);
            s1.stampaDati();
//            s1.chimateA("");
//            s1.chimateA("gianni");
//            s1.chimateA("pippo");
            System.out.println("La durata totale delle telefonate è: "+s1.durataTelefonate()+"\n");
            s1.numeroTelefonateA("pippo");
            s1.numeroTelefonateA("");
            s1.numeroTelefonateA("gianni");
            
            
        }
        catch (Exception e) {
            System.out.println("C'è stato un errore nel main");
        }

    }
}
