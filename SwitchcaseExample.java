import java.util.*;
public class SwitchcaseExample {
    public static void main(String[] args){
        //int day = 2;
        Scanner d = new Scanner(System.in);
        int day = d.nextInt();
        switch (day) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tueday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thrusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("No Day");
            break;
        }
    }
}
