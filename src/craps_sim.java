import java.util.Scanner;
import java.util.Random;

public class craps_sim {
    public static void main(String [] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String play = "Y";

        while (play.equalsIgnoreCase("Y")) {
            System.out.println("Welcome to the Craps Simulator!");
            System.out.println(" Rule 1: If the sym is 2, 3, or 12 it is called 'crapping out' and the game is over with a loss.");
            System.out.println(" Rule 2: If the sym is 7 or 11 it called a 'natural' and the game is over with a win. ");
            System.out.println(" Rule 3: For all other values, the sum becomes 'the point' and the user makes subsequent rolls until \n they either roll a 7, in which case they loose, or they roll the point sum in which case they win. ");

            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            int sum = d1 + d2;

            System.out.println("Roll 1:" + d1);
            System.out.println("Roll 2:" + d2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("/nSorry, you crapped out.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("/n You win!");
            } else {
                int point = sum;
                System.out.println();
                System.out.println("Reroll, you must roll a " + point + "in order to win. If you roll a 7, it will result in a loss ");

                while (true) {
                    d1 = rand.nextInt(6) + 1;
                    d2 = rand.nextInt(6) + 1;
                    sum = d1 + d2;

                    System.out.println("Roll 1: " + d1);
                    System.out.println("Roll 2: " + d2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("/n You win!");
                        break;
                    } else {
                        System.out.println();
                    }
                }
            }

            System.out.println("Play again? [Y/N] ");
            play = scan.next();
            System.out.println();
        }
    }
}
