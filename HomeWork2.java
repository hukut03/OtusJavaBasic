package OtusHomeWork;

import java.util.Base64;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
        /*
        Не совсем понял что делают эти методы
         */
        System.out.println("Program result: " + encodedFullName );
    }

}
