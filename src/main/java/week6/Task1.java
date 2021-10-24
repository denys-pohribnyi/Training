package week6;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static String afterFellInUpperCase(String inputString, String searchAfterThatWord) {
        String input = inputString.toLowerCase();
        String inputAfter = searchAfterThatWord.toLowerCase();
        String[] splittedString = input.split(" ");
        String nextWord = "";
        String result = nextWord;
        for (int i = 0; i < splittedString.length; i++) {
            if (inputAfter.equals(splittedString[i])) {
                nextWord = splittedString[i + 1];
                System.out.println(nextWord.toUpperCase());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text here: ");
        String inputString = scanner.nextLine();
        System.out.println("Please enter keyword after what you can see the next word in upper case: ");
        String inputWordForSearchingNext = scanner.next();
        System.out.println("So, the next word after your keyword is: ");
        String test = afterFellInUpperCase(inputString, inputWordForSearchingNext);
        System.out.println(test);
    }
}
//Please enter some text here:
//One Two THREe FoUr Five SiX sEvEn
//Please enter keyword after what you can see the next word in upper case:
//four
//So, the next word after your keyword is:
//FIVE

//Написать метод который принимает в себя строку с несколькими словами и
//возвращает строку с одним словом, которое идет за текущим в upper case
//(например мы ищем строке “Get a modern feel with a smudge-resistant only for
//$2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
//вернуть “WITH” )