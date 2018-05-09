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
// anem fent
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
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pilot();
            array[i].setOmplit(false);
            
        }
      
    }
    
    public static void demanarOpcio(){
    Scanner ent = new Scanner(System.in);
        
        System.out.println("\nMenú de la base de dades");
        System.out.println("-----------------------");
        System.out.println("1. Introduir pilot.");
        System.out.println("2. Modificar pilot.");
        System.out.println("3. Borrar pilot.");
        System.out.println("4. Llistar pilots.");
        System.out.println("5. Recuperar pilot borrat.");
        
        opcio = ent.skip("[\r\n]*").nextInt();
    }
    public static void tractarOpcio(){
    
        switch (opcio) {
            //0. Per a sortir
            case 0:
                System.out.println("Fins un Altra!!");
                break;
            //1. Introduir un pilot
            case 1:
                introduirPilot();
                break;
            //2. Modificació de un pilot
            case 2:
                modificarPilot();
                break;
            //3. Esborrarem el pilot
            case 3:
                borrarPilot();
                break;
            //4. Llistarem tots els pilots
            case 4:
                llistaPilot();
                break;
            //5. Recuperarem pilots borrats
            case 5:
                recuperarPilot();
                break;
                
            
    }


}
    public static boolean opcioFinal(){
    
        return opcio == 0;
    
    }

    public static void introduirPilot(){
        Scanner ent = new Scanner(System.in);
        
        //Primer Recorrerem l'array fins trobar una casella no omplida o arribar al seu final.
        
        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);
        //Si no hem arribat al final es perque hem trobat una casella buida (no omplida)
        if(i < array.length) {
            System.out.println("\nNom");
            array[i].setNom(ent.skip("[\r\n}*").nextLine());
            System.out.println("\nCognom");
            array[i].setCognom(ent.skip("[\r\n}*").nextLine());
            System.out.println("\nDorsal");
            array[i].setDorsal(ent.skip("[\r\n}*").nextInt());
        }
      
    }
    public static void modificarPilot(){



    }
    public static void borrarPilot(){



    }
    public static void llistaPilot(){



    }
    public static void recuperarPilot(){



    }
        
}