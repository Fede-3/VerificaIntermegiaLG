/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fedep
 */
public class Garage {

    private final List<Veicolo> garage;

    public Garage(int numeroPosti) {
        this.garage = new ArrayList<>();
        inizializza(numeroPosti);
    }

    public void addVeicolo(Veicolo v) {
        try {
            if (postoLibero() == -1) {
                throw new GarageException("Il garage risulta pieno.");
            }
            garage.set(postoLibero(), v);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeVeicolo(int posto) {
        try {
            posto=posto-1;
            if (garage.get(posto) == null) {
                throw new GarageException("Il posto risulta già vuoto");
            }
            if (garage.size() < posto) {
                throw new GarageException("Il garage contiene solo " + garage.size() + " posti");
            }
            garage.set(posto, null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void stampaGarage() {
        try {
            for (int i=0; i<garage.size();i++) {
                System.out.println("------------------------------------------");
                System.out.println("Posto: " + (i+1));
                if (garage.get(i) == null) {
                    System.out.println("Libero");
                } else {
                    System.out.println(garage.get(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int postoLibero() {
        return garage.indexOf(null);
    }

    private void inizializza(int numeroPosti) {
        for (int i = 0; i < numeroPosti; i++) {
            this.garage.add(null);
        }
    }

}
