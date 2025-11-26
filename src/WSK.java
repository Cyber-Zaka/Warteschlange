public class WSK <ContentType>{
    private Knoten<ContentType> erster;
    private Knoten<ContentType> letzter;

    /**
     * Konstruktor der Klasse Warteschlange
     */
    public WSK() {
        erster = null;
        letzter = null;
    }

    /**
     * Gibt die Datenstruktur aus
     */
    void ausgeben(){
        Knoten Help= erster;
        do{
            System.out.println(Help.getContent().getClass());
            Help= Help.getClass();
        }while(!(Help == null));
    }
    /**
     * Lässt das Objekt die Datenstruktur verlassen
     */
    void verlassen() {
        if (erster == null) return;

        Knoten<ContentType> hilfe = erster;
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
    ContentType getErstePersonInSchlange() {
        if (erster == null) return null;
        return erster.getContent();
    }

    /**
     * fügt eine Person der Datenstruktur hinzu
     * @param pPerson
     */
    void hintenanstellen(ContentType pPerson) {
        Knoten<ContentType> neuerKnoten = new Knoten<>(pPerson);

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
    void setErster(Knoten<ContentType> pK) {
        erster = pK;
    }

    /**
     * Speichert die Person im letzten Platz der Datenstruktur
     * @param pK
     */
    public void setLetzter(Knoten<ContentType> pK) {
        letzter = pK;
    }

    /**
     * gibt den Ersten zurück
     * @return erster
     */
    Knoten<ContentType> getErster() {
        return erster;
    }

    /**
     * gibt den letzten zurück
     * @return letzter
     */
    Knoten<ContentType> getLetzter() {
        return letzter;
    }
}