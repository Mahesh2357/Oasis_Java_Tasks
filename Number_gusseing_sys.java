import java.util.Random;
import java.util.Scanner;

public class Number_gusseing_sys {
    public static void main(String[] args) {
        Random rand = new Random();
        int Randomnumber = rand.nextInt(100) + 1;
        int trycount = 0;
        System.out.println(Randomnumber);

        while (true) {
            System.out.println("Enter the Guess(1-100)");
            Scanner sc = new Scanner(System.in);
            int playerguess = sc.nextInt();
            trycount++;
            if (playerguess == Randomnumber) {
                System.out.println("correct! You Win");
                System.out.println("it took you" + trycount + "tries");
                break;

            }

            else if (Randomnumber > playerguess) {
                System.out.println("no the number is higher, please guess again ");
            } else {
                System.out.println("no the number is lower, please guess again ");
            }
        }
        System.out.println("your accuracy is" + (10 - trycount) * 10 + "%");

    }
}
