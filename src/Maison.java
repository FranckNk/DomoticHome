/*

TITRE          : Classe mère
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe défini la maison qui sera rendue automatique.
VERSION        : 0.0.1

*/

public class Maison {
    final String pays = "Canada";
    final String Ville = "Bathurst";
    boolean Automatisee = false;

    public Maison() {
        this.Automatisee = true;
    }

    public String getPays() {
        return this.pays;
    }

    public String getVille() {
        return this.Ville;
    }

    public boolean isAutomatisee() {
        return this.Automatisee;
    }

    @Override
    public String toString() {
        return "Maison : {" +
            " Pays = " + getPays() + "'" +
            ", Ville = " + getVille() + "'" +
            ", Automatisee = " + (isAutomatisee() ? "OUI" : "NON") +
            " }";
    }
}
