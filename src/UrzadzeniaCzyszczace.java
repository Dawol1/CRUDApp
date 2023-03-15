import java.util.Scanner;

public class UrzadzeniaCzyszczace extends Urzadzenie {
    private int zuzycieWody;
    private int iloscProgramow;

    public UrzadzeniaCzyszczace(Producent producent, Long numerSeryjny, Double waga, Double dlugosc, Double szerokosc, Double wysokosc, KlasaEnergetyczna klasaEnergetyczna, Long pojemnosc, int zuzycieWody, int iloscProgramow) {
        super(producent, numerSeryjny, waga, dlugosc, szerokosc, wysokosc, klasaEnergetyczna, pojemnosc);
        this.zuzycieWody = zuzycieWody;
        this.iloscProgramow = iloscProgramow;
    }

    public int getZuzycieWody() {
        return zuzycieWody;
    }

    public void setZuzycieWody(int zuzycieWody) {
        this.zuzycieWody = zuzycieWody;
    }

    public int getIloscProgramow() {
        return iloscProgramow;
    }

    public void setIloscProgramow(int iloscProgramow) {
        this.iloscProgramow = iloscProgramow;
    }

    @Override
    public String toString() {
        return super.toString() + zuzycieWody + ";" + iloscProgramow;
    }

    public static UrzadzeniaCzyszczace addUrzadzeniaCzyszczace() {
        Urzadzenie urzadzenie = Urzadzenie.addUrzadzenie();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zuzycie wody");
        int zuzycieWody = scanner.nextInt();
        System.out.println("Podaj iloscProgramow");
        int iloscProgramow = scanner.nextInt();
        return new UrzadzeniaCzyszczace(urzadzenie.getProducent(), urzadzenie.getNumerSeryjny(), urzadzenie.getWaga(), urzadzenie.getDlugosc(), urzadzenie.getSzerokosc(), urzadzenie.getWysokosc(), urzadzenie.getKlasaEnergetyczna(), urzadzenie.getPojemnosc(), zuzycieWody, iloscProgramow);
    }
}
