/*

TITRE          : Classe Cuisine
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/

package automation;
// import Objets.*;

public final class Cuisine extends Piece{
    // SmokeDetection SmokeState = new SmokeDetection("Cuisine");
    boolean Chauffage = false;

    public Cuisine(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom de la cuisine 
    }

    /**
     * Fonction permettant d'ouvrir les lumières de la cuisine
     */
    @Override
    public void OpenLights(){
        if(Lights){
            throw new IllegalStateException();
        }
        System.out.println("Allumage des lumières de la cuisine..");
        Lights = true;
    }
    /***
     * Fonction permettant de fermer les lumières de la cuisine
     */
    @Override
    public void CloseLights(){
        if(!Lights){
            throw new IllegalStateException();
        }
        System.out.println("Extinction des lumières de la cuisine..");
        Lights = false; 
    }
    /***
     * Fonction permettant d'ouvrir le ventilateur de la cuisine
     */
    public void OpenChauffage(){
        if(Chauffage){
            throw new IllegalStateException();

        }
        System.out.println("Activation du chauffage de la cuisine..");
        Chauffage = true;
    }
    /***
     * Fonction permettant de désactiver le ventilateur de la cuisine
     */
    public void CloseChauffage(){
        if(!Chauffage){
            throw new IllegalStateException();
        }
        System.out.println("Arrêt du chauffage de la cuisine..");
        Chauffage = false; 
    }
    public void DisplayStatutPiece() {
        System.out.println("Piece : " + NomPiece);
        System.out.println("Light : " + (Lights ? "ON" : "OFF"));
        System.out.println("Chauffage : " + (Chauffage ? "ON" : "OFF"));
    }
    /**
     * Fonction qui sera exécutée avant l'appel du Gabage Collector de Java, pour libérer la mémoire.
     * 
     */
    protected void finalize(){
        System.out.println("Désactivation de l'automation de la cuisine...\n");
    }

}