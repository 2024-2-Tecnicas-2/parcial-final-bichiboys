/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author MARATON
 */
public class Zoologico {
    public static void main(String[] args) {
        Leon leon1 = new Leon();
        Delfin delfin2 = new Delfin();
        Perro perro = new Perro();
        
        
        System.out.println( leon1.emitirSonido());
        
        System.out.println( leon1.obtenerDieta());
        
        
        System.out.println( delfin2.emitirSonido());
        
        System.out.println( delfin2.obtenerDieta());
        
        
        System.out.println( perro.emitirSonido());
        
        System.out.println( perro.obtenerDieta());
         
         
        
    }
    
}
