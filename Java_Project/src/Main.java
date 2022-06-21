import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int num = 0;
//    public static int numOfStudents = numberOfStudents(num);
//    public static Student students[] = new Student[numOfStudents];
    public static String[] student_school = new String[3];
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
        PasswordValidation password = new PasswordValidation();
        for (int y = 0; y < 3; y++) {
            System.out.println("Enter login password: ");
            String pass = input.nextLine();
            if (PasswordValidation.password(pass) == true) {
                break;
            }
        }

        // Step 3 - Enter number of students
        /**
         * @author Achala Srivastava
         */
        int numOfStudents = numberOfStudents(num);
        Student[] students = new Student[numOfStudents];

        // Step 4 - Enter names of students
        /**
         *
         * @author Achala Srivastava
         */
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student name ");
            String name = input.nextLine();
            students[i].setStudent_Name(name);
        }

        // Step 5 - Enter student grades
        /**
         *
         * @author Trung Le
         */
        for (int i = 0; i < students.length; i++) {
            System.out.println("Input student mark in Math " + students[i].getStudent_Name() + ", Credit Hours = 4");
            students[i].setMath_grade(input.nextDouble());

            System.out.println("Input student mark in Science " + students[i].getStudent_Name() + ", Credit Hours = 5");
            students[i].setScience_grade(input.nextDouble());

            System.out.println("Input student mark in Language " + students[i].getStudent_Name() + ", Credit Hours = 4");
            students[i].setLanguage_grade(input.nextDouble());

            System.out.println("Input student mark in Drama " + students[i].getStudent_Name() + ", Credit Hours = 3");
            students[i].setDrama_grade(input.nextDouble());

            System.out.println("Input student mark in Music " + students[i].getStudent_Name() + ", Credit Hours = 2");
            students[i].setMusic_grade(input.nextDouble());

            System.out.println("Input student mark in Biology " + students[i].getStudent_Name() + ", Credit Hours = 4");
            students[i].setBiology_grade(input.nextDouble());
        }
    }

    // Step 6 - GPA Calculation

    /**
     * @author Rafael Frederico Muniz Albuquerque
     */
    public static double gpaCalculator() {
        double gpa = 0;
        int numOfStudents = numberOfStudents(num);
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < students.length; i++) {
            double math = students[i].getMath_grade();
            double science = students[i].getScience_grade();
            double language = students[i].getLanguage_grade();
            double drama = students[i].getDrama_grade();
            double music = students[i].getMusic_grade();
            double biology = students[i].getBiology_grade();

            gpa = (math * 4 + science * 5 + language * 4 + drama * 3 + music * 2 + biology * 4) / 22;
            students[i].setStudentGPA(gpa);
        }
        return gpa;
    }

    // Step 7 - Assign students to schools

    /**
     * @author Farman Zaidi
     */
    public static void grades(int number) {
        int numOfStudents = numberOfStudents(num);
        Student[] students = new Student[numOfStudents];

//        String[] student_school = new String[number];
//        String[] school_names = {"School of Engineering", "School of Business", "Law School"};
//        int[] school_distribution = new int[]{0, 0, 0, 0};
        for (int i = 0; i < students.length; i++) {

            double gpa = students[i].getStudentGPA();
            if (gpa >= 90 && gpa <= 100) {
                student_school[i] = "School of Engineering";
                school_distribution[0] += 1;
            } else if (gpa >= 80 && gpa < 90) {
                student_school[i] = "School of Business";
                school_distribution[1] += 1;
            } else if (gpa >= 70 && gpa < 80) {
                student_school[i] = "Law School";
                school_distribution[2] += 1;
            } else {
                school_distribution[3] += 1;
            }

            students[i].setStudentSchoolName(student_school[i]);
        }
    }

    // Step 3 - Enter number of students
    /**
     * @author Achala Srivastava
     */
    public static int numberOfStudents(int num) {
//        int num = 0;

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
    public static void studentReports() {

        int numOfStudents = numberOfStudents(num);
        Student[] students = new Student[numOfStudents];

        System.out.println("Report 1: Student Name, School Name");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].getStudent_Name() + "\n"
            + "School Name: " + students[i].getStudentSchoolName());
        }

        System.out.println("Report 2: Number of accepted students in " +
                "Humber college showing students distribution per each school.");
        for (int u = 0; u < school_names.length; u++) {
            System.out.printf("Number of accepted students in %s: %d",
                    school_names[u], school_distribution[u]);
        }

        System.out.println("Report 3: Number of students that not accepted.");
        System.out.println("Number of students that not accepted: " + school_distribution[3]);

        System.out.println("Report 4: Student Name and Student GPA");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].getStudent_Name() + "\n"
                    + "School GPA: " + students[i].getStudentGPA());
        }

    }
}





