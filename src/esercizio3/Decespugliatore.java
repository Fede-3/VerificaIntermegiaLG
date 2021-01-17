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
public class Decespugliatore extends Attrezzo{
    private final boolean accensioneElettronia;

//    public Decespugliatore(boolean accensioneElettronia, String marca, int id_ordine) {
//        super(marca, id_ordine);
//        this.accensioneElettronia = accensioneElettronia;
//    }

    public Decespugliatore(boolean accensioneElettronia, String marca) {
        super(marca);
        this.accensioneElettronia = accensioneElettronia;
    }


    public boolean isAccensioneElettronia() {
        return accensioneElettronia;
    }

    
}
