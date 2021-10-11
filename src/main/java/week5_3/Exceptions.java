package week5_3;

import week5.Book;

import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
        List<Book> collection = new ArrayList<>();

        Book book1 = new Book(100, "Stephen Hawking 'Great desire'", "Hard", 531);
        Book book2 = new Book(200, "Stephen King 'Outsider'", "Soft", 353);
        Book book3 = new Book(300, "H.G.Wells 'The war of the worlds'", "Soft", 396);
        Book book4 = new Book(400, "H.P.Lovecraft 'Call of Cthulhu'", "Hard", 640);
        Book book5 = new Book(500, "A.C.Doyle 'Holmes adventure'", "Hard", 499);
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        collection.add(book4);
        collection.add(book5);

        for (int i = 0; i < collection.size() + 1; i++) {  // Добавлю еще одну итерацию по несуществующему элементу
            try {
                System.out.println(collection.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index is out of array list!");
            }
        }
    }
}
//2. В класса main cоздать ArrayList - потом наполнить его 5 элементами Book из
//предидущего урока. После этого попытаться достучаться до элемента с
//индексом 5. Обработать эксепшен в try - catch.