import java.util.Scanner;

public class Main {
    public static int num = 0; //attributes for main class
    public static String[] school_names = {"School of Engineering", "School of Business", "Law School"};
    public static int[] school_distribution = new int[]{0, 0, 0, 0};

    public static void main(String[] args) {

        // Step 1 - Welcoming Message
        /**
         *
         * @author Ishwin Singh Bajaj
         */
        System.out.println("Welcome in Humber College");

        // Step 2 - Password Validation
        /**
         *
         * @author Ishwin Singh Bajaj
         */
        PasswordValidation passwordchecker = new PasswordValidation();
        for (int y = 0; y < 3; y++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter login password: ");
            String pass = input.nextLine();
            if (passwordchecker.password(pass)) {
                break;
            } else if (y == 2) {
                System.out.println("Incorrect number entered 3 times. Program will stop now");
                System.exit(0);
            }
        }

        // Step 3 - Enter number of students
        /**
         * @author Achala Srivastava
         */
        int numOfStudents = numberOfStudents();
        Student[] students = new Student[numOfStudents];// Initialize student class

        // Step 4 - Enter names of students
        /**
         *
         * @author Achala Srivastava
         */

        for (int i = 0; i < students.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter student name ");
            String name = input.nextLine();
            students[i] = new Student(name);
        }

        // Step 5 - Enter student grades
        /**
         *
         * @author Trung Le
         */
        for (Student student : students) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + student.getStudent_Name() + "'s mark in Math "  + ", Credit Hours = 4");
            student.setMath_grade(input.nextDouble());

            System.out.println("Input " + student.getStudent_Name() + "'s mark in Science "  + ", Credit Hours = 5");;
            student.setScience_grade(input.nextDouble());

            System.out.println("Input " + student.getStudent_Name() + "'s mark in Language "  + ", Credit Hours = 4");
            student.setLanguage_grade(input.nextDouble());

            System.out.println("Input " + student.getStudent_Name() + "'s mark in Drama "  + ", Credit Hours = 3");
            student.setDrama_grade(input.nextDouble());

            System.out.println("Input " + student.getStudent_Name() + "'s mark in Music "  + ", Credit Hours = 2");
            student.setMusic_grade(input.nextDouble());

            System.out.println("Input " + student.getStudent_Name() + "'s mark in Biology "  + ", Credit Hours = 4");
            student.setBiology_grade(input.nextDouble());
            student.gpaCalculator();
            student.assignSchool();
        }
        studentReports(students);
    }
    // Step 3 - Enter number of students
    /**
     * @author Achala Srivastava
     */
    public static int numberOfStudents() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number of students: ");
            num = input.nextInt();

            if (num >= 1 && num <= 50) {
                return num;
            } else {
                System.out.println("Invalid number, please enter correct number - between 1 and 50");
            }
        }
        System.out.println("Incorrect number entered 3 times. Program will stop now");
        System.exit(0);
        return num;
    }

    // Step 8 - Reports
    /**
     * @author Katarzyna Karakow
     */
    public static void studentReports(Student[] students) {
        for (Student student : students) {
            if (student.getStudentSchoolName() == "School of Engineering") {
                school_distribution[0] += 1;
            } else if (student.getStudentSchoolName() == "School of Business") {
                school_distribution[1] += 1;
            } else if (student.getStudentSchoolName() == "Law School") {
                school_distribution[2] += 1;
            } else {
                school_distribution[3] += 1;
            }
        }
        System.out.println("Report 1: Student Name, School Name");
        for (Student student : students) {
            System.out.println("Student Name: " + student.getStudent_Name() + "\n"
                    + "School Name: " + student.getStudentSchoolName() + "\n");
        }
        System.out.println("Report 2: Number of accepted students in " +
                "Humber college showing students distribution per each school.");
        for (int u = 0; u < school_names.length; u++) {
            System.out.printf("Number of accepted students in %s: %d",
                    school_names[u], school_distribution[u]);
            System.out.println();
        }

        System.out.println("Report 3: Number of students that not accepted.");
        System.out.println("Number of students that not accepted: " + school_distribution[3] + "\n");

        System.out.println("Report 4: Student Name and Student GPA");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].getStudent_Name() + "\n"
                    + "School GPA: " + students[i].getgpa() + "\n");
        }
    }
}
