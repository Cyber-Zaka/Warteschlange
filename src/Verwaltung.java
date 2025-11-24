import java.util.Scanner;

public class Verwaltung {
    private Warteschlange warteschlange;
    private WSK wsk;

    /**
     * Main Methode zur Erschaffung des Verwaltungsobjekts
     */
    public static void main(){new Verwaltung();}

    /**
     * Konstruktor der Verwaltung. Bietet Optionen zur Erschaffung
     * Linearer Datenstrukturen.
     */
    public Verwaltung() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Lineare Datenstruktur wählen: ");
            System.out.println("[0] Break");
            System.out.println("[1] Warteschlange");
            System.out.println("[2] Warteschlange Knoten");
            System.out.println("[3] Stack");
            System.out.println("[4] List");
            int help= scanner.nextInt();
            scanner.nextLine();
            if(help==0){
                break;
            } else if(help==1){
                System.out.println("Zu verwaltenden Objekttypen wählen: ");

            }
        }
    }
}