package day13_OOP_inheritance.student_task;

public class StudentClient {
    public static void main(String[] args) {

        Student2 student = new Student2("Edward","Male",28, "1234", "Business Management",
                "John Hopkins", 'A');
        student.study();
        System.out.println(student);

        System.out.println("--------------------");

        GraduateStudent gradStudent = new GraduateStudent("Jasmine", "female", 26, "0987", "Nursing",
                "UMD", 'A');
        gradStudent.study();
        System.out.println(gradStudent);

        System.out.println("--------------------");

        UndergradStudent undergradStudent = new UndergradStudent("Amahara", "female", 19, "7654",
                "Accounting", "Towson",'B');
        undergradStudent.study();
        System.out.println(undergradStudent);

        System.out.println("--------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Kiara", "female", 28, "4321",
                "SDET", "Cydeo", 'A', 33, 12, "Java");
        cydeoStudent.study();
        System.out.println(cydeoStudent);

    }
}
