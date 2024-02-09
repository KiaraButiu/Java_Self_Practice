package day13_OOP_inheritance.student_task;

public class CydeoStudent extends Student2{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, String gender, int age, String studentId, String fieldOfStudy,
                        String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {

        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
       setBatchNumber(batchNumber);
       setGroupNumber(groupNumber);
       setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank() || programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void study() {
        System.out.println("Cydeo Student: " + getName() + " " + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}



/*3.3 CydeoStudent:
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
           - Override the toString method */