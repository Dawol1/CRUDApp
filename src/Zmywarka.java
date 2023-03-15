import java.util.Objects;
import java.util.Scanner;

public class Zmywarka extends UrzadzeniaCzyszczace {

    private int halas;

    public Zmywarka(Producent producent, Long numerSeryjny, Double waga, Double dlugosc, Double szerokosc, Double wysokosc, KlasaEnergetyczna klasaEnergetyczna, Long pojemnosc, int zuzycieWody, int iloscProgramow, int halas) {
        super(producent, numerSeryjny, waga, dlugosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc, zuzycieWody, iloscProgramow);
        this.halas = halas;
    }

    public int getHalas() {
        return halas;
    }

    public void setHalas(int halas) {
        this.halas = halas;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + halas;
    }

    public static Zmywarka dodajZmywarke() {
        UrzadzeniaCzyszczace urzadzeniaCzyszczace = UrzadzeniaCzyszczace.addUrzadzeniaCzyszczace();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj halas ");
        int halas = scanner.nextInt();
        return new Zmywarka(urzadzeniaCzyszczace.getProducent(), urzadzeniaCzyszczace.getNumerSeryjny(), urzadzeniaCzyszczace.getWaga(), urzadzeniaCzyszczace.getDlugosc(), urzadzeniaCzyszczace.getSzerokosc(), urzadzeniaCzyszczace.getWysokosc(), urzadzeniaCzyszczace.getKlasaEnergetyczna(), urzadzeniaCzyszczace.getPojemnosc(), urzadzeniaCzyszczace.getZuzycieWody(), urzadzeniaCzyszczace.getIloscProgramow(), halas);
    }

    public static Zmywarka dodajZmywarke(String[] dane) {
        Producent producent = new Producent(dane[0], dane[1]);
        Long numerSeryjny = Long.valueOf(dane[2]);
        Double waga = Double.valueOf(dane[3]);
        Double długosc = Double.valueOf(dane[4]);
        Double szerokosc = Double.valueOf(dane[5]);
        Double wysokosc = Double.valueOf(dane[6]);
        KlasaEnergetyczna klasaEnergetyczna = KlasaEnergetyczna.valueOf(dane[7]);
        Long pojemnosc = Long.valueOf(dane[8]);
        int zuzycieWody = Integer.parseInt(dane[9]);
        int iloscProgramow = Integer.parseInt(dane[10]);
        int halas = Integer.parseInt(dane[11]);
        return new Zmywarka(producent, numerSeryjny, waga, długosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc, zuzycieWody, iloscProgramow, halas);
    }
}
