/*

TITRE          : Classe mère
AUTEUR         : Franck Nkeubou Awougang
DATE           : 12/02/2023
DESCRIPTION    : Cette classe défini la maison qui sera rendue automatique.
VERSION        : 0.0.1

*/
package automation;

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

    /*
     * Généreation du String de l'instance de la classe.
     */
    @Override
    public String toString() {
        return "Maison : {" +
            " Pays = " + getPays() + "'" +
            ", Ville = " + getVille() + "'" +
            ", Automatisee = " + (isAutomatisee() ? "OUI" : "NON") +
            " }";
    }

    /**
     * Fonction qui sera exécutée avant l'appel du Gabage Collector de Java, pour libérer la mémoire.
     * 
     */
    protected void finalize(){
        System.out.println("Désactivation de l'automation de la maison...\n");
    }

}
