package day13_OOP_inheritance.student_task;

public class GraduateStudent extends Student2 {

    public GraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println("Graduate student: " + getName() + " " + getSchoolName());
    }
}
