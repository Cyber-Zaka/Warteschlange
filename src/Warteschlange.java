public class Warteschlange {
    private Person erster;
    private Person letzter;
    //private Warteschlange drivein;

    /**
     * Konstruktor der Klasse Warteschlange
     */
    Warteschlange(){
       // drivein = new Warteschlange;
        erster = null;

    }

    /**
     * Lässt das Objekt die Datenstruktur verlassen
     */
    void verlassen(){
        Person hilfe;
        hilfe= erster;
        erster= hilfe.getNachfolger();
        hilfe.setNachfolger(null);
        hilfe= null;
    }

    /**
     * gibt den Ersten in der Datenstruktur raus
     * @return
     */
    Person getErstePersonInSchlange(){
        return erster;
    }

    /**
     * fügt eine Person der Datenstruktur hinzu
     * @param pPerson
     */
    void hintenanstellen(Person pPerson)
    {
        if(IstLeer()){
            setErster(pPerson);
            setLetzter(pPerson);
        } else  {
            letzter.setNachfolger(pPerson);
            setLetzter(pPerson);
        }
    }

    /**
     * überprüft ob die Datenstruktur leer ist
     * @return
     */
    boolean IstLeer(){
        if (erster==null){
            return true;
        }
        return false;
    }

    /**
     * Speichert die Person im ersten Platz der Datenstruktur
     * @param pP
     */
    void setErster(Person pP){
        this.erster=pP;
    }

    /**
     * Speichert die Person im letzten Platz der Datenstruktur
     * @param pP
     */
    public void setLetzter(Person pP) {
        this.letzter = pP;
    }

    /**
     * gibt den Ersten zurück
     * @return erster
     */
    Person getErster(){
        return erster;
    }

    /**
     * gibt den letzten zurück
     * @return letzter
     */
    Person getLetzter(){
        return letzter;
    }

}
