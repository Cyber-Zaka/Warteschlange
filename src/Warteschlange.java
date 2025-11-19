public class Warteschlange {
    private Person erster;
    private Person letzter;

    Warteschlange(){
        erster = null;

    }

    /**
     * Lässt das Objekt die Schlange verlassen
     */
    void verlassen(){

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
    void hintenanstellen(Person pPerson){

    }

    /**
     * überprüft ob die Schlange leer ist
     * @return
     */
    boolean IstLeer(){
        return true;
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
    Person getErster(){
        return erster;
    }
    Person getLetzter(){
        return letzter;
    }

}
