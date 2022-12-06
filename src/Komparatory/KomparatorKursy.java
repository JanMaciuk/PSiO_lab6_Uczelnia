package Komparatory;
import Uczelnia.Kurs;
import java.util.Comparator;

public class KomparatorKursy implements Comparator<Kurs> {

    public int compare(Kurs k1, Kurs k2) {
        if (k1.getLiczbaECTS() == k2.getLiczbaECTS()) {
            return (k1.getProwadzacy().getNazwisko().compareTo(k2.getProwadzacy().getNazwisko()));
        } else {
            return Integer.compare(k1.getLiczbaECTS(), k2.getLiczbaECTS());
        }
    }
}

