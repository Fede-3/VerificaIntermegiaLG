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
public class Garage {

    ArrayList<Veicolo> garage = new ArrayList<Veicolo>();
    int[] postiLiberi = new int[14];

    void aggiungiVeicolo(Veicolo veicolo) {
        int posto = trovaPosto();
        if (posto != -1) {
            System.out.println("Sto aggiungendo il veicolo:\n"+veicolo.toString());
            
            System.out.println("Nel primo posto libero disponibile: " + posto+"\n");
            garage.add(posto, veicolo);
            veicolo.setPostoOccupato(posto);
            postiLiberi[posto] = 1;
        } else {
            System.out.println("Nessun posto libero!\n");
        }

    }
    

    void rimuoviVeicolo(int posto) {
        Veicolo veicolo = null;

        for (Veicolo v : garage) {
            if (posto == v.getPostoOccupato()) {
                veicolo = v;
                break;
            }
        }

        if (veicolo != null) {
            System.out.println("Sto rimuovendo il veicolo:\n"+veicolo.toString());
            System.out.println("Dal posto: " + posto+"\n");
            garage.remove(veicolo);
            postiLiberi[posto] = 0;
            System.out.println("Ora il posto " + posto + " è libero.\n");
        } else {
            System.out.println("Il posto"+posto+ "risulta già libero\n");
        }

    }

    void stampaGarage() {
        for (Veicolo veicolo : garage) {
            System.out.println("Nel posto: "+veicolo.getPostoOccupato());
            System.out.println(veicolo.toString()+"\n");
        }
    }

    int trovaPosto() {
        for (int i = 0; i <= postiLiberi.length; i++) {
            if (postiLiberi[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    

}
