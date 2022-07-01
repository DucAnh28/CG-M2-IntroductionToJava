import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month do you want to count days ?");
        int month = scanner.nextInt();
        String DaysInMonth;
        switch (month) {
            case 2:
                DaysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DaysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DaysInMonth = "30";
                break;
            default:
                DaysInMonth = "";
                break;
        }
        if (!DaysInMonth.equals("")) System.out.printf("The month '%d' has %s days !",month,DaysInMonth);
        else System.out.println("Invalid input");
    }
}
