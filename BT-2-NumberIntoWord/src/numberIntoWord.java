import java.util.Scanner;

public class numberIntoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number (max 3 digits)");
        int number = scanner.nextInt();
        String result;
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 0 -> System.out.println("zero");
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
                case 10 -> System.out.println("ten");
            }
        }
        else if (number < 20) {
            int tens = number % 10;
            switch (tens) {
                case 1 -> System.out.println("eleven");
                case 2 -> System.out.println("twelve");
                case 3 -> System.out.println("thirteen");
                case 4 -> System.out.println("fourteen");
                case 5 -> System.out.println("fifteen");
                case 6 -> System.out.println("sixteen");
                case 7 -> System.out.println("seventeen");
                case 8 -> System.out.println("eighteen");
                case 9 -> System.out.println("nineteen");
            }
        }
        else if (number < 100) {
            int tens = number / 10;
            int unit = number % 10;
            result = "";
            switch (tens) {
                case 2 -> result += "twenty ";
                case 3 -> result += "thirty ";
                case 4 -> result += "fourty ";
                case 5 -> result += "fifty ";
                case 6 -> result += "sixty ";
                case 7 -> result += "seventy ";
                case 8 -> result += "eighty ";
                case 9 -> result += "ninety ";
            }
            switch (unit) {
                case 1 -> result += "one";
                case 2 -> result += "two";
                case 3 -> result += "three";
                case 4 -> result += "four";
                case 5 -> result += "five";
                case 6 -> result += "six";
                case 7 -> result += "seven";
                case 8 -> result += "eight";
                case 9 -> result += "nine";
            }
            System.out.println(result);
        }
        else if (number < 1000){
            int hundred = number / 100;
            int tens = (number % 100) / 10;
            int unit = (number % 100) % 10;
            result = "";
            switch (hundred){
                case 1 -> result += "one hundred ";
                case 2 -> result += "two hundred ";
                case 3 -> result += "three hundred ";
                case 4 -> result += "four hundred ";
                case 5 -> result += "five hundred ";
                case 6 -> result += "six hundred ";
                case 7 -> result += "seven hundred ";
                case 8 -> result += "eight hundred ";
                case 9 -> result += "nine hundred ";
            }
            switch (tens){
                case 0 -> result += "";
                case 1 -> result += "and ten ";
                case 2 -> result += "and twenty ";
                case 3 -> result += "and thirty ";
                case 4 -> result += "and fourty ";
                case 5 -> result += "and fifty ";
                case 6 -> result += "and sixty ";
                case 7 -> result += "and seventy ";
                case 8 -> result += "and eighty ";
                case 9 -> result += "and ninety ";
            }
            switch (unit){
                case 0 -> result += " ";
                case 1 -> result += "one";
                case 2 -> result += "two";
                case 3 -> result += "three";
                case 4 -> result += "four";
                case 5 -> result += "five";
                case 6 -> result += "six";
                case 7 -> result += "seven";
                case 8 -> result += "eight";
                case 9 -> result += "nine";
            }
            System.out.println(result);
        }
        else {
            System.out.println("Out of Ability");
        }
    }
}
