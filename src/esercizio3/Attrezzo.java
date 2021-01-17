/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Fedep
 */
public abstract class Attrezzo {
//    private static int cont;
    private int id_ordine;

    public void setId_ordine(int id_ordine) {
        this.id_ordine = id_ordine;
    }
    private final String marca;
    private float tot_costo;
    private final ArrayList<Riparazione> riparazioni;

    public Attrezzo(String marca) {
//        this.id_ordine = id_ordine;
        this.marca = marca;
        this.riparazioni=new ArrayList<>();
    }
    
    public void AggiungiRiparazione(String descrizione, float costo){
        this.riparazioni.add(new Riparazione(descrizione, costo));
        this.tot_costo+=costo;
    }

    
    public String getMarca() {
        return marca;
    }

    public float getTot_costo() {
        return tot_costo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attrezzo other = (Attrezzo) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    public ArrayList<Riparazione> getRiparazioni() {
        return riparazioni;
    }

    public int getId_ordine() {
        return id_ordine;
    }

    
    
}
