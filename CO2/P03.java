/* Perform string manipulations */

import java.util.Scanner;

class Str {
    String word;
}

public class P03 {
    public static void main(String[] args) {

        Str w = new Str();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        w.word = sc.nextLine();

        System.out.println("The length of the string usng length() function : " + w.word.length());
        System.out.println("Using toLowerCase() function : " + w.word.toLowerCase());
        System.out.println("Using toUpperCase() function : " + w.word.toUpperCase());
        System.out.println("Checks whether a string is empty(True) or not(False) using isEmpty() function : "
                + w.word.isEmpty());
        System.out.println("Returns the hash code of a string using hashCode() function : " + w.word.hashCode());

    }
}