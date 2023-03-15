import java.util.Objects;
import java.util.Scanner;

public class Urzadzenie{

    private Producent producent;
    private Long numerSeryjny;
    private Double waga;
    private Double dlugosc;
    private Double szerokosc;
    private Double wysokosc;
    private KlasaEnergetyczna klasaEnergetyczna;
    private Long pojemnosc;

    public Urzadzenie(Producent producent, Long numerSeryjny, Double waga, Double dlugosc, Double szerokosc, Double wysokosc, KlasaEnergetyczna klasaEnergetyczna, Long pojemnosc) {
        this.producent = producent;
        this.numerSeryjny = numerSeryjny;
        this.waga = waga;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.klasaEnergetyczna = klasaEnergetyczna;
        this.pojemnosc = pojemnosc;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public Long getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(Long numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public Double getWaga() {
        return waga;
    }

    public void setWaga(Double waga) {
        this.waga = waga;
    }

    public Double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(Double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public Double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(Double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public Double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(Double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public KlasaEnergetyczna getKlasaEnergetyczna() {
        return klasaEnergetyczna;
    }

    public void setKlasaEnergetyczna(KlasaEnergetyczna klasaEnergetyczna) {
        this.klasaEnergetyczna = klasaEnergetyczna;
    }

    public Long getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Long pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return producent + "" + numerSeryjny + ";" + waga + ";" + dlugosc + ";" + szerokosc + ";" + wysokosc + ";" + klasaEnergetyczna + ";" + pojemnosc + ";";
    }

    public static Urzadzenie addUrzadzenie() {
        Producent producent = Producent.addProducent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer seryjny");
        Long numerSeryjny = scanner.nextLong();
        System.out.println("Podaj pojemnosc");
        Long pojemnosc = scanner.nextLong();
        System.out.println("Podaj wage");
        Double waga = scanner.nextDouble();
        System.out.println("Podaj dlugosc");
        Double dlugosc = scanner.nextDouble();
        System.out.println("Podaj szerokosc");
        Double szerokosc = scanner.nextDouble();
        System.out.println("Podaj wysokosc");
        Double wysokosc = scanner.nextDouble();
        return new Urzadzenie(producent, numerSeryjny, waga, dlugosc, szerokosc, wysokosc, new KlasaEnergetycznaSerwis().zwrocWybranaKlase(), pojemnosc);
    }
}
