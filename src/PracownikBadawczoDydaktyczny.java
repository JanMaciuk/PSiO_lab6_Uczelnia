import java.io.Serializable;

public class PracownikBadawczoDydaktyczny extends PracownikUczelni implements Serializable {
    private int liczbaPublikacji;
    public PracownikBadawczoDydaktyczny(String stanowisko, int stazPracy, int pensja, String imie, String nazwisko, String pesel, int wiek, String plec, String jedzenie, int liczbaPublikacji) {
        super(stanowisko, stazPracy, pensja, imie, nazwisko, pesel, wiek, plec, jedzenie);
        this.liczbaPublikacji = liczbaPublikacji;
    }
    public PracownikBadawczoDydaktyczny() {
        super();
        this.liczbaPublikacji = 0;
    }


    // get-ery i set-ery -----------------------

    public int getLiczbaPublikacji() {
        return liczbaPublikacji;
    }

    public void setLiczbaPublikacji(int liczbaPublikacji) {
        this.liczbaPublikacji = liczbaPublikacji;
    }
}
