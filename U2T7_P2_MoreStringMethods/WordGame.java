import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int wordCount = 1;
        String previousWord = null;

        System.out.println("Welcome to the word game!");

        while (score < 50) {
            System.out.print("Enter a word: ");
            String currentWord = scanner.nextLine();
            if (previousWord != null) {
                if (currentWord.compareTo(previousWord) > 0) {
                    score+=2;
                    System.out.println("+2 points: current word is alphabetically after: Score: " + score );
                }
                if (currentWord.compareTo(previousWord) < 0) {
                    score -=5;
                    System.out.println("-5 points: current word is alphabetically before: Score: " + score );
                }
                if (currentWord.compareTo(previousWord) == 0) {
                    score -=10;
                    System.out.println("-10 points: current word is the same as previous word: Score: " + score );
                }

                if (previousWord.length() >=2 && currentWord.length() >=2) {
                    String lastTwoLetters = previousWord.substring(previousWord.length()-2);
                    String firstTwoLetters = currentWord.substring(0,2);
                    
                    if (lastTwoLetters.equals(firstTwoLetters)) {
                        score +=5;
                        System.out.println("+5 points: last 2 letters of of previous match the first two letters of current: Score: " + score );
                    }

                if (previousWord.length() == currentWord.length()) {
                    score +=3;
                    System.out.println("+3 points: current and previous word have the same amount of letters: Score: " + score );

                }
                }
    
                char firstLetter = previousWord.charAt(0);
                if (currentWord.indexOf(firstLetter) != -1) {
                    score +=3;
                    System.out.println("+3 points: first letter of previous word found in current word: Score: " + score );
                }  
                
                wordCount++;
            }
    
        
            previousWord = currentWord;
        }

        System.out.println("You win! It took you " + wordCount + "! Try again for a lower word count :)" );
        
        scanner.close();   
    }

}
