package WzorceProjektowe;
import Uczelnia.*;

import java.util.ArrayList;
public class UsunNieaktywnychStudentow implements StrategieUsuwaniaStudentow {
    @Override
    public ArrayList<Student> wykreslaniStudenci() {
        ArrayList<Student> studenciDoWykreslenia = new ArrayList<>();
        ArrayList<Student> test = new ArrayList<>(Uczelnia.Main.getStudenci());
        for (Student student : Uczelnia.Main.getStudenci()) {
            if (student.getListaKursow().size() == 0) {
                studenciDoWykreslenia.add(student);
            }
        }
        return studenciDoWykreslenia;
    }
}

