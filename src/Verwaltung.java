import java.util.Scanner;

public class Verwaltung {
    private Warteschlange warteschlange;
    private WSK<Person> wsk;

    /**
     * Main Methode zur Erschaffung des Verwaltungsobjekts
     */
    public static void main(String[] args){new Verwaltung();}

    /**
     * Konstruktor der Verwaltung. Bietet Optionen zur Erschaffung
     * Linearer Datenstrukturen.
     */
    public Verwaltung() {
        Scanner scanner = new Scanner(System.in);
        this.warteschlange = new Warteschlange();
        this.wsk = new WSK();
        while (true) {
            System.out.println("Lineare Datenstruktur wählen: ");
            System.out.println("[0] Break");
            System.out.println("[1] Warteschlange");
            System.out.println("[2] Warteschlange Knoten");
            System.out.println("[3] Stack");
            System.out.println("[4] List");
            int help = scanner.nextInt();
            scanner.nextLine();
            if (help == 0) {
                break;
            } else if (help == 1) {
                while (true) {
                    System.out.println("Zu verwaltenden Objekttypen wählen: ");
                    System.out.println("[0] Break");
                    System.out.println("[1] Personen");
                    int help1 = scanner.nextInt();
                    scanner.nextLine();
                    if (help1 == 0) {
                        break;
                    } else if (help1 == 1) {
                        while (true) {
                            System.out.println("Aktion waehlen:");
                            System.out.println("[0] Break");
                            System.out.println("[1] Person hinzufuegen");
                            System.out.println("[2] Person entfernen");
                            System.out.println("[3] Datenstruktur ausgeben");
                            int help2 = scanner.nextInt();
                            scanner.nextLine();
                            if (help2 == 0) {
                                break;
                            } else if (help2 == 1) {
                                System.out.println("Namen der Person angeben: ");
                                String name = scanner.nextLine();
                                System.out.println("Voramen der Person angeben: ");
                                String vn = scanner.nextLine();
                                this.warteschlange.hintenanstellen(new ContentType(name, vn));
                            } else if (help2 == 2) {
                                this.warteschlange.verlassen();
                                System.out.println("Die Person hat die Schlange verlassen.");
                            } else if (help2 == 3) {
                                this.warteschlange.ausgeben();
                            }
                        }
                    }
                }

            }
            else if (help == 2) {
                while (true) {
                    System.out.println("Zu verwaltenden Objekttypen wählen: ");
                    System.out.println("[0] Break");
                    System.out.println("[1] Personen");
                    int help1 = scanner.nextInt();
                    scanner.nextLine();
                    if (help1 == 0) {
                        break;
                    } else if (help1 == 1) {
                        while (true) {
                            System.out.println("Aktion waehlen:");
                            System.out.println("[0] Break");
                            System.out.println("[1] Person hinzufuegen");
                            System.out.println("[2] Person entfernen");
                            System.out.println("[3] Datenstruktur ausgeben");
                            int help2 = scanner.nextInt();
                            scanner.nextLine();
                            if (help2 == 0) {
                                break;
                            } else if (help2 == 1) {
                                System.out.println("Namen der Person angeben: ");
                                String name = scanner.nextLine();
                                System.out.println("Voramen der Person angeben: ");
                                String vn = scanner.nextLine();
                                this.warteschlange.hintenanstellen(new ContentType(name, vn));
                            } else if (help2 == 2) {
                                this.warteschlange.verlassen();
                                System.out.println("Die Person hat die Schlange verlassen.");
                            } else if (help2 == 3) {
                                this.warteschlange.ausgeben();
                            }
                        }
                    }
                }
            }
        }
    }
}