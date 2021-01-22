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
public abstract class Attrezzo {

    private final String marca;
    private float tot_costo;

    public void setTot_costo(float tot_costo) {
        this.tot_costo = tot_costo;
    }
    private final List<Riparazione> riparazioni;

    private int id_ordine;

    public Attrezzo(String marca) {
        this.marca = marca;
        this.riparazioni = new ArrayList<>();
    }

    public void AggiungiRiparazione(String descrizione, float costo) {
        this.riparazioni.add(new Riparazione(descrizione, costo));
        this.tot_costo += costo;
    }

    public String getMarca() {
        return marca;
    }

    public float getTot_costo() {
        return tot_costo;
    }

    public void setId_ordine(int id_ordine) {
        this.id_ordine = id_ordine;
    }

    public int getId_ordine() {
        return id_ordine;
    }

    public void getRiparazioni() {
        try {
            if(riparazioni.isEmpty()) throw new OfficinaExcetion("Non ci sono riparazioni");
            for (int i = 0; i < riparazioni.size(); i++) {
                System.out.println((i + 1) + ") " + riparazioni.get(i).toString());
            }
        } catch (OfficinaExcetion e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void resetRiparazioni(){
        riparazioni.clear();
        this.tot_costo=0;
    }

}
