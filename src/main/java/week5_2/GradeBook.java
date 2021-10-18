package week5_2;

import junit.framework.TestResult;

import java.util.*;

public class GradeBook {
    public static void main(String[] args) {
        System.out.println("Итоговые оценки по результатам тестирования : ");
        Set<String> namesOfStudents = TestResults.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResults.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResults.getMakeUpGrades();

        HashMap<String, Integer> gradeBookMap = new HashMap<>();
        for (String key : namesOfStudents) {
            if (firstTest.get(key) > secondTest.get(key)) {
                gradeBookMap.put(key, firstTest.get(key));
            } else gradeBookMap.put(key, secondTest.get(key));
        }
        for(String print : gradeBookMap.keySet()){
            System.out.print(print + " " + gradeBookMap.get(print));
            System.out.println();
        }
    }
}
//Итоговые оценки по результатам тестирования :
//Raja 89
//Angie 97
//Shashi 79
//Amber 95
//Rex 95
//Bas 98
//Lisi 80
//Jason 63
//Dave 82
//Carlos 80
//Nikolay 79

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