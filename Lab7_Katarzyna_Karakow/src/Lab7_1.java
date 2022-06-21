import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double[] arr_list = new double[10];

        System.out.println("Enter 10 numbers: ");
        for (int i=0; i<arr_list.length; i++){
            System.out.println("Index " + i);
            arr_list[i] = input.nextDouble();
        }
        int smallest_index = indexOfsmallestElement(arr_list);
        double smallest_element = arr_list[smallest_index];
        System.out.println("The smallest element is " + smallest_element + "\n" +
                            "The smallest element index is " + smallest_index);
    }
    public static int indexOfsmallestElement (double[] array)
    {
        double current = array[0];
        int smallest_index = 0;
        for (int i=1; i< array.length; i++){
            if (array[i] < current){
                current = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}
