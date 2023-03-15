import java.util.Objects;
import java.util.Scanner;

public class Producent {

    private String nazwaProducenta;
    private String kraj;

    public Producent(String nazwaProducenta, String kraj) {
        this.nazwaProducenta = nazwaProducenta;
        this.kraj = kraj;
    }

    public String getNazwaProducenta() {
        return nazwaProducenta;
    }

    public void setNazwaProducenta(String nazwaProducenta) {
        this.nazwaProducenta = nazwaProducenta;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @Override
    public String toString() {
        return nazwaProducenta + ";" + kraj + ";";
    }

    public static Producent addProducent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe producenta");
        String nazwaProducenta = scanner.nextLine();
        System.out.println("Podaj kraj producenta");
        String kraj = scanner.nextLine();
        return new Producent(nazwaProducenta, kraj);
    }

}
