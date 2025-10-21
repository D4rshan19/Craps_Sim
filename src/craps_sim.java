import java.util.Random;

public class craps_sim {
    public static void main(String [] args) {
        System.out.println("Welcome to the Craps Simulator!");
        System.out.println(" Rule 1: If the sym is 2, 3, or 12 it is called 'crapping out' and the game is over with a loss.");
        System.out.println(" Rule 2: If the sym is 7 or 11 it called a 'natural' and the game is over with a win. ");
        System.out.println(" Rule 3: For all other values, the sum becomes 'the point' and the user makes subsequent rolls until \n they either roll a 7, in which case they loose, or they roll the point sum in which case they win. ");
        Random rand = new Random();
    }
}
