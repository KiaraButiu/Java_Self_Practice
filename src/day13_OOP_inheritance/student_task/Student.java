package day13_OOP_inheritance.student_task;

public class Student {
    private String name, gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Name cannot be empty, blank or null: " + getName());
            System.exit(1);
        }
        for (int i = 0; i < name.length() ; i++) {
            char ch = name.charAt(i);

            if (! (Character.isLetter(name.charAt(0)))){
                System.err.println("Name should start with a letter: " + getName());;
                System.exit(1);
            }
            if (! (Character.isLetterOrDigit(ch) || ch == ' ')){
                System.err.println("Name cannot be a special character: " + getName());
            }
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isEmpty() || gender.isBlank()) {
            System.err.println("Gender cannot be empty, blank or null: " + getGender());
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Age cannot be a negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public Student(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age;
    }
}
/* Student Task Requirements:
1. Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.

2. Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).

3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.

4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
*/