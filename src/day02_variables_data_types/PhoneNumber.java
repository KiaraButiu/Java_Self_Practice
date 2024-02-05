package m10_variables_data_types;

public class PhoneNumber {
    public static void main(String[] args) {

        byte countryCode = 1;
        short areaCode = 703;
        int localNumber = 4512625;

        System.out.println("+" + countryCode + "(" + areaCode + ")-" + localNumber);
    }
}
