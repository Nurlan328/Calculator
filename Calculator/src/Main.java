
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int a;
    static String operator;
    static int b;
    static int res;

    static String sa;
    static String sb;

    public static void arabian() {

        switch (operator) {
            case "+":
                res = a + b;
                System.out.println(res);
                break;

            case "-":
                res = a - b;
                System.out.println(res);
                break;

            case "*":
                res = a * b;
                System.out.println(res);
                break;

            case "/":
                res = a / b;
                System.out.println(res);
                break;

            default:
                System.out.println("Please enter only  +, -, *, / operators");
        }

        scanner.close();
    }

    public static final int[] decimal = {1, 4, 5, 9, 10};
    public static final String[] letters = {"I", "IV", "V", "IX", "X"};

    public static String arabicToRoman(int num) {
        String roman = "";

        while (num > 0) {
            int maxFound = 0;
            for (int i = 0; i < decimal.length; i++) {
                if (num >= decimal[i]) {
                    maxFound = i;
                }
            }
            roman += letters[maxFound];
            num -= decimal[maxFound];
        }

        return roman;
    }

    public static void roman() {
        switch (operator) {
            case "+":
                res = a + b;
                System.out.println(res);

                break;

            case "-":
                res = a - b;
                System.out.println(res);
                break;

            case "*":
                res = a * b;
                System.out.println(res);
                break;

            case "/":
                res = a / b;
                System.out.println(res);
                break;

            default:
                System.out.println("Please enter only  +, -, *, / operators");
        }
    }

    public static int romanToDecimal(String romanNumber) {
        int arabian = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();

        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {

                case 'X':
                    arabian = processArabian(10, lastNumber, arabian);
                    lastNumber = 10;
                    break;

                case 'V':
                    arabian = processArabian(5, lastNumber, arabian);
                    lastNumber = 5;
                    break;

                case 'I':
                    arabian = processArabian(1, lastNumber, arabian);
                    lastNumber = 1;
                    break;
            }
        }
        return arabian;
    }

    public static void Roman () {
        switch (operator) {
            case "+":
                res = a + b;
                String res2 = arabicToRoman(res);
                System.out.println(res2);

                break;

            case "-":
                res = a - b;
                String res3 = arabicToRoman(res);
                System.out.println(res3);
                break;

            case "*":
                res = a * b;
                String res4 = arabicToRoman(res);
                System.out.println(res4);
                break;

            case "/":
                res = a / b;
                String res5 = arabicToRoman(res);
                System.out.println(res5);
                break;

            default:
                System.out.println("Please enter only  +, -, *, / operators");
        }

    }

    public static int processArabian(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public static void main(String[] args) {

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            operator = scanner.next();
            b = scanner.nextInt();

            if (a > 1 & a <= 10 & b > 1 & b <= 10) {
                arabian();
            }

        } else if (scanner.hasNext()) {
            sa = scanner.next();
            operator = scanner.next();
            sb = scanner.next();

            a = romanToDecimal(sa);
            b = romanToDecimal(sb);

            Roman();
        }

    }
}







