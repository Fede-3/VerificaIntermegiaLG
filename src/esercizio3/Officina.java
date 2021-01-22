/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fedep
 */
public class Officina {

    private final int max_riparazioni;
    private final List<Attrezzo> inRiparazione;
    private int id_ordine;

    //quante lavorazioni contemporanee, lista di macchine, quando ne prende una da numero d'ordine 
    //
    public Officina(int max_riparazioni) {
        this.max_riparazioni = max_riparazioni;
        this.inRiparazione = new ArrayList<>();
        inizializza();
    }

    private void inizializza() {
        for (int i = 0; i < max_riparazioni; i++) {
            inRiparazione.add(null);
        }
    }

    public void addLavorazione(Attrezzo a) {
        try {
            if (postoLibero() == -1) {
                throw new OfficinaExcetion("Coda lavorazioni piena");
            }
            a.setId_ordine(id_ordine++);
            a.resetRiparazioni();
            inRiparazione.set(postoLibero(), a);
        } catch (OfficinaExcetion e) {
            System.out.println(e.getMessage());
        }

    }

    public void riparazioneFinita(Attrezzo a) {
        System.out.println("Riparazione effettuata per: " + a.getMarca() + "\ncon id ordine: " + a.getId_ordine());
        System.out.println("Sono state effettuate le seguenti riparazioni: ");
        a.getRiparazioni();
        System.out.println("Il costo totale delle riparazioni è: " + a.getTot_costo());
        inRiparazione.set(inRiparazione.indexOf(a), null);
    }
    
    private int postoLibero() {
        return inRiparazione.indexOf(null);
    }

}
