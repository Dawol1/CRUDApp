import java.util.Scanner;

public class Menu {

    private LodowkaSerwis lodowkaSerwis;
    private PralkaSerwis pralkaSerwis;
    private ZmywarkaSerwis zmywarkaSerwis;

    public Menu(LodowkaSerwis lodowkaSerwis, PralkaSerwis pralkaSerwis, ZmywarkaSerwis zmywarkaSerwis) {
        this.lodowkaSerwis = lodowkaSerwis;
        this.pralkaSerwis = pralkaSerwis;
        this.zmywarkaSerwis = zmywarkaSerwis;
    }

    public void menuStart() {
        Scanner scanner = new Scanner(System.in);
        boolean dziala = true;

        while (dziala) {
            wyswietlMenuGlowne();
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    menuLodowka();
                    break;
                case 2:
                    menuPralka();
                    break;
                case 3:
                    menuZmywarka();
                    break;
                case 0:
                    dziala = false;
                    break;
            }
        }
    }

    public void menuLodowka() {
        Scanner scanner = new Scanner(System.in);
        boolean dziala = true;

        while (dziala) {
            wyswietlMenuLodowek();
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    lodowkaSerwis.dodajLodowke();
                    break;
                case 2:
                    lodowkaSerwis.wyswietlLodowki();
                    break;
                case 3:
                    lodowkaSerwis.usunLodowke();
                    break;
                case 4:
                    lodowkaSerwis.zapiszListeLodowek();
                    break;
                case 5:
                    lodowkaSerwis.odczytajDoListyLodowek();
                    break;
                case 0:
                    dziala = false;
                    break;
            }
        }
    }

    public void menuPralka() {
        Scanner scanner = new Scanner(System.in);
        boolean dziala = true;

        while (dziala) {
            wyswietlMenuPralek();
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    pralkaSerwis.dodajPralke();
                    break;
                case 2:
                    pralkaSerwis.wyswietlPralki();
                    break;
                case 3:
                    pralkaSerwis.usunPralke();
                    break;
                case 4:
                    pralkaSerwis.zapiszListePralek();
                    break;
                case 5:
                    pralkaSerwis.odczytajDoListyPralek();
                    break;
                case 0:
                    dziala = false;
                    break;
            }
        }
    }

    public void menuZmywarka() {
        Scanner scanner = new Scanner(System.in);
        boolean dziala = true;

        while (dziala) {
            wyswietlMenuZmywarek();
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    zmywarkaSerwis.dodajZmywarke();
                    break;
                case 2:
                    zmywarkaSerwis.wyswietlZmywarki();
                    break;
                case 3:
                    zmywarkaSerwis.usunZmywarke();
                    break;
                case 4:
                    zmywarkaSerwis.zapiszListeZmywarek();
                    break;
                case 5:
                    zmywarkaSerwis.odczytajDoListyZmywarki();
                    break;
                case 0:
                    dziala = false;
                    break;
            }
        }
    }

    private void wyswietlMenuLodowek() {
        System.out.println("1 - Dodaj nowa lodowke");
        System.out.println("2 - Wyswietl lodowki");
        System.out.println("3 - Usun lodowke");
        System.out.println("4 - Zapisz lodowki do pliku");
        System.out.println("5 - Odczytaj lodowki z pliku");
        System.out.println("0 - Wyjscie");
    }

    private void wyswietlMenuPralek() {
        System.out.println("1 - Dodaj nowa pralke");
        System.out.println("2 - Wyswietl pralki");
        System.out.println("3 - Usun pralki");
        System.out.println("4 - Zapisz pralki do pliku");
        System.out.println("5 - Odczytaj pralki z pliku");
        System.out.println("0 - Wyjscie");
    }

    private void wyswietlMenuZmywarek() {
        System.out.println("1 - Dodaj nowa zmywarke");
        System.out.println("2 - Wyswietl zmywarki");
        System.out.println("3 - Usun zmywarke");
        System.out.println("4 - Zapisz zmywarki do pliku");
        System.out.println("5 - Odczytaj zmywarki z pliku");
        System.out.println("0 - Wyjscie");
    }

    public void wyswietlMenuGlowne() {
        System.out.println("Witaj! Gdzie chcesz przejsc?");
        System.out.println("1 - Przejdz do menu lodowki");
        System.out.println("2 - Przejdz do menu pralki");
        System.out.println("3 - Przejdz do menu zmywarki");
        System.out.println("0 - Wyjscie z programu");
    }

}
