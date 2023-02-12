/*

TITRE          : Classe Cuisine
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/

class Cuisine extends Piece{

    Cuisine(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom de la cuisine 
    }
    /***
     * Fonction permettant d'ouvrir les lumières de la cuisine
     */
    @Override
    void OpenLights(){
        if(Lights){
            System.out.println("Impossible, déjà allumées...");
            return;
        }
        System.out.println("Allumage des lumières de la cuisine..");
        Lights = true;
    }
    /***
     * Fonction permettant de fermer les lumières de la cuisine
     */
    @Override
    void CloseLights(){
        if(!Lights){
            System.out.println("Impossible, déjà éteintes...");
            return;
        }
        System.out.println("Extinction des lumières de la cuisine..");
        Lights = false; 
    }
    /***
     * Fonction permettant d'ouvrir le ventilateur de la cuisine
     */
    @Override
    void OpenFan(){
        if(Fan){
            System.out.println("Impossible, déjà activé...");
            return;
        }
        System.out.println("Activation du ventilateur de la cuisine..");
        Fan = true;
    }
    /***
     * Fonction permettant de désactiver le ventilateur de la cuisine
     */
    @Override
    void CloseFan(){
        if(!Fan){
            System.out.println("Impossible, déjà arrêté...");
            return;
        }
        System.out.println("Arrêt du ventilateur de la cuisine..");
        Fan = false; 
    }
    /***
     * Fonction permettant d'ouvrir la porte de la cuisine.
     */
    @Override
    void OpenDoor(){
        if(Door){
            System.out.println("Impossible, déjà ouvert...");
            return;
        }
        System.out.println("Ouverture de la porte de la cuisine..");
        Door = true;
    }
    /***
     * Fonction permettant de fermer la porte de la cuisine
     */
    @Override
    void CloseDoor(){
        if(Door){
            System.out.println("Impossible, déjà fermée...");
            return;
        }
        System.out.println("Fermeture de la porte de la cuisine..");
        Door = false; 
    }

}