public class Stack<ContentType> {
    private Knoten<ContentType> head;


    /**
     * Konstruktor der Klasse Warteschlange
     */
    public Stack() {
        head = null;

    }

    /**
     * Gibt die Datenstruktur aus. ALARM 3TER ZEIGER (LIST)
     */
    void ausgeben(){
        Knoten Help= head;
        do{
            if(Help.getContent() instanceof Person)
                System.out.println(((Person)Help.getContent()).getVN());
            Help= Help.getNext();
        }while(!(Help == null));
    }
    /**
     * Lässt das Objekt die Datenstruktur verlassen
     */
    void pop() {
        if (head == null) return;

        Knoten<ContentType> hilfe = head;
        head = hilfe.getNext();
        hilfe.setNext(null);


    }

    /**
     * gibt den Ersten in der Datenstruktur raus
     * @return
     */
    ContentType top() {
        if (head == null) return null;
        return head.getContent();
    }

    /**
     * fügt eine Person der Datenstruktur hinzu
     * @param pPerson
     */
    void push(ContentType pPerson) {
        Knoten<ContentType> neuerKnoten = new Knoten<ContentType>(pPerson);
        if(IstLeer()) {
        head = neuerKnoten;
        }else{
            neuerKnoten.setNext(head);
            head = neuerKnoten;
        }
    }

    /**
     * überprüft ob die Datenstruktur leer ist
     * @return
     */
    boolean IstLeer() {
        return head == null;
    }

    /**
     * Speichert die Person im ersten Platz der Datenstruktur
     * @param pK
     */
    void setHead(Knoten<ContentType> pK) {
        head = pK;
    }




    /**
     * gibt den Ersten zurück
     * @return erster
     */
    Knoten<ContentType> getHead() {
        return head;
    }


}

