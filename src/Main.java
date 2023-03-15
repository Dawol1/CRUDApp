
public class Main {

    public static void main(String[] args) {

        LodowkaSerwis lodowkaSerwis = new LodowkaSerwis();

        PralkaSerwis pralkaSerwis = new PralkaSerwis();

        ZmywarkaSerwis zmywarkaSerwis = new ZmywarkaSerwis();

        Menu menu = new Menu(lodowkaSerwis, pralkaSerwis, zmywarkaSerwis);

        lodowkaSerwis.odczytLodowka();
        pralkaSerwis.odczytPralka();
        zmywarkaSerwis.odczytZmywarka();

        menu.menuStart();
    }


}

