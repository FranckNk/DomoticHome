
abstract class Piece extends Maison {
    boolean Light = false;
    boolean Fan = false;
    boolean Door = false;
    String NomPiece;
    
    Piece(String nom){
        this.NomPiece = nom;
    }

    abstract void turnLightOn();
    abstract void turnLightOff();
    abstract void OpenFan();
    abstract void CloseFan();
    abstract void OpenDoor();
    abstract void CloseDoor();

    void displayRoomStatus() {
        System.out.println("Room : " + NomPiece);
        System.out.println("Light : " + (Light ? "ON" : "OFF"));
        System.out.println("Ventilateur : " + (Fan ? "ON" : "OFF"));
      }
}


