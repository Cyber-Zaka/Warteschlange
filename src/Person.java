public class Person {
    String name;
    String vorname;
    Person Nachfolger;


    Person(){

    }



    /**
     * Setzt den Namen auf pn
     * @param pn
     *
     */
    void setName(String pn){name= pn;}
    /**
     * Setzt den Vornamen auf pv
     * @param pv
     *
     */
    void setVorname(String pv){vorname=pv;}
    /**
     * Setzt den VollenNamen auf pn und pv
     * @param pn, pv
     *
     */
    void setVN(String pn, String pv){name=pn; vorname=pv;}
    /**
     * Setzt den Nachfolger auf pPerson
     * @param pPerson
     *
     */
    void setNachfolger(Person pPerson){Nachfolger=pPerson;}

    /**
     * Gibt den Namen zurück
     * @return
     */
    String getName(){return name;}

    /**
     * Gibt den Vornamen zurück
     * @return
     */
    String getVorname(){return vorname;}
    /**
     * Gibt den Nachfolger zurück
     * @return
     */
    Person getNachfolger(){return Nachfolger;}
}
