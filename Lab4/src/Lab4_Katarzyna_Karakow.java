import java.util.Scanner;

public class Lab4_Katarzyna_Karakow {

    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        char ch_letter = letter.charAt(0);

        if (Character.isLetter(ch_letter)){
            if (Character.toUpperCase(ch_letter) == 'A' || 'E')
            switch (Character.toUpperCase(ch_letter))
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(ch_letter + " is a vowel");
                    break;
                default: System.out.println(ch_letter + " is a consonant");
            }
        }
        else {
            System.out.println(ch_letter + " is an invalid input");
        }

    }

}
