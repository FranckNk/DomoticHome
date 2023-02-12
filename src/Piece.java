
abstract class Piece extends Maison {
    boolean Lights = false;
    boolean Fan = false;
    boolean Door = false;
    String NomPiece;
    
    Piece(String nom){
        this.NomPiece = nom;
    }

    // Définition des méthodes comunes dans toutes les pièces
    abstract void OpenLights();
    abstract void CloseLights();
    abstract void OpenFan();
    abstract void CloseFan();
    abstract void OpenDoor();
    abstract void CloseDoor();

    void DisplayStatutPiece() {
        System.out.println("Piece : " + NomPiece);
        System.out.println("Light : " + (Lights ? "ON" : "OFF"));
        System.out.println("Ventilateur : " + (Fan ? "ON" : "OFF"));
      }
}



