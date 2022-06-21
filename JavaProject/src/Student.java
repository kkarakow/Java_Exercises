public class Student {

    private String student_Name; //cant access by dot operator because they are private so you need getters and setters
    private double math_grade;
    private double science_grade;
    private double language_grade;
    private double drama_grade;
    private double music_grade;
    private double biology_grade;
    private double gpa;
    private String studentSchoolName;

    public Student(String name) {
        this.student_Name = name; //constructor- new instance - first function of class
    }

    public String getStudentSchoolName() {
        return studentSchoolName;
    } //getters

    public void setStudentSchoolName(String studentSchoolName) {
        this.studentSchoolName = studentSchoolName;
    }//setters

    public double getgpa() {
        return gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public double getMath_grade() {
        return math_grade;
    }

    public void setMath_grade(double math_grade) {
        this.math_grade = math_grade;
    }

    public double getScience_grade() {
        return science_grade;
    }

    public void setScience_grade(double science_grade) {
        this.science_grade = science_grade;
    }

    public double getLanguage_grade() {
        return language_grade;
    }

    public void setLanguage_grade(double language_grade) {
        this.language_grade = language_grade;
    }

    public double getDrama_grade() {
        return drama_grade;
    }

    public void setDrama_grade(double drama_grade) {
        this.drama_grade = drama_grade;
    }

    public double getMusic_grade() {
        return music_grade;
    }

    public void setMusic_grade(double music_grade) {
        this.music_grade = music_grade;
    }

    public double getBiology_grade() {
        return biology_grade;
    }

    public void setBiology_grade(double biology_grade) {
        this.biology_grade = biology_grade;
    }

    // Step 6 - GPA Calculation

    /**
     * @author Rafael Frederico Muniz Albuquerque
     */
    public void gpaCalculator() {
        this.gpa = (this.math_grade * 4 + this.science_grade * 5 + this.language_grade * 4 + this.drama_grade * 3 + this.music_grade * 2 + this.biology_grade * 4) / 22;
    }
    // Step 7 - Assign students to schools
    /**
     * @author Farman Zaidi
     */
    public void assignSchool() {
        if (gpa >= 90 && gpa <= 100) {
            this.studentSchoolName = "School of Engineering";
        } else if (gpa >= 80 && gpa < 90) {
            this.studentSchoolName = "School of Business";
        } else if (gpa >= 70 && gpa < 80) {
            this.studentSchoolName = "Law School";
        } else {
            this.studentSchoolName = "No school";
        }
    }
}
