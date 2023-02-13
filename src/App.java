/*

TITRE          : Classe permettant de tester notre maison automatique
AUTEUR         : Franck Nkeubou Awougang
DATE           : 13/02/2023
DESCRIPTION    : En utilisant le package automation, on va pourvoir testesr les classes écrites
VERSION        : 0.0.1

*/

import automation.*;
import java.util.Scanner;

public class App {

    /**
     * Fonction pour lire un entier entre deux bornes précises  
     * @param borneA borne inférieure
     * @param borneB borne supérieure
     * @return retourne un entier vérifié, compris entre BorneA et BorneB
     */
    public static int LireEntier(int borneA, int borneB) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        boolean status = false;
        do {
            System.out.print("> ");
            String Chaine = "";
            if(sc.hasNextLine())
                Chaine = sc.nextLine();
            try {
                input = Integer.parseInt(Chaine);
                // System.out.println(input + " is a valid integer");
                status = true;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect... Recommencez !");
                status = false;
            }
        } while (!status || input < borneA || input > borneB);
        //sc.close();
        return input;
    }
    /***
     * Fonction pour faire une pause à l'écran... Bizarre, mais c'est juste un "scan" dans le vide.
     */
    static void Pause(){
        System.out.print("\nPress any key to continue...");
        Scanner pause = new Scanner(System.in);
        pause.nextLine();
    }
    /***
     * Fonction pour afficher le menu des options et validation du choix de l'utilisateur.
     * @return le choix du menu
     */
    static int Menu1(){
        int choice;
        // Effacer l'écran
        System.out.print("\033[H\033[2J");
        System.out.println("Que voulez-vous faire ?\n\n1. Afficher l'état de la chambre.\n" + 
        "2. Afficher l'état de la cuisine.\n3. Affichier l'état du salon.\n4. Contrôler une pièce.\n5. Sortir.");
        // Vérification de l'entrée du l'utilisateur.
        choice = LireEntier(1, 5);
        return choice;
    }

    /***
     * Fonction pour afficher le menu des options et validation du choix de l'utilisateur.
     * @return le choix du menu
     */
    static int Menu2(){
        int choice;
        // Effacer l'écran
        System.out.print("\033[H\033[2J");
        System.out.println("Que voulez-vous faire ?\n\n1. Allumer les lumières.\n" + 
        "2. Eteindre les lumières.\n3. Activer le chauffage de la cuisine.\n4. Désactiver le chauffage de la cuisine.\n" + 
        "5. Ouvrir la porte du salon.\n6. Fermer la porte du salon.\n7. Actionner le Fan de la chambre.\n8. Désactiver le Fan\n9. Menu Principal.");
        // Vérification de l'entrée du l'utilisateur.
        choice = LireEntier(1, 9);
        return choice;
    }

    public static void main(String[] args) throws Exception {
        int choix = 0, choix2 = 0;
        // Création d'une maison contenant une chambre, un salon et une cuisine.
        Chambre maChambre = new Chambre("ChambreFranck");
        Cuisine maCuisine = new Cuisine("CuisineFranck");
        Salon monSalon = new Salon("SalonFranck");
        do{
            // Effectuons les actions du premier menu
            choix = Menu1();
            switch (choix){
                case 1 :
                    maChambre.DisplayStatutPiece();
                    Pause();
                    break;
                case 2 : 
                    maCuisine.DisplayStatutPiece();
                    Pause();
                    break;
                case 3 : 
                    monSalon.DisplayStatutPiece();
                    Pause();
                    break;
                case 4 : {
                    do{
                        // Les actions pour contrôler les pièces.
                        choix2 = Menu2();
                        switch (choix2){
                            case 1 :
                                try {
                                    maChambre.OpenLights();
                                    maCuisine.OpenLights();
                                    monSalon.OpenLights();
                                } catch (IllegalStateException e) {
                                    System.out.println("Impossible d'allumer les lumières.");
                                }finally{
                                    System.out.println("Commande exécutée...");
                                }
                                Pause();
                                break;
                            case 2 :
                                try {
                                    maChambre.CloseLights();
                                    maCuisine.CloseLights();
                                    monSalon.CloseLights();
                                } catch (IllegalStateException e) {
                                    System.out.println("Impossible d'éteindre les lumières.");
                                }finally{
                                    System.out.println("Commande exécutée...");
                                }
                                Pause();
                                break;
                            case 3 :
                                try {
                                    maCuisine.OpenChauffage();
                                } catch (IllegalStateException e) {
                                    System.out.println("Impossible, déjà allumé..."); 
                                }finally{
                                    System.out.println("Commande exécutée...");
                                }
                                Pause();
                                break;
                            case 4 :                                
                                try {
                                    maCuisine.CloseChauffage();
                                } catch (IllegalStateException e) {
                                    System.out.println("Impossible, déjà éteint..."); 
                                }finally{
                                    System.out.println("Commande exécutée...");
                                }
                                Pause();
                                break;
                            case 5 :
                                monSalon.OpenDoor();
                                Pause();
                                break;
                            case 6 :
                                monSalon.CloseDoor();
                                Pause();
                                break;
                            case 7 :
                                maChambre.OpenFan();
                                Pause();
                                break;
                            case 8 :
                                maChambre.CloseFan();
                                Pause();
                                break;
                        }
                    }while(choix2 != 9);
                    
                }
                    break;
                default : 
                    System.out.println("\nMerci, à bientôt...\n");

                    break;
            }
        }while(choix != 5);
        // Test du finalise
        maChambre = null;
        maCuisine = null;
        monSalon = null;
        System.gc();
    }
}
