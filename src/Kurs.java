import java.io.Serializable;

public class Kurs implements Serializable {
    private String nazwaKursu;
    private PracownikBadawczoDydaktyczny prowadzacy;
    private int liczbaECTS;

    public Kurs(String nazwaKursu, PracownikBadawczoDydaktyczny prowadzacy, int liczbaECTS) {
        this.nazwaKursu = nazwaKursu;
        this.prowadzacy = prowadzacy;
        this.liczbaECTS = liczbaECTS;
    }

    //get-ery i set-ery -----------------------


    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    public PracownikBadawczoDydaktyczny getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(PracownikBadawczoDydaktyczny prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public int getLiczbaECTS() {
        return liczbaECTS;
    }

    public void setLiczbaECTS(int liczbaECTS) {
        this.liczbaECTS = liczbaECTS;
    }
}
