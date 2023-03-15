import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PralkaSerwis {

    private List<Pralka> listaPralek = new ArrayList<>();

    public void dodajPralke() {
        listaPralek.add(Pralka.dodajPralka());
    }

    public void wyswietlPralki() {
        int indeks = 1;
        if (listaPralek.size() > 0) {
            for (Pralka pralka : listaPralek) {
                System.out.println(indeks + ". " + pralka);
                indeks++;
            }
            System.out.println("W bazie jest " + listaPralek.size() + " pralek");
        } else System.out.println("Nie ma pralek w bazie");
    }

    public void usunPralke() {
        wyswietlPralki();
        if (listaPralek.size() == 0) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz, który obiekt chcesz usunac: ");
        int wybor = scanner.nextInt();
        if (wybor - 1 < listaPralek.size()) {
            listaPralek.remove(wybor - 1);
            System.out.println("Usunieto. W bazie pozostało: " + listaPralek.size() + ", obiektow");
        } else {
            System.out.println("Podaj poprawna cyfre");
        }
    }

    public void zapiszListePralek() {
        try {
            OperacjeNaPlikach.zapiszDoCsvPralki(listaPralek);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void odczytajDoListyPralek() {
        OperacjeNaPlikach.odczytajZCsvPralki(listaPralek);
    }

    public void odczytPralka() {
        OperacjeNaPlikach.odczytPralka(listaPralek);
    }
}
