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
public class App {

    public static void main(String[] args) {
        
        Motozappa m = new Motozappa(2, "Cemb");
        Decespugliatore d = new Decespugliatore(true, "Deces");
        Tosaerba t = new Tosaerba(4, "Tos");
        
        Officina o = new Officina(10);

        o.addLavorazione(m);
        o.addLavorazione(d);
        o.addLavorazione(t);
        
        d.getRiparazioni();
        
        m.AggiungiRiparazione("cinghia", (float) 50.50);
        m.AggiungiRiparazione("testa", (float) 150.33);
        m.AggiungiRiparazione("filo", (float) 5);
        m.AggiungiRiparazione("altra roba", (float) 20.50);
        o.riparazioneFinita(m);
        
        o.addLavorazione(m);
        m.AggiungiRiparazione("sostituito cinghia", 20);
        m.AggiungiRiparazione("sostituito testa", (float) 50.30);
        m.getRiparazioni();
        o.riparazioneFinita(m);
    }

}
