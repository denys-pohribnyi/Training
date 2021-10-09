package week5;

import java.util.ArrayList;
import java.util.List;

public class BookTester {
    public static void main(String[] args) {
        List<Book> bookCollection = new ArrayList<>();

        Book book1 = new Book(100,"Stephen Hawking 'Great desire'","Hard",531);
        Book book2 = new Book(100,"Stephen King 'Outsider'","Soft",353);
        Book book3 = new Book(100,"H.G.Wells 'The war of the worlds'","Soft",396);
        Book book4 = new Book(100,"H.P.Lovecraft 'Call of Cthulhu'","Hard",640);
        Book book5 = new Book(100,"A.C.Doyle 'Holmes adventure'","Hard",499);
        Book book6 = new Book(100,"F.F.Scott 'The Great Gatsby'","Soft",290);
        Book book7 = new Book(100,"Joan Rowling 'Harry Potter'","Hard",845);
        Book book8 = new Book(100,"George R.R. Martin 'Game of thrones'","Hard",1234);
        Book book9 = new Book(100,"Frank Herbert 'Dune'","Soft",380);
        Book book10 = new Book(100,"Dan Brown 'Dracula'","Soft",512);
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);
        bookCollection.add(book6);
        bookCollection.add(book7);
        bookCollection.add(book8);
        bookCollection.add(book9);
        bookCollection.add(book10);
        String res = book1.getCoverType();
        System.out.println(res);
        List<Book> bookWithSoftCover = new ArrayList<>();
        List<Book> bookWithHardCover = new ArrayList<>();
        for (int i = 0; i < bookCollection.size(); i++) {

        }
    }
}
//Создать POJO класс Book
//у класса Book - 4 параметра (поля класса),
//double price
//String title
//String coverType (может быть только hard или soft) int quantityOfPages
//у них у всех есть геттеры и сеттеры и эти поля инициализируются при вызове конструктора (т е в классе Book есть конструктор с 4 параметрами)
//Создать класс BookTester - в нем psvm
//В psvm проинициализировать ArrayList (назовем его bookCollection) который может содержать только Book
//Наполнить коллекцию 10 книгами по слабой ссылке (т е через new Book(...,...,...,...))
//Перед циклом проинициализировать 2 коллекции (типа ArrayList) booksWithSoftCover
//booksWithHardCover

//Сделать перебор по коллекции (цикл) bookCollection в котором с помощью оператора if наполнить коллекции booksWithSoftCover и booksWithHardCover, т е вызвать getCoverType у каждого элемента коллекции и если он .equals(“soft”) - то мы добавляем в
//booksWithSoftCover в противном случае в booksWithHardCover
//После цикла у нас 3 коллекции -
//bookCollection - все книги
//booksWithSoftCover - книги только в мягком переплете
//booksWithHardCover - книги только в твердом переплете
//Далее вывести в консоль с соответствующими логами - все названия книг каждого массива
//Что то типа “В магазине есть след книги с мягким переплетом” и далее список title Сообщение “В магазине есть след книги с мягким переплетом” вызвать перед циклом чтобы оно не повторялось
//Т е мы делаем перебор - и у каждого элемента вызываем getTitle и печатаем в консоль
//2. Для продвинутого уровня на 25 баллов
//У нас есть класс - TestResults (в прикрепленном файле есть java file) - это Map (ключ значение)
//там есть две мапы
//getOriginalGrades - оценка в первую сдачу
//getMakeUpGrades - оценка во время пересдачи Преподаватель будет ставить бОльшую оценку
//Например, по первому тесту я получил 24 балла, по второму - 97. Моя итоговая будет 97.
//Но Лиззи на получила 80 баллов за 1-й тест и 76 баллов за 2-й. Значит, ее итоговая будет 80.
//Создать класс GradeBook, в нем создать некст
//Set<String> namesOfStudents = TestResult.listOfStudentsNames(); HashMap<String, Integer> firstTest = TestResult.getOriginalGrades(); HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
//HashMap<String, Integer> gradeBookMap = new HashMap<>();
//Потом сделать loop по namesOfStudents, внутри тела цикла вызывать по ключу элементы из firstTest и secondTest, сравнивать их и большее значение ложить в gradeBookMap
//После всех итераций вывести в консоль итоговые оценки