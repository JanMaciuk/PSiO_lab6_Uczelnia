package Uczelnia;

import java.io.Serializable;
import java.util.ArrayList;
import WzorceProjektowe.*;

public class Student extends Osoba implements Serializable {
    private int numerIndeksu;
    private int rokStudiow;
    private boolean erasmus;
    private boolean pierwszyStopienStudiow; // jeżeli false to drugi stopien studiów (Nie mamy doktorantów na tej uczelni)
    private boolean stacjonarny; // jeżeli false to niestacjonarny
    private ArrayList<Kurs> listaKursow = new ArrayList<>();


    public void update() {
        System.out.println("Student " + this.getImie() + " " + this.getNazwisko() + " został usunięty z listy studentów");
        System.out.println("Wysyłanie powiadomienia email do studenta");
        // wysyłamy mail do studenta który jest observerem, że został usunięty z listy studentów.
    }

    public Student(int numerIndeksu, int rokStudiow, boolean erasmus, boolean pierwszyStopienStudiow, boolean stacjonarny, String imie, String nazwisko, String pesel, int wiek, String plec, String jedzenie, ArrayList<Kurs> kursy) {
        super(imie, nazwisko, pesel, wiek, plec, jedzenie);
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
        this.erasmus = erasmus;
        this.pierwszyStopienStudiow = pierwszyStopienStudiow;
        this.stacjonarny = stacjonarny;
        listaKursow.addAll(kursy);


    }
    public Student() {
        super();
        this.numerIndeksu = 0;
        this.rokStudiow = 0;
        this.erasmus = false;
        this.pierwszyStopienStudiow = true;
        this.stacjonarny = true;
    }


    // get-ery i set-ery -----------------------

    public ArrayList<Kurs> getListaKursow() {
        return listaKursow;
    }

    public void setListaKursow(ArrayList<Kurs> listaKursow) {
        this.listaKursow = listaKursow;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public boolean isErasmus() {
        return erasmus;
    }

    public void setErasmus(boolean erasmus) {
        this.erasmus = erasmus;
    }

    public boolean isPierwszyStopienStudiow() {
        return pierwszyStopienStudiow;
    }

    public void setPierwszyStopienStudiow(boolean pierwszyStopienStudiow) {
        this.pierwszyStopienStudiow = pierwszyStopienStudiow;
    }

    public boolean isStacjonarny() {
        return stacjonarny;
    }

    public void setStacjonarny(boolean stacjonarny) {
        this.stacjonarny = stacjonarny;
    }
}
