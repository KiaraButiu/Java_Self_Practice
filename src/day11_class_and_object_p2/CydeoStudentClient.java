package day11_class_and_object_p2;

public class CydeoStudentClient {

    public static void main(String[] args) {

        CydeoStudent.schoolName = "Cydeo";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        CydeoStudent student1 = new CydeoStudent("Kiara", 28, 98.9, 33,12 );
        student1.study();
        student1.attendClass();

        CydeoStudent student2 = new CydeoStudent("Edward", 30, 96.4, 34, 17);
        System.out.println(student2);
        student2.study();
        student2.attendClass();


    }
}
