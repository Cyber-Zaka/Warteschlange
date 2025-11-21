public class WSK {

    private Knoten<Person> erster;
    private Knoten<Person> letzter;

    /**
     * Konstruktor der Klasse Warteschlange
     */
    public WSK() {
        erster = null;
        letzter = null;
    }

    /**
     * Lässt das Objekt die Datenstruktur verlassen
     */
    void verlassen() {
        if (erster == null) return;

        Knoten<Person> hilfe = erster;
        erster = hilfe.getNext();
        hilfe.setNext(null);

        // wenn die Schlange leer wird, letzten auch null setzen
        if (erster == null) {
            letzter = null;
        }
    }

    /**
     * gibt den Ersten in der Datenstruktur raus
     * @return
     */
    Person getErstePersonInSchlange() {
        if (erster == null) return null;
        return erster.getContent();
    }

    /**
     * fügt eine Person der Datenstruktur hinzu
     * @param pPerson
     */
    void hintenanstellen(Person pPerson) {
        Knoten<Person> neuerKnoten = new Knoten<>(pPerson);

        if (IstLeer()) {
            erster = neuerKnoten;
            letzter = neuerKnoten;
        } else {
            letzter.setNext(neuerKnoten);
            letzter = neuerKnoten;
        }
    }

    /**
     * überprüft ob die Datenstruktur leer ist
     * @return
     */
    boolean IstLeer() {
        return erster == null;
    }

    /**
     * Speichert die Person im ersten Platz der Datenstruktur
     * @param pK
     */
    void setErster(Knoten<Person> pK) {
        erster = pK;
    }

    /**
     * Speichert die Person im letzten Platz der Datenstruktur
     * @param pK
     */
    public void setLetzter(Knoten<Person> pK) {
        letzter = pK;
    }

    /**
     * gibt den Ersten zurück
     * @return erster
     */
    Knoten<Person> getErster() {
        return erster;
    }

    /**
     * gibt den letzten zurück
     * @return letzter
     */
    Knoten<Person> getLetzter() {
        return letzter;
    }
}