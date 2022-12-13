package WzorceProjektowe;
import Uczelnia.*;

import java.util.ArrayList;
public class UsunStudentowUkonczyliStudia implements StrategieUsuwaniaStudentow {
    @Override
    public ArrayList<Student> wykreslaniStudenci() {
        ArrayList<Student> studenciDoWykreslenia = new ArrayList<>();
        for (Student student : Uczelnia.Main.getStudenci()) {
            if (student.getRokStudiow() > 4 && !student.isPierwszyStopienStudiow()) {
                studenciDoWykreslenia.add(student);
            }
        }
        return studenciDoWykreslenia;
    }
}

