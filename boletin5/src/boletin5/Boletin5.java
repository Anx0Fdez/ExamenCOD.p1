//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD

package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        consumo obxCon = new consumo ( );
        obxCon.setLitros(50f);
        obxCon.setPGas( 1.57f);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce kilometros : ");
        float km = sc.nextFloat();
        System.out.print("Introduce litros : ");
        float li = sc.nextFloat();
        System.out.print("Introduce velocidad media : ");
        float vM = sc.nextFloat();
        System.out.print("Introduce precio gasolina : ");
        float pG = sc.nextFloat();
  
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD

   consumo obxConP = new consumo (km, li, vM, pG );
   obxConP.consumoEuros ( );
   obxConP.consumoMedio ( );
    
 }
    
}
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
