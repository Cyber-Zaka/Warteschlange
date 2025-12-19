public class List<ContentType> {
    private Knoten<ContentType> first;
    private Knoten<ContentType> last;
    private Knoten<ContentType> current;

    /**
     * Eine leere Liste wird erzeugt.
     */
    List(){
        first= null;
        last = null;
        current = null;
    }

    /**
     *Die Anfrage liefert den Wert true, wenn die Liste keine Objekte enthält,
     *sonst liefert sie den Wert false.
     * @return isEmpty
     */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     *Die Anfrage liefert den Wert true,
     *wenn es ein aktuelles Objekt gibt, sonst liefert sie den Wert false.
     * @return
     */
    public boolean hasAccess(){
        return !(current.getContent()==null);
    }

    /**
     *Falls die Liste nicht leer ist, wird das
     *erste Objekt der Liste aktuelles Objekt. Ist die Liste leer, geschieht nichts.
     */
    public void toFirst(){
        if(isEmpty()==false){
        current= first;
        }
    }

    /**
     *Falls die Liste nicht leer ist, wird das
     * letzte Objekt der Liste aktuelles Objekt. Ist die Liste leer, geschieht nichts.
     */
    public void toLast(){
        if(isEmpty()==false) {
            current = last;
        }
    }

    /**
     * Falls die Liste nicht leer ist, es ein aktuelles Objekt gibt und dieses
     * nicht das letzte Objekt der Liste ist, wird das dem aktuellen Objekt in
     * der Liste folgende Objekt zum aktuellen Objekt,
     * andernfalls gibt es nach Ausführung des Auftrags kein aktuelles Objekt,
     * d.h. hasAccess() liefert den Wert false.
     */
    public void next(){
        if(isEmpty()==false) {
            if(!(current==last)) {
                current = current.getNext();
            }else{
                current = null;
            }
        }
    }

    /**
     * Falls es ein aktuelles Objekt gibt (hasAccess() == true),
     * wird ein neues Objekt pContent vor dem aktuellen Objekt in die Liste eingefügt.
     * Das aktuelle Objekt bleibt unverändert. Falls die Liste leer ist und es somit
     * kein aktuelles Objekt gibt (hasAccess() == false), wird pContent in die Liste
     * eingefügt und es gibt weiterhin kein aktuelles Objekt. Falls es kein aktuelles
     * Objekt gibt (hasAccess() == false) und die Liste nicht leer ist oder
     * pContent == null ist, bleibt die Liste unverändert.
     * @param pContent
     */
    public void insert(ContentType pContent){
        Knoten<ContentType> newNode = new Knoten<>(pContent);
        if (isEmpty()) {
            first = current = newNode;
        } else if (current == first) {
            newNode.setNext(first);
            first = newNode;
        } else if (current != null) {
            // finde den vorherigen Knoten
            Knoten<ContentType> prev = first;
            while (prev.getNext() != current) {
                prev = prev.getNext();
            }
            newNode.setNext(current);
            prev.setNext(newNode);
        }
    }

    /**
     * Ein neues Objekt pContent wird am Ende der Liste eingefügt.
     * Das aktuelle Objekt bleibt unverändert. Wenn die Liste leer ist,
     * wird das Objekt pContent in die Liste eingefügt und es gibt weiterhin kein
     * aktuelles Objekt (hasAccess() == false). Falls pContent gleich null ist,
     * bleibt die Liste unverändert.
     * @param pContent
     */
    public void append(ContentType pContent){
        Knoten<ContentType> neuerKnoten= new Knoten<ContentType>(pContent);

        if(isEmpty()==true) {
            first= neuerKnoten;
        } else if (hasAccess()== true){
            last.setNext(neuerKnoten);
            last = neuerKnoten;
        }
    }

    /**
     * Falls es ein aktuelles Objekt gibt (hasAccess() == true),
     * wird das aktuelle Objekt gelöscht und das Objekt hinter dem gelöschten
     * Objekt wird zum aktuellen Objekt. Wird das Objekt, das am Ende der Liste steht,
     * gelöscht, gibt es kein aktuelles Objekt mehr (hasAccess() == false).
     * Wenn die Liste leer ist oder es kein aktuelles Objekt gibt (hasAccess() == false),
     * bleibt die Liste unverändert.
     */
    public void remove(){
        if(hasAccess() && !isEmpty()){
            Knoten<ContentType> help = current;
            current = first;
            while (! (help==current.getNext())){
                current = current.getNext();
            }
            current.setNext(help.getNext());
            help.setNext(null);
            help=null;
            if(current == last){
                help = current;
                current = first;
                while (! (help==current.getNext())){
                    current = current.getNext();
                }
                last = current;
                help=null;
                current= null;
            }
        }
    }

    /**
     * Die Liste pList wird an die Liste angehängt.
     * Anschließend wird pList eine leere Liste.
     * Das aktuelle Objekt bleibt unverändert.
     * Falls es sich bei der Liste und pList um dasselbe Objekt handelt,
     * pList == null oder eine leere Liste ist, bleibt die Liste unverändert.
     * @param pList
     */
    public void concat(List<ContentType> pList){
        Knoten<ContentType> help = last;
        Knoten<ContentType> help1 = pList.first;
        while(!(help.getNext()==null)) {
            help.setNext(help1);
            help= help.getNext();
            help1 = help1.getNext();
        }
        last = help;
        pList= null;

    }
    /**
     * Falls es ein aktuelles Objekt gibt (hasAccess() == true),
     * wird das aktuelle Objekt zurückgegeben.
     * Andernfalls (hasAccess() == false) gibt die Anfrage den Wert null zurück.
     * @return
     */
    public ContentType getContent() {
        if (hasAccess() == true) {
            return current.getContent();
        } else {
            return null;
        }
    }
}
