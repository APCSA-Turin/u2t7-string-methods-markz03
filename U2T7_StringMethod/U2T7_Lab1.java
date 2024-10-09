package U2T7_StringMethod;
import java.util.Scanner;

public class U2T7_Lab1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine(); 
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() == str2.length()) {
            System.out.println("Both strings have the same length");
        }
        else if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        }
        else {
            System.out.println(str2 + " is longer");
        }


        String str1First = str1.substring(0,str1.length()/2);
        String str1Second = str1.substring(str1.length()/2);
        String str2First = str2.substring(0,str2.length()/2);
        String str2Second = str2.substring(str2.length()/2);


        String result;
        if (str1.indexOf(str2) >= 0) {
            result = str2 + " is found in " + str1 + " at index " + str1.indexOf(str2);
        }
        else {
            result = str2 + " is NOT found in " + str1;
        }


        System.out.println("First half: " + str1First);
        System.out.println("Second half: " + str1Second);
        System.out.println("First half: " + str2First);
        System.out.println("Second half: " + str2Second);
        System.out.println(result);
        scan.close();
    }
}
