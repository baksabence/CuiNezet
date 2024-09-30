
package main;

import modell.JatekModell;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.FelugroVezerlo;
import vezerlo.KonzolVezerlo;


public class KincsesLada {

    
    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
        KonzolNezet nezet = new KonzolNezet();
        new KonzolVezerlo(modell, nezet);
        
        FelugroNezet felNezet = new FelugroNezet();
        new FelugroVezerlo(modell, felNezet);
    }
    
}
