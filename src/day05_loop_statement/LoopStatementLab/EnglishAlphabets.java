package day05_loop_statement.LoopStatementLab;
/* 2. Create a class named EnglishAlphabets, and write a program that
displays alphabet letters from A to Z in the same line separated by a space.*/
public class EnglishAlphabets {
    public static void main(String[] args) {

        for (char i = 65; i <=90 ; i++) {
            System.out.print(i + " ");
        }
    }
}
