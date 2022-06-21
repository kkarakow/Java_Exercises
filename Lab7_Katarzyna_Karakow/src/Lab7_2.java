import java.util.Scanner;

public class Lab7_2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] number_arr = new int[100];

        for (int i=0; i<100; i++){
            number_arr[i] = 0;

            System.out.println("Enter the integers between 1 and 100: \n");
            i = input.nextInt();

            while (i != 0){
                number_arr[i]++;
                i = input.nextInt();
            }

            for (i=0; i<100; i++){

                if (number_arr[i] != 0){
                    if (number_arr[i] == 1){
                        System.out.println(i + " occurs " + number_arr[i] + " time \n");
                    }
                    else{
                        System.out.println(i + " occurs " + number_arr[i] + " times \n");
                    }
                }
            }
        }

    }

}
