import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Student input_student = new Student();
        System.out.println("Enter Student grade for Canadian Business: ");
        input_student.setCan_bus_grade(input.nextDouble());

        System.out.println("Enter Student grade for Database and SQL: ");
        input_student.setDatabase_grade(input.nextDouble());

        System.out.println("Enter Student grade for Introduction to Analytics: ");
        input_student.setBia_grade(input.nextDouble());

        System.out.println("Enter Student grade for Operations Management: ");
        input_student.setOp_mgmt_grade(input.nextDouble());

        System.out.println("Enter Student grade for Quantitative Methods I: ");
        input_student.setQm1_grade(input.nextDouble());

        System.out.println("Enter Student grade for Statistical Software Languages: ");
        input_student.setSsl_grade(input.nextDouble());

        double input_student_GPA = input_student.student_GPA();

        System.out.println("Student GPA is: " + String.format("%.2f", input_student_GPA));
        System.out.println(input_student.toString());


    }
}
