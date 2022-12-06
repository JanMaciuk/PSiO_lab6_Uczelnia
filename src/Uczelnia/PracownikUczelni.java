package Uczelnia;

import java.io.Serializable;

public abstract class PracownikUczelni extends Osoba implements Serializable {
    private String stanowisko;
    private int stazPracy; // w miesiącach
    private int pensja; // w złotych, zakładamy bez groszy, ale jakby co można zmienić

    public PracownikUczelni(String stanowisko, int stazPracy, int pensja, String imie, String nazwisko, String pesel, int wiek, String plec, String jedzenie) {
        super(imie, nazwisko, pesel, wiek, plec, jedzenie);
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        this.pensja = pensja;

    }
    public PracownikUczelni() {
        super();
        this.stanowisko = "nieznane";
        this.stazPracy = 0;
        this.pensja = 0;
    }


    // get-ery i set-ery -----------------------

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }
}
