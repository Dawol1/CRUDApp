import java.util.Scanner;

public class Pralka extends UrzadzeniaCzyszczace {

    private int maxIloscObrotow;

    public Pralka(Producent producent, Long numerSeryjny, Double waga, Double długosc, Double szerokosc, Double wysokosc, KlasaEnergetyczna klasaEnergetyczna, Long pojemnosc, int zuzycieWody, int iloscProgramow, int maxIloscObrotow) {
        super(producent, numerSeryjny, waga, długosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc, zuzycieWody, iloscProgramow);
        this.maxIloscObrotow = maxIloscObrotow;
    }

    public int getMaxIloscObrotow() {
        return maxIloscObrotow;
    }

    public void setMaxIloscObrotow(int maxIloscObrotow) {
        this.maxIloscObrotow = maxIloscObrotow;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + maxIloscObrotow;
    }

    public static Pralka dodajPralka() {
        UrzadzeniaCzyszczace urzadzeniaCzyszczace = UrzadzeniaCzyszczace.addUrzadzeniaCzyszczace();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maksymalna ilosc obrotow: ");
        int maxIloscObrotow = scanner.nextInt();
        return new Pralka(urzadzeniaCzyszczace.getProducent(), urzadzeniaCzyszczace.getNumerSeryjny(), urzadzeniaCzyszczace.getWaga(), urzadzeniaCzyszczace.getDlugosc(), urzadzeniaCzyszczace.getSzerokosc(), urzadzeniaCzyszczace.getWysokosc(), urzadzeniaCzyszczace.getKlasaEnergetyczna(), urzadzeniaCzyszczace.getPojemnosc(), urzadzeniaCzyszczace.getZuzycieWody(), urzadzeniaCzyszczace.getIloscProgramow(), maxIloscObrotow);
    }

    public static Pralka dodajPralka(String[] dane) {
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
        int maxIloscObrotow = Integer.parseInt(dane[11]);
        return new Pralka(producent, numerSeryjny, waga, długosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc, zuzycieWody, iloscProgramow, maxIloscObrotow);
    }
}
