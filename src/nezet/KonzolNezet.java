
package nezet;

import java.util.Scanner;


public class KonzolNezet extends CuiNezet{
    
    private static final Scanner sc = new Scanner(System.in);
    
    @Override
    public void megjelenit(String uzenet) {
        System.out.print(uzenet);
    }
    
    @Override
    public int bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3): ");
        return sc.nextInt() -1;
    }
}
