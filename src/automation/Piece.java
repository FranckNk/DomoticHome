/*

TITRE          : Classe Pièce, qui représente chaque pièce de la maison
AUTEUR         : Franck Nkeubou Awougang
DATE           : 13/02/2023
DESCRIPTION    : Donner une description du programme
VERSION        : 0.0.1

*/



package automation;

abstract public class Piece extends Maison {
    boolean Lights = false;
    String NomPiece;
    
    Piece(String nom){
        this.NomPiece = nom;
    }

    // Définition des méthodes comunes dans toutes les pièces
    public abstract void OpenLights();
    public abstract void CloseLights();
    /**
     * Fonction pour afficher toutes les informations sur la pièce
     */
    abstract public void DisplayStatutPiece();
}



