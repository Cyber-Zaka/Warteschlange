public class Warteschlange {
    private ContentType erster;
    private ContentType letzter;
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
        ContentType hilfe;
        hilfe= erster;
        erster= hilfe.getNachfolger();
        hilfe.setNachfolger(null);
        hilfe= null;
    }

    /**
     * gibt den Ersten in der Datenstruktur raus
     * @return
     */
    ContentType getErstePersonInSchlange(){
        return erster;
    }

    /**
     * Gibt die Datenstruktur aus
     */
    void ausgeben(){
        ContentType Help= erster;
        do{
            System.out.println(Help.getFullName());
            Help= Help.getNachfolger();
        }while(!(Help == null));
    }
    /**
     * fügt eine Person der Datenstruktur hinzu
     * @param pPerson
     */
    void hintenanstellen(ContentType pPerson)
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
    void setErster(ContentType pP){
        this.erster=pP;
    }

    /**
     * Speichert die Person im letzten Platz der Datenstruktur
     * @param pP
     */
    public void setLetzter(ContentType pP) {
        this.letzter = pP;
    }

    /**
     * gibt den Ersten zurück
     * @return erster
     */
    ContentType getErster(){
        return erster;
    }

    /**
     * gibt den letzten zurück
     * @return letzter
     */
    ContentType getLetzter(){
        return letzter;
    }

}
