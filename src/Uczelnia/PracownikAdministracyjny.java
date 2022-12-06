package Uczelnia;

import java.io.Serializable;

public class PracownikAdministracyjny extends PracownikUczelni implements Serializable {
    private int liczbaNadgodzin;

    public PracownikAdministracyjny(String stanowisko, int stazPracy, int pensja, String imie, String nazwisko, String pesel, int wiek, String plec, String jedzenie, int liczbaNadgodzin) {
        super(stanowisko, stazPracy, pensja, imie, nazwisko, pesel, wiek, plec, jedzenie);
        this.liczbaNadgodzin = liczbaNadgodzin;
    }
    public PracownikAdministracyjny() {
        super();
        this.liczbaNadgodzin = 0;
    }

    // get-ery i set-ery -----------------------
    public int getLiczbaNadgodzin() {
        return liczbaNadgodzin;
    }

    public void setLiczbaNadgodzin(int liczbaNadgodzin) {
        this.liczbaNadgodzin = liczbaNadgodzin;
    }
}
