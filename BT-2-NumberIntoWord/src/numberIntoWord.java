import java.util.Scanner;

public class numberIntoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số vào đây");
        int number = scanner.nextInt();
        String result = "";
        int hundred = number / 100;
        int tens = number /10;
        int unit = number % 10;
        if (number<10 && number>=0){
            switch (number){
                case 0 -> result = "zero" ;
                case 1 -> result = "one";
                case 2 -> result = "two";
                case 3 -> result = "three";
                case 4 -> result = "four";
                case 5 -> result = "five";
                case 6 -> result = "six";
                case 7 -> result = "seven";
                case 8 -> result = "eight";
                case 9 -> result = "nine";
                case 10 -> result = "ten";
            }
        }
        if (number < 20){
            switch (number){
                case 1 -> result = "eleven"
                case 2 -> result = "twelve"
                case 3 -> result = "thirteen"
                case 4 -> result = "fourteen"
                case 5 -> result = "fiveteen"
                case 6 -> result = "sixteen"
                case 7 -> result = "seventeen"
                case 8 -> result = "eighteen"
                case 9 -> result = "nineteen"
            }

        }
    }

}
