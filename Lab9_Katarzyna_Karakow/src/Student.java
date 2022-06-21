public class Student {

    // Canadian Business final grade
    private double can_bus_grade;
    // Database and SQL final grade
    private double database_grade;
    // Introduction to analytics final grade
    private double bia_grade;
    // Operations Management final grade
    private double op_mgmt_grade;
    // Quantitative Methods I final grade
    private double qm1_grade;
    // Statistical Software Language final grade
    private double ssl_grade;

    public Student(){
    }

    public double getCan_bus_grade() {
        return can_bus_grade;
    }

    public void setCan_bus_grade(double can_bus_grade) {
        this.can_bus_grade = can_bus_grade;
    }

    public double getDatabase_grade() {
        return database_grade;
    }

    public void setDatabase_grade(double database_grade) {
        this.database_grade = database_grade;
    }

    public double getBia_grade() {
        return bia_grade;
    }

    public void setBia_grade(double bia_grade) {
        this.bia_grade = bia_grade;
    }

    public double getOp_mgmt_grade() {
        return op_mgmt_grade;
    }

    public void setOp_mgmt_grade(double op_mgmt_grade) {
        this.op_mgmt_grade = op_mgmt_grade;
    }

    public double getQm1_grade() {
        return qm1_grade;
    }

    public void setQm1_grade(double qm1_grade) {
        this.qm1_grade = qm1_grade;
    }

    public double getSsl_grade() {
        return ssl_grade;
    }

    public void setSsl_grade(double ssl_grade) {
        this.ssl_grade = ssl_grade;
    }

    public double student_GPA(){
        return (this.can_bus_grade + this.database_grade + this.bia_grade + this.op_mgmt_grade + this.qm1_grade + this.ssl_grade)/6;
    }


    @Override
    public String toString() {
        return "Student Grades: " +
                "\n Canadian Business: " + can_bus_grade +
                "\n Database and SQL: " + database_grade +
                "\n Introduction to Analytics: " + bia_grade +
                "\n Operations Management: " + op_mgmt_grade +
                "\n Quantitative Methods I: " + qm1_grade +
                "\n Statistical Software Languages: " + ssl_grade;
    }
}
