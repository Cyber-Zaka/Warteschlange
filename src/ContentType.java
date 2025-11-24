public class ContentType {
    String name;
    String vorname;
    ContentType Nachfolger;


    ContentType(String pn, String vn){
    setName(pn);
    setVorname(vn);
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
    void setNachfolger(ContentType pPerson){Nachfolger=pPerson;}

    /**
     * Gibt den Namen zurück
     * @return
     */
    String getName(){return name;}

    /**
     * Gibt Vollen Namen zurück
     * @return VN
     */
    String getFullName(){String VN= vorname+" "+ name;return VN;}
    /**
     * Gibt den Vornamen zurück
     * @return
     */
    String getVorname(){return vorname;}
    /**
     * Gibt den Nachfolger zurück
     * @return
     */
    ContentType getNachfolger(){return Nachfolger;}
}
