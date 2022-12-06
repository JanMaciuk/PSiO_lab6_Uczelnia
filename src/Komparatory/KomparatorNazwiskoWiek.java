package Komparatory;

import java.util.Comparator;
import Uczelnia.Osoba;

public class KomparatorNazwiskoWiek implements Comparator<Osoba> {

    public int compare(Osoba o1, Osoba o2) {
        if (o1.getNazwisko().equals(o2.getNazwisko())) {
            return Integer.compare(o1.getWiek(),o2.getWiek());
        } else {
            return o1.getNazwisko().compareTo(o2.getNazwisko());
        }
    }
}

