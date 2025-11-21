public class Knoten <ContentType>{
    private ContentType content;
    private Knoten next;

    /**
     * Konstruktor der Klasse Knoten
     * @param pContent
     */
    public Knoten(ContentType pContent){
    this.content = pContent;
    }

    /**
     * gibt den nächsten Knoten zurück
     * @return next
     */
    Knoten getnext(){return next;}

    /**
     * gibt die Art der zu verwaltenden Objekte raus
     * @return content
     */
    ContentType getContent(){
        return content;
    }

    /**
     * fügt eine Objekt der Datenstruktur hinzu
     * @param pNext
     */
    void setNext(Knoten pNext)
    {
        next = pNext;
    }



}
