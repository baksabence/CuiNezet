
package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;
import vezerlo.FelugroVezerlo;
import vezerlo.KonzolVezerlo;


public class KincsesLada {

    
    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
//        KonzolNezet nezet = new KonzolNezet();
//        new KonzolVezerlo(modell, nezet);
//        
//        FelugroNezet felNezet = new FelugroNezet();
//        new FelugroVezerlo(modell, felNezet);
          CuiNezet nezet;
//        nezet = new KonzolNezet();
//        nezet = new FelugroNezet();
//        new KonzolVezerlo(modell, nezet);
          nezet = new FelugroNezet();
            
          new CuiVezerlo(modell, nezet);
    }
    
}
