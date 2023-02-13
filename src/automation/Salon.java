/*

TITRE          : Classe Salon
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/

package automation;

final public class Salon extends Piece{

    boolean Door = false;
    public Salon(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom du salon 
    }
    /***
     * Fonction permettant d'ouvrir les lumières du salon
     */
    @Override
    public void OpenLights(){
        if(Lights){
            System.out.println("Impossible, déjà allumées...");
            return;
        }
        System.out.println("Allumage des lumières du salon..");
        Lights = true;
    }
    /***
     * Fonction permettant de fermer les lumières du salon
     */
    @Override
    public void CloseLights(){
        if(!Lights){
            System.out.println("Impossible, déjà éteintes...");
            return;
        }
        System.out.println("Extinction des lumières du salon..");
        Lights = false; 
    }
    /***
     * Fonction permettant d'ouvrir la porte du salon.
     */
    public void OpenDoor(){
        if(Door){
            System.out.println("Impossible, déjà ouvert...");
            return;
        }
        System.out.println("Ouverture de la porte du salon..");
        Door = true;
    }
    /***
     * Fonction permettant de fermer la porte du salon
     */
    public void CloseDoor(){
        if(Door){
            System.out.println("Impossible, déjà fermée...");
            return;
        }
        System.out.println("Fermeture de la porte du salon..");
        Door = false; 
    }
    public void DisplayStatutPiece() {
        System.out.println("Piece : " + NomPiece);
        System.out.println("Light : " + (Lights ? "ON" : "OFF"));
        System.out.println("Etat de la porte : " + (Door ? "OUVERT" : "FERME"));
      }
    /**
     * Fonction qui sera exécutée avant l'appel du Gabage Collector de Java, pour libérer la mémoire.
     * 
     */
    protected  void finalize(){
        System.out.println("Désactivation de l'automation du salon...\n");
    }
}