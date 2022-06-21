import java.util.Scanner;

public class Lab3_Katarzyna_Karakow {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter an integer number: (between 1 and 7)");
        number = input.nextInt();

        switch (number){
            case 1: System.out.println("The day is Sunday");
                break;
            case 2: System.out.println("The day is Monday");
                break;
            case 3: System.out.println("The day is Tuesday");
                break;
            case 4: System.out.println("The day is Wednesday");
                break;
            case 5: System.out.println("The day is Thursday");
                break;
            case 6: System.out.println("The day is Friday");
                break;
            case 7: System.out.println("The day is Saturday");
                break;
            default: System.out.println("The week has only 7 days");
                break;
        }
        }

    }


