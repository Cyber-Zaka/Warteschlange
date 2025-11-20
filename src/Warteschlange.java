public class Warteschlange {
    private Person erster;
    private Person letzter;
    //private Warteschlange drivein;

    Warteschlange(){
       // drivein = new Warteschlange;
        erster = null;

    }

    /**
     * Lässt das Objekt die Schlange verlassen
     */
    void verlassen(){
        Person hilfe;
        hilfe= erster;
        erster= hilfe.getNachfolger();
        hilfe.setNachfolger(null);
        hilfe= null;
    }

    /**
     * gibt den Ersten in der Schlange raus
     * @return
     */
    Person getErstePersonInSchlange(){
        return erster;
    }

    /**
     * fügt eine Person der schlange hinzu
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
     * überprüft ob die Schlange leer ist
     * @return
     */
    boolean IstLeer(){
        if (erster==null){
            return true;
        }
        return false;
    }

    /**
     * Speichert die Person im ersten Platz der schlange
     * @param pP
     */
    void setErster(Person pP){
        this.erster=pP;
    }

    /**
     * Speichert die Person im letzten Platz der schlange
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
