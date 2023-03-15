import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZmywarkaSerwis {

    private List<Zmywarka> listaZmywarek = new ArrayList<>();

    public void dodajZmywarke() {
        listaZmywarek.add(Zmywarka.dodajZmywarke());
    }

    public void wyswietlZmywarki() {
        int indeks = 1;
        if (listaZmywarek.size() > 0) {
            for (Zmywarka zmywarka : listaZmywarek) {
                System.out.println(indeks + ". " + zmywarka);
                indeks++;
            }
            System.out.println("W bazie jest " + listaZmywarek.size() + " zmywarek");
        } else System.out.println("Nie ma zmywarek w bazie");
    }

    public void usunZmywarke() {
        wyswietlZmywarki();
        if (listaZmywarek.size() == 0) {
            System.out.println("Brak obiektow do usuniecia");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz, który obiekt chcesz usunac: ");
        int wybor = scanner.nextInt();
        if (wybor - 1 < listaZmywarek.size()) {
            listaZmywarek.remove(wybor - 1);
            System.out.println("Usunieto. W bazie pozostało: " + listaZmywarek.size() + ", obiektow");
        } else {
            System.out.println("Podaj poprawna cyfre");
        }
    }

    public void zapiszListeZmywarek() {
        try {
            OperacjeNaPlikach.zapiszDoCsvZmywarki(listaZmywarek);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void odczytajDoListyZmywarki() {
        OperacjeNaPlikach.odczytajZCsvZmywarki(listaZmywarek);
    }

    public void odczytZmywarka() {
        OperacjeNaPlikach.odczytZmywarka(listaZmywarek);
    }

}
