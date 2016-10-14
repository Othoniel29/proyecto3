
package planta;

import rosa.rosa;
import bugambilia.bugambilia;
/**
 *
 * @author OTHONIEL
 */
public class Planta {

   
    public static void main(String[] args) {
       
        rosa miPlanta =new rosa();
            rosa miPlanta2= new rosa("blanca",90,"real","sin espinas");
            System.out.println(miPlanta.getColor());
            System.out.println(miPlanta.getTamaño_en_centimetros());
            System.out.println(miPlanta.getTipo());
            System.out.println(miPlanta.getCaracteristicas());
            System.out.println("----------------------------");
            System.out.println(miPlanta2.getColor());
            System.out.println(miPlanta2.getTamaño_en_centimetros());
            System.out.println(miPlanta2.getTipo());
            System.out.println(miPlanta2.getCaracteristicas());
            
             System.out.println("--------------------------------------------------------------------------------------------------------");
        bugambilia mibugambilia = new bugambilia();
            bugambilia miPlanta3= new bugambilia("morada",300,"real","con espinas");
            System.out.println(mibugambilia.getColor());
            System.out.println(mibugambilia.getTamaño_en_centimetros());
            System.out.println(mibugambilia.getTipo());
            System.out.println(mibugambilia.getCaracteristicas());
            System.out.println("----------------------------");
            System.out.println(miPlanta3.getColor());
            System.out.println(miPlanta3.getTamaño_en_centimetros());
            System.out.println(miPlanta3.getTipo());
            System.out.println(miPlanta3.getCaracteristicas());
            
        }
    }
    

