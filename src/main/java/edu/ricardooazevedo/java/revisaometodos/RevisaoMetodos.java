
package edu.ricardooazevedo.java.revisaometodos;

import edu.ricardooazevedo.java.revisaometodos.model.SmartTv;
/**
 *
 * @author ricar
 */


public class RevisaoMetodos {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
       
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.adiantarCanal();
        smartTv.adiantarCanal();
        smartTv.voltarCanal();
        
        
        System.out.println("Status:");
        System.out.println("Ligada: "+smartTv.isLigada());
        System.out.println("Canal: "+smartTv.getCanal());
        System.out.println("Volume: "+smartTv.getVolume());
    }
}
