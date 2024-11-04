import java.util.Random;

public class task11 {
    public static void main(String[] args) {
        final int num = 175;
        final int num1 = 25;
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            char ch = (char) ('a' + random.nextInt(26)); 
            System.out.print(ch); 

            if ((i + 1) % num1 == 0) {
                System.out.println(ch); 
            }
        }
    }
}

