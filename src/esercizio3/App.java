/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;

/**
 *
 * @author Fedep
 */
public class App {

    public static ArrayList<Attrezzo> inLavorazione = new ArrayList<>();
    private static int id_ordine;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            inLavorazione.add(null);
        }

        Motozappa m = new Motozappa(2, "Cemb");
        

        inserisciLavorazione(m);

        m.AggiungiRiparazione("sostituito cinghia", 20);
        m.AggiungiRiparazione("sostituito testa", (float) 50.30);
        
        riparazioneFinita(m);
        
        inserisciLavorazione(m);
        
        m.AggiungiRiparazione("sostituito cinghia", 20);
        m.AggiungiRiparazione("sostituito testa", (float) 50.30);
        

    }

    private static void inserisciLavorazione(Attrezzo a) {
        try {
            if (indiceLibero() == -1) {
                throw new Exception("Raggiunto limite lavorazioni");
            }
            a.setId_ordine(id_ordine++);
            inLavorazione.add(indiceLibero(), a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static int indiceLibero() {
        try {
            return inLavorazione.indexOf(null);
        } catch (Exception e) {
            return -1;
        }

    }

    private static void riparazioneFinita(Attrezzo a){
        System.out.println("Riparazione effettuata per: "+a.getMarca()+"\ncon id ordine: "+a.getId_ordine());
        System.out.println("Sono state effettuate le seguenti riparazioni: ");
        for (Riparazione r: a.getRiparazioni()) {
            System.out.println(r.getDescrizione());
            System.out.println("-----------------------");
        }
        System.out.println("Il costo totale delle riparazioni è: "+a.getTot_costo());
        
        inLavorazione.set(inLavorazione.indexOf(a), null);
            
    }

    
}
