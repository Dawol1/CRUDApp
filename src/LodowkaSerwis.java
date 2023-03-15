import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LodowkaSerwis {

    private List<Lodowka> listaLodowek = new ArrayList<>();

    public void dodajLodowke() {
        listaLodowek.add(Lodowka.dodajLodowka());
    }

    public void wyswietlLodowki() {
        int indeks = 1;
        if (listaLodowek.size() > 0) {
            for (Lodowka lodowka : listaLodowek) {
                System.out.println(indeks + ". " + lodowka);
                indeks++;
            }
            System.out.println("W bazie jest " + listaLodowek.size() + " lodowek");
        } else System.out.println("Nie ma lodowek w bazie");
    }

    public void usunLodowke() {
        wyswietlLodowki();
        if (listaLodowek.size() == 0) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz, który obiekt chcesz usunac: ");
        int wybor = scanner.nextInt();
        if (wybor - 1 < listaLodowek.size()) {
            listaLodowek.remove(wybor - 1);
            System.out.println("Usunieto. W bazie pozostało: " + listaLodowek.size() + ", obiektow");
        } else {
            System.out.println("Podaj poprawna cyfre");
        }
    }

    public void zapiszListeLodowek() {
        try {
            OperacjeNaPlikach.zapiszDoCsvLodowki(listaLodowek);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void odczytajDoListyLodowek() {
        OperacjeNaPlikach.odczytajZCsvLodowki(listaLodowek);
    }

    public void odczytLodowka() {
        OperacjeNaPlikach.odczytLodowka(listaLodowek);
    }
}
