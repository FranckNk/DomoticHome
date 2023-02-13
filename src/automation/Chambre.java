/*

TITRE          : Classe Chambre
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/
package automation;

final public class Chambre extends Piece{
    
    boolean Fan = false;

    public Chambre(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom de la chambre 
    }
    /***
     * Fonction permettant d'ouvrir les lumières de la chambre
     */
    @Override
    public void OpenLights(){
        if(Lights){
            System.out.println("Impossible, déjà allumées...");
            return;
        }
        System.out.println("Allumage des lumières de la chambre..");
        Lights = true;
    }
    /***
     * Fonction permettant de fermer les lumières de la chambre
     */
    @Override
    public void CloseLights(){
        if(!Lights){
            System.out.println("Impossible, déjà éteintes...");
            return;
        }
        System.out.println("Extinction des lumières de la chambre..");
        Lights = false; 
    }
    /***
     * Fonction permettant d'ouvrir le ventilateur de la chambre
     */
    public void OpenFan(){
        if(Fan){
            System.out.println("Impossible, déjà activé...");
            return;
        }
        System.out.println("Activation du ventilateur de la chambre..");
        Fan = true;
    }
    /***
     * Fonction permettant de désactiver le ventilateur de la chambre
     */
    public void CloseFan(){
        if(!Fan){
            System.out.println("Impossible, déjà arrêté...");
            return;
        }
        System.out.println("Arrêt du ventilateur de la chambre..");
        Fan = false; 
    }
    /**
     * Foncton pour afficher toutes les informations de la pièce : 
     * La pièce est la chambre
     */
    public void DisplayStatutPiece() {
        System.out.println("Piece : " + NomPiece);
        System.out.println("Light : " + (Lights ? "ON" : "OFF"));
        System.out.println("Ventilateur : " + (Fan ? "ON" : "OFF"));
      }
    /**
     * Fonction qui sera exécutée avant l'appel du Gabage Collector de Java, pour libérer la mémoire.
     * 
     */
    protected void finalize(){
        System.out.println("Désactivation de l'automation de la chambre...\n");
    }
}