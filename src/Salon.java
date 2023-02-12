/*

TITRE          : Classe Salon
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe hérite de "Piece" car c'est une pièce de la maison.
VERSION        : 0.0.1

*/

final class Salon extends Piece{

    Salon(String nom) {
        super(nom); // Appel du constructeur de la classe "Piece" avec le nom du salon 
    }
    /***
     * Fonction permettant d'ouvrir les lumières du salon
     */
    @Override
    void OpenLights(){
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
    void CloseLights(){
        if(!Lights){
            System.out.println("Impossible, déjà éteintes...");
            return;
        }
        System.out.println("Extinction des lumières du salon..");
        Lights = false; 
    }
    /***
     * Fonction permettant d'ouvrir le ventilateur du salon
     */
    @Override
    void OpenFan(){
        if(Fan){
            System.out.println("Impossible, déjà activé...");
            return;
        }
        System.out.println("Activation du ventilateur du salon..");
        Fan = true;
    }
    /***
     * Fonction permettant de désactiver le ventilateur du salon
     */
    @Override
    void CloseFan(){
        if(!Fan){
            System.out.println("Impossible, déjà arrêté...");
            return;
        }
        System.out.println("Arrêt du ventilateur du salon..");
        Fan = false; 
    }
    /***
     * Fonction permettant d'ouvrir la porte du salon.
     */
    @Override
    void OpenDoor(){
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
    @Override
    void CloseDoor(){
        if(Door){
            System.out.println("Impossible, déjà fermée...");
            return;
        }
        System.out.println("Fermeture de la porte du salon..");
        Door = false; 
    }

}