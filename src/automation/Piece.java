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



