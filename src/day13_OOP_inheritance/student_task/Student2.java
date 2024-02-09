package day13_OOP_inheritance.student_task;

public class Student2 extends Student  {

    private String studentId;
    private String fieldOfStudy;
    private String schoolName;
    private char grade;

    public Student2(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isBlank() || studentId.isEmpty()){
            System.err.println("Invalid student ID");
            System.exit(1);
        }

        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isBlank() || fieldOfStudy.isEmpty()){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isBlank() || schoolName.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {

        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " " + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade ;
    }
}
/* Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).*/
