/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectemotogp;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ProjecteMotoGp {
    //Numero de caselles maxim de l'array
    private static final int MAX_PILOTS = 10;
    //Array on guardem la informació dels pilots.
    private static final Pilot[] array=new Pilot[MAX_PILOTS];
    //Opció triada per l'usuari
    private static int opcio; 
    
    public static void main(String[] args) {
            
        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());
        
    }

    public static void inicialitzarVariables(){
        
        //Inicialitzarem l'array en nous pilots sense dades
        
      
    }
    
    
    public static void demanarOpcio(){
    Scanner ent = new Scanner(System.in);
        
        System.out.println("\n\nMenú de l'aplicació");
        System.out.println("-----------------------");
        System.out.println("1. Introduir pilot.");
        System.out.println("2. Modificar pilot.");
        System.out.println("3. Borrar pilot.");
        System.out.println("4. Llistar pilots.");
        System.out.println("5. Recuperar pilot borrat.");
        opcio = ent.skip("[\r\n]*").nextInt();
    }
public static void tractarOpcio(){



}
public static boolean opcioFinal(){
    return opcio == 0;
}

}