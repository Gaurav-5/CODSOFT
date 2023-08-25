import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int num =  ran.nextInt(100)+1;
        int Count = 0;
        while (true) {
            System.out.println("Enter your guess between\n(1-100)\n");
            Scanner sc = new Scanner(System.in);
            int yournum = sc.nextInt();
            Count++;
            if (yournum == num) {
                System.out.println("Correct ! You Win!");
                System.out.println("you have " +Count+ " Attempt");
                break;
            } else if (yournum > num) {
                System.out.println("Wow Sorry Try again This NUMBER is higher");

            } else {
                System.out.println("Wow Sorry Try again This NUMBER is Lower");
            }

        }
    }

}