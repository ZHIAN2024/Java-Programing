import java.util.Calendar;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("enter full year:");
        int year = scanner.nextInt();

        System.out.print("enter month between 1 and 12:");
        int month = scanner.nextInt();


        if (month < 1 || month > 12) {
            System.out.println("enter right year:");
            return;
        }

  
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); 

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
    
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
 
        System.out.printf("%d年 %d月\n", year, month);
        System.out.println("日 一 二 三 四 五 六");
        

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
