package Komparatory;

import java.util.Comparator;
import Uczelnia.Osoba;

public class KomparatorNazwiskoImie implements Comparator<Osoba> {

    public int compare(Osoba o1, Osoba o2) {
        if (o1.getNazwisko().equals(o2.getNazwisko())) {
            return o1.getImie().compareTo(o2.getImie());
        } else {
            return o1.getNazwisko().compareTo(o2.getNazwisko());
        }
    }
}

