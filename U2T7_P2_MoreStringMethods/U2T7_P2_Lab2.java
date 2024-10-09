import java.util.Scanner;

public class U2T7_P2_Lab2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter first string: ");
        String string1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scan.nextLine();

        if (string1.equals(string2)) {
            System.out.println("The strings are equal!");
        }
        else {
            System.out.println("The strings are NOT equal");
        }

        if (string1.compareTo(string2) < 0) {
            System.out.println(string1 + " comes before " + string2 + " alphabetically");
        }
        else if (string1.compareTo(string2) > 0) {
            System.out.println(string2 + " comes before " + string1 + " alphabetically");
        }
        scan.close();
    }
}
