/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.ArrayList;

/**
 *
 * @author Fedep
 */
public class Sim {

    private final String numeroTelefono;
    private final float credito;
    ArrayList<Telefonata> telefonate;

    public Sim(String numeroTelefono, float credito) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.telefonate = new ArrayList<Telefonata>();
    }

    public void aggiungiTelefonata(String destinatario, int durata) {
        telefonate.add(new Telefonata(destinatario, durata));
    }

    public float durataTelefonate() {
        float durata = 0;
        for (Telefonata telefonata : telefonate) {
            durata += telefonata.getDurata();
        }
        return durata;
    }

    public void chimateA(String destinatario) {
        try {
            int cont = 0;
            if (destinatario == null) {
                throw new Exception("\n-------------------------\ndestinatario non può essere vuoto\n-------------------------\n");
            }
            for (Telefonata telefonata : telefonate) {
                if (telefonata.getDestinatario() == destinatario) {
                    cont++;
                }
            }
            if(cont==0){
                throw new Exception(destinatario+" non presente nelle telefonate");
            }
            System.out.println("Sono state fatte "+cont+" telefonate al contatto "+destinatario);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void stampaDati(){
        String s ="";
        s+="Numero: "+numeroTelefono+"\nCredito: "+credito+"\n";
        for (Telefonata telefonata : telefonate) {
            s+=telefonata.getData();
        }
        System.out.println(s);
    }


}
