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
    private static final Pilot[] array = new Pilot[MAX_PILOTS];
    //Opció triada per l'usuari
    private static int opcio;
    //Opció triada per l'usuari
    private static char SiNo;

    public static void main(String[] args) {

        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

    }

    public static void inicialitzarVariables() {

        //Inicialitzarem l'array en nous pilots sense dades
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pilot();
            array[i].setOmplit(false);

        }

    }

    public static void demanarOpcio() {
        Scanner ent = new Scanner(System.in);

        System.out.println("\nMenú de la base de dades");
        System.out.println("-----------------------");
        System.out.println("1. Introduir pilot.");
        System.out.println("2. Modificar pilot.");
        System.out.println("3. Borrar pilot.");
        System.out.println("4. Llistar pilots.");
        System.out.println("5. Recuperar Pilot");
        System.out.println("6. Sortir");

        opcio = ent.skip("[\r\n]*").nextInt();
    }

    public static void tractarOpcio() {

        switch (opcio) {
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
            //5. Per a Recuperar Pilots
            case 5:
                recuperarPilot();
                break;
            //6. Per a Sortir
            case 6:
                System.out.println("Fins Un Altra!!");
                break;
            default:
                System.out.println("\nOpció Incorrecta!");

        }

    }

    public static void introduirPilot() {
        Scanner ent = new Scanner(System.in);

        //Primer Recorrerem l'array fins trobar una casella no omplida o arribar al seu final.
        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);
        //Si no hem arribat al final es perque hem trobat una casella buida (no omplida)
        if (i < array.length) {
            System.out.println("\nNom:");
            array[i].setNom(ent.skip("[\r\n]*").nextLine());
            System.out.println("\nCognom:");
            array[i].setCognom(ent.skip("[\r\n]*").nextLine());
            System.out.println("\nEquip:");
            array[i].setEquip(ent.skip("[\r\n]*").nextLine());
            System.out.println("\nResidencia:");
            array[i].setResidencia(ent.skip("[\r\n]*").nextLine());
            System.out.println("\nEstatura:");
            array[i].setEstatura(ent.skip("[\r\n]*").nextInt());
            System.out.println("\nApodo:");
            array[i].setApodo(ent.skip("[\r\n]*").nextLine());
            System.out.println("\nDorsal:");
            array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
            System.out.println("\nCategoria:");
            array[i].setCategoria(ent.skip("[\r\n]*").nextLine());

            char esHome;
            do {
                System.out.println("Es home(H) o dona(D)?:");
                esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (esHome != 'H' && esHome != 'D');
            array[i].setHome(esHome == 'H');
            array[i].setOmplit(true);
        } else {
            System.out.println("\nNo hi caben mes pilots, si vols ficar mes pilots, esborran algun.1");
        }

    }

    public static void modificarPilot() {
        Scanner ent = new Scanner(System.in);
        Pilot p = null;
        int cont = 1, i = 0;
        p = array[i];

        for (; i < array.length && SiNo != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.format("\nPilot %d:\n", cont++);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols modificar el Pilot(S/N)?;");
                    SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (SiNo != 'S' && SiNo != 'N');
            }
            if (SiNo == 'S') {
                break;
            }
        }
        if (SiNo == 'S') {

            System.out.println("\nNom: " + array[i].getNom());
            do {
                System.out.println("\nVols modificar el Nom? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix el Nou Nom: ");
                array[i].setNom(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nCognom: " + array[i].getCognom());
            do {
                System.out.println("\nVols modificar el Cognom? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix el Nou Cognom: ");
                array[i].setCognom(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nEquip: " + array[i].getEquip());
            do {
                System.out.println("\nVols modificar el Equip? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix el Nou Equip: ");
                array[i].setEquip(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nResidencia: " + array[i].getResidencia());
            do {
                System.out.println("\nVols modificar la Residencia? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix la Nova Residencia: ");
                array[i].setResidencia(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nEstatura: " + array[i].getEstatura());
            do {
                System.out.println("\nVols modificar la estatura?(S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix La Nova Estatura: ");
                array[i].setEstatura(ent.skip("[\r\n]*").nextInt());
            }

            System.out.println("\nApodo: " + array[i].getApodo());
            do {
                System.out.println("\nVols modificar el apodo? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix el Nou Apodo: ");
                array[i].setApodo(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nDorsal: " + array[i].getDorsal());
            do {
                System.out.println("\nVols modificar el dorsal?(S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix el Nou Dorsal: ");
                array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
            }

            System.out.println("\nResidencia: " + array[i].getCategoria());
            do {
                System.out.println("\nVols modificar la Categoria? (S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                System.out.println("Introdueix la Nova Categoria: ");
                array[i].setCategoria(ent.skip("[\r\n]*").nextLine());
            }
            
            
            if (array[i].getHome()) {
                System.out.println("\nÉs Home");
            } else {
                System.out.println("\nÉs Dona");
            }
            do {
                System.out.println("\nVols modificar si es Home o Dona?(S/N):");
                SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (SiNo != 'S' && SiNo != 'N');
            if (SiNo == 'S') {
                char esHome;
                do {
                    System.out.println("Es electrònic?(S/N) ");
                    esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esHome != 'S' && esHome != 'N');
                if (esHome == 's') {
                    p.setHome(true);
                } else {
                    p.setHome(false);
                }
        }
        }
    }

    public static void borrarPilot() {
        char SiNo = ' ';
        Pilot p = null;
        Scanner ent = new Scanner(System.in);
        int i;
        for (i = 0; i < array.length && SiNo != 'F'; i++) {
            p = array[i];
            if (p.isOmplit()) {
                System.out.println(p);
                do {
                    System.out.println("\nVols borrar el Pilot(S/N) o finalitzar (F)?:");
                    SiNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (SiNo != 'S' && SiNo != 'N' && SiNo != 'F');
            }
            if (SiNo == 'S') {
                break;
            }
        }

        if (SiNo == 'S') {
            p.setOmplit(false);
            System.out.println("Pilot borrat");
        } else {
            System.out.println("No s'ha borrat cap Pilot");
        }

    }

    public static void llistaPilot() {
        Scanner ent = new Scanner(System.in);

        boolean algun = false;
        char siNo = 'S';
        int i;
        for (i = 0; i < array.length; i++) {
            Pilot p = array[i];
            if (p.isOmplit()) {
                algun = true;
                System.out.println(p);
                do {
                    System.out.println("\nVols veure mes Pilots(S/N)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (siNo != 'S' && siNo != 'N');
            }
            if (siNo == 'N') {
                break;
            }
        }
        if (!algun) {
            System.out.println("\nNo hi ha Pilots per mostrar");
        }

    }

    public static void recuperarPilot() {
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int cont = 0, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (!array[i].isOmplit()) {
                System.out.format("\nPilot %d:\n", ++cont);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols recuperar el Pilot(S/N) o finalitzem (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }
        if (siNo == 'S') {
            array[i].setOmplit(true);
            System.out.println("Pilot recuperat correctament.");
        } else {
            if (cont == 0) {
                System.out.println("No hi ha Pilots per recuperar");
            } else {
                System.out.println("Pilot no recuperat.");
            }
        }

    }

    public static boolean opcioFinal() {

        return opcio == 6;

    }
}
