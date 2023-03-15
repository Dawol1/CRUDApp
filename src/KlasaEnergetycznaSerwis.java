import java.util.*;

public class KlasaEnergetycznaSerwis {

    private List<KlasaEnergetyczna> zapiszKlasyDoListy() {
        return new ArrayList<>(Arrays.asList(KlasaEnergetyczna.values()));
    }

    private void wyswietlWszystkieKlasy() {
        int indeks = 1;
        for (KlasaEnergetyczna klasaEnergetyczna : zapiszKlasyDoListy()) {
            System.out.println(indeks + " - " + klasaEnergetyczna);
            indeks++;
        }
    }

    private Optional<KlasaEnergetyczna> wybierzKlaseEnergetyczna() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz klase energetyczna: ");
        wyswietlWszystkieKlasy();
        int wybor = scanner.nextInt();
        List<KlasaEnergetyczna> wszystkieKlasy = zapiszKlasyDoListy();
        if (wybor == 0) {
            System.out.println("Podaj poprawny numer klasy energetycznej. ");
            return Optional.empty();
        } else if (wybor < wszystkieKlasy.size() + 1) {
            KlasaEnergetyczna klasaEnergetyczna = wszystkieKlasy.get(wybor - 1);
            return Optional.of(klasaEnergetyczna);
        } else {
            System.out.println("Podaj poprawny numer klasy energetycznej. ");
        }
        return Optional.empty();
    }

    public KlasaEnergetyczna zwrocWybranaKlase() {
        Optional<KlasaEnergetyczna> klasaEnergetyczna = wybierzKlaseEnergetyczna();
        return klasaEnergetyczna.orElseGet(this::zwrocWybranaKlase);
    }
}
