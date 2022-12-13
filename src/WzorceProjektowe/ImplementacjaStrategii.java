package WzorceProjektowe;
import Uczelnia.*;
import java.util.ArrayList;

public class ImplementacjaStrategii implements Observable {

    public void notifyObserver(Student student) {
            student.update();

    }
    public static void main(String[] args) {

        // Pierwsza strategia: Nieaktywni studenci
        StrategieUsuwaniaStudentow strategia = new UsunNieaktywnychStudentow();
        ArrayList<Student> listaStudentow = new ArrayList<>();
        listaStudentow.addAll(Uczelnia.Main.getStudenci());
        ArrayList<Student> listaStudentowDoWykreslenia = new ArrayList<>(strategia.wykreslaniStudenci());
        if (listaStudentowDoWykreslenia.size() == 0) {
            System.out.println("Brak nieaktywnych studentów");
        } else {
            System.out.println("Lista nieaktywnych studentów do usunięcia:");
            Uczelnia.Main.printStudenci(listaStudentowDoWykreslenia);
        }
        listaStudentowDoWykreslenia.forEach(Student::update);
        listaStudentow.removeAll(listaStudentowDoWykreslenia);
        Uczelnia.Main.setStudenci(listaStudentow);

        //Druga strategia: Studenci, którzy ukończyli studia
        strategia = new UsunStudentowUkonczyliStudia();
        listaStudentowDoWykreslenia = strategia.wykreslaniStudenci();
        if (listaStudentowDoWykreslenia.size() == 0) {
            System.out.println("Brak studentów którzy ukończyli już studia");
        } else {
            System.out.println("Lista studentów którzy ukończyli naukę i zostaną usunięci:");
            Uczelnia.Main.printStudenci(listaStudentowDoWykreslenia);
        }
        listaStudentow.removeAll(listaStudentowDoWykreslenia);
        Uczelnia.Main.setStudenci(listaStudentow);
}}
