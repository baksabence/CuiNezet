
package modell;

import java.util.Scanner;



public class Jatek {
    private Lada[] ladak;
    private static final Scanner sc = new Scanner(System.in);
    private int valasztas;
    

    public Jatek() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("Arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("Bronz", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("Ezüst", "Az Arany hazudik!");
        
        
        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat igaz! \n";
        int i = 1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". " + a + "láda-->" + f + "\n";
        }
        
        return s;
    }

    private void bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3): ");
        valasztas = sc.nextInt();
    }

    private void megjelenit(String uzenet) {
        System.out.print(uzenet);
    }

    private String ellenorzes() {
         String talalt = "Gratulálok!";
         String nemTalalt = "Gratulálok!";
         return ladak[valasztas].isKincs() ? talalt : nemTalalt;
         
    }
}
