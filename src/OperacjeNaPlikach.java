import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class OperacjeNaPlikach {

    private static final Scanner scanner = new Scanner(System.in);

    public static void zapiszDoCsvLodowki(List<Lodowka> listaLodowek) throws FileNotFoundException {
        System.out.println("Podaj nazwe zapisywanego pliku: ");
        String sciezka = scanner.nextLine();
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sciezka + ".csv"), "UTF-8"));
            for (Lodowka lodowka : listaLodowek) {
                bw.write(lodowka.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Lodowka> odczytajZCsvLodowki(List<Lodowka> listaLodowek) {
        System.out.println("Podaj nazwe pliku, ktory chcesz odczytac: ");
        String sciezka = scanner.nextLine();
        Path pathToFile = Paths.get(sciezka);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Lodowka lodowka = Lodowka.dodajLodowka(attributes);
                listaLodowek.add(lodowka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Zakonczono dodawanie.");
        System.out.println("W bazie znajduje się: " + listaLodowek.size() + ", obiektow");
        return listaLodowek;
    }

    public static void zapiszDoCsvPralki(List<Pralka> listaPralek) throws FileNotFoundException {
        System.out.println("Podaj nazwe zapisywanego pliku: ");
        String sciezka = scanner.nextLine();
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sciezka + ".csv"), "UTF-8"));
            for (Pralka pralka : listaPralek) {
                bw.write(pralka.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Zapisano! ");
    }

    public static List<Pralka> odczytajZCsvPralki(List<Pralka> listaPralek) {
        System.out.println("Podaj nazwe pliku, ktory chcesz odczytac: ");
        String sciezka = scanner.nextLine();
        Path pathToFile = Paths.get(sciezka);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Pralka pralka = Pralka.dodajPralka(attributes);
                listaPralek.add(pralka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Zakonczono dodawanie.");
        System.out.println("W bazie znajduje się: " + listaPralek.size() + ", obiektow");
        return listaPralek;
    }

    public static void zapiszDoCsvZmywarki(List<Zmywarka> listaZmywarek) throws FileNotFoundException {
        System.out.println("Podaj nazwe zapisywanego pliku: ");
        String sciezka = scanner.nextLine();
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sciezka + ".csv"), "UTF-8"));
            for (Zmywarka zmywarka : listaZmywarek) {
                bw.write(zmywarka.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Zapisano! ");
    }

    public static List<Zmywarka> odczytajZCsvZmywarki(List<Zmywarka> listaZmywarek) {
        System.out.println("Podaj nazwe pliku, ktory chcesz odczytac: ");
        String sciezka = scanner.nextLine();
        Path pathToFile = Paths.get(sciezka);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Zmywarka zmywarka = Zmywarka.dodajZmywarke(attributes);
                listaZmywarek.add(zmywarka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Zakonczono dodawanie.");
        System.out.println("W bazie znajduje się: " + listaZmywarek.size() + ", obiektow");
        return listaZmywarek;
    }

    //Automatyczny odczyt plikow

    public static List<Lodowka> odczytLodowka(List<Lodowka> listaLodowek) {
        Path pathToFile = Paths.get("lodowki.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Lodowka lodowka = Lodowka.dodajLodowka(attributes);
                listaLodowek.add(lodowka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listaLodowek;
    }

    public static List<Pralka> odczytPralka(List<Pralka> listaPralek) {
        Path pathToFile = Paths.get("pralki.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Pralka pralka = Pralka.dodajPralka(attributes);
                listaPralek.add(pralka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listaPralek;
    }

    public static List<Zmywarka> odczytZmywarka(List<Zmywarka> listaZmywarek) {
        Path pathToFile = Paths.get("zmywarki.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                Zmywarka zmywarka = Zmywarka.dodajZmywarke(attributes);
                listaZmywarek.add(zmywarka);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listaZmywarek;
    }

}
