import java.util.Scanner;


public class Lodowka extends Urzadzenie {

    private int iloscDrzwi;
    private String technologia;

    public Lodowka(Producent producent, Long numerSeryjny, Double waga, Double dlugosc, Double szerokosc, Double wysokosc, KlasaEnergetyczna klasaEnergetyczna, Long pojemnosc, int iloscDrzwi, String technologia) {
        super(producent, numerSeryjny, waga, dlugosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc);
        this.iloscDrzwi = iloscDrzwi;
        this.technologia = technologia;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    public String getTechnologia() {
        return technologia;
    }

    public void setTechnologia(String technologia) {
        this.technologia = technologia;
    }

    @Override
    public String toString() {
        return super.toString() + iloscDrzwi + ";" + technologia;
    }

    public static Lodowka dodajLodowka() {
        Urzadzenie urzadzenie = Urzadzenie.addUrzadzenie();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc drzwi: ");
        int iloscDrzwi = scanner.nextInt();
        System.out.println("Podaj technologie: ");
        String technologia = scanner.next();
        return new Lodowka(urzadzenie.getProducent(), urzadzenie.getNumerSeryjny(), urzadzenie.getWaga(), urzadzenie.getDlugosc(), urzadzenie.getSzerokosc(), urzadzenie.getWysokosc(), urzadzenie.getKlasaEnergetyczna(), urzadzenie.getPojemnosc(), iloscDrzwi, technologia);
    }

    public static Lodowka dodajLodowka(String[] dane) {
        Producent producent = new Producent(dane[0], dane[1]);
        Long numerSeryjny = Long.valueOf(dane[2]);
        Double waga = Double.valueOf(dane[3]);
        Double dlugosc = Double.valueOf(dane[4]);
        Double szerokosc = Double.valueOf(dane[5]);
        Double wysokosc = Double.valueOf(dane[6]);
        KlasaEnergetyczna klasaEnergetyczna = KlasaEnergetyczna.valueOf(dane[7]);
        Long pojemnosc = Long.valueOf(dane[8]);
        int iloscDrzwi = Integer.parseInt(dane[9]);
        String technologia = dane[10];
        return new Lodowka(producent, numerSeryjny, waga, dlugosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc, iloscDrzwi, technologia);
    }


}
