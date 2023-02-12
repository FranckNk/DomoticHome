/*

TITRE          : Classe mère
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe défini la maison qui sera rendue automatique.
VERSION        : 0.0.1

*/

public class Maison {
    String pays;
    String Ville;
    boolean Automatisee = false;

    public Maison(String pays, String Ville) {
        this.pays = pays;
        this.Ville = Ville;
        this.Automatisee = true;
    }

    public Maison() {
    }

    public Maison(String pays, String Ville, boolean Automatisee) {
        this.pays = pays;
        this.Ville = Ville;
        this.Automatisee = Automatisee;
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return this.Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public boolean isAutomatisee() {
        return this.Automatisee;
    }

    @Override
    public String toString() {
        return "{" +
            " pays='" + getPays() + "'" +
            ", Ville='" + getVille() + "'" +
            ", Automatisee='" + isAutomatisee() + "'" +
            "}";
    }
}
