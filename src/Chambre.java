/*

TITRE          : Classe Chambre
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/



class Chambre extends Piece{

    Chambre(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom de la chambre 
    }
    /***
     * Fonction permettant d'ouvrir les lumières de la chambre
     */
    @Override
    void OpenLights(){
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
    void CloseLights(){
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
    @Override
    void OpenFan(){
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
    @Override
    void CloseFan(){
        if(!Fan){
            System.out.println("Impossible, déjà arrêté...");
            return;
        }
        System.out.println("Arrêt du ventilateur de la chambre..");
        Fan = false; 
    }
    /***
     * Fonction permettant d'ouvrir la porte de la chambre.
     */
    @Override
    void OpenDoor(){
        if(Door){
            System.out.println("Impossible, déjà ouvert...");
            return;
        }
        System.out.println("Ouverture de la porte de la chambre..");
        Door = true;
    }
    /***
     * Fonction permettant de fermer la porte de la chambre
     */
    @Override
    void CloseDoor(){
        if(Door){
            System.out.println("Impossible, déjà fermée...");
            return;
        }
        System.out.println("Fermeture de la porte de la chambre..");
        Door = false; 
    }

}