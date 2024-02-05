package day05_loop_statement;
/*  2. Print the even numbers which starts from 1 and ends at 19
in the same line with a dash between the numbers.*/
public class OddNumbers {
    public static void main(String[] args) {

        System.out.print(1);

        for (int i = 3; i <= 19; i += 2) {

 //         or  if (i % 2 == 1)

                System.out.print("-" + i);

            }
        }
    }
