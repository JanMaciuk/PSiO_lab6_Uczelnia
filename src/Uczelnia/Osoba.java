package Uczelnia;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    private String imie;
    private String nazwisko;
    private String pesel;
    private int wiek;
    private String plec;

    private String jedzenie; // ulubione jedzenie, przydatne przyz organizowaniu konferencji :)

    public Osoba(String imie, String nazwisko, String pesel, int wiek, String plec, String jedzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.plec = plec;
        this.jedzenie = jedzenie;
    }
    public Osoba() {
        this.imie = "nieznane imie";
        this.nazwisko = "nieznane nazwisko";
        this.pesel = "00000000000";
        this.wiek = 1;
        this.plec = "nieznane";
        this.jedzenie = "nieznane";
    }

    // set-ery i get-ery --------------------------
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getJedzenie() {
        return jedzenie;
    }

    public void setJedzenie(String jedzenie) {
        this.jedzenie = jedzenie;
    }
}