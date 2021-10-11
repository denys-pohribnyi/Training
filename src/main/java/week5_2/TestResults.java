package week5_2;

import java.util.HashMap;
import java.util.Set;

public class TestResults {

    public static HashMap<String,Integer> getOriginalGrades(){
        HashMap<String,Integer> grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static HashMap<String,Integer> getMakeUpGrades(){
        HashMap<String,Integer> grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }

    public static Set<String> listOfStudentsNames(){

        return getMakeUpGrades().keySet();

    }

}
//2. Для продвинутого уровня на 25 баллов
//У нас есть класс - TestResults (в прикрепленном файле есть java file) - это Map (ключ значение)
//там есть две мапы
//getOriginalGrades - оценка в первую сдачу
//getMakeUpGrades - оценка во время пересдачи Преподаватель будет ставить бОльшую оценку
//Например, по первому тесту я получил 24 балла, по второму - 97. Моя итоговая будет 97.
//Но Лиззи на получила 80 баллов за 1-й тест и 76 баллов за 2-й. Значит, ее итоговая будет 80.
//Создать класс GradeBook, в нем создать некст
//Set<String> namesOfStudents = TestResult.listOfStudentsNames();
//HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
//HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
//HashMap<String, Integer> gradeBookMap = new HashMap<>();
//Потом сделать loop по namesOfStudents, внутри тела цикла вызывать по ключу элементы из firstTest и secondTest,
// сравнивать их и большее значение ложить в gradeBookMap
//После всех итераций вывести в консоль итоговые оценки