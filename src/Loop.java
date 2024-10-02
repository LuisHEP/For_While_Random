import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        Random generate = new Random();

        System.out.println("\nMétodo com while: ");
        int y = 0;
        while(y < 10) {
            int number = generate.nextInt(100);
            System.out.println(number);
            y++;
        }

        System.out.println("\nMétodo com for: ");
        for(int i = 0; i < 10; i++) {
            int number = generate.nextInt(100);
            System.out.println(number);
        }
    }
}
