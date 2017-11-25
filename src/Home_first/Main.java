package Home_first;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //1.Приветствовать любого пользователя при вводе его имени через командную строку.
      /*
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String Name = userInputScanner.nextLine();
        System.out.println("Hello " + Name + "!");
       */


        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
       /*
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);

        }
       */

        //3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.


       /* String b = "Number of random numbers with a new line";
        String b1 = "Number of random numbers without a new line";
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
            b1+= " "+args[i];
        }
        System.out.print("\n" + b1);

        */
        // System.out.print("You enter next numbers: ");

        //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

       /* String s = "12345";
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a password and press Enter ");
        String Name = Scan.nextLine();
        if (s.equals(Name)) {
            System.out.print("The password is equal to the entered string");
        } else System.out.print("The password is not equal to the entered string");
        */

        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        /*
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter 2 numbers clicking Enter button ");
        Integer numb1 = Scan.nextInt();
        Integer numb2 = Scan.nextInt();
        System.out.println("sum = " +(numb1+numb2));
        System.out.print("multiplication = " +(numb1*numb2));
        */

        //6.Ввести с консоли n целых чисел. На консоль вывести:

        // Input and read from the console

       /* Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of numbers and click Enter button ");
        int count = in.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i <= count - 1; i++) {
            System.out.print("Enter the number and click Enter button ");
            arr[i] = in.nextInt();

        }
        */
        // HappyNumbers(count, arr);
        //EvenOddNumbers(count, arr);
        //MinMax(count, arr);
        //DivBy3or9(count, arr);
        //DivBy7and9(count, arr);
        //DifferentThreeDigitNumber(count, arr);
        //ElemEqualMiddle(arr);


    }
/*
  private static void HappyNumbers(int count, int[] arr) {
        String b = "Three-digit number";
        String number, number1;
        Integer indicator =0;
        int notNegative;
        int sum1=0;
        int sum2=0;
        String happy = "Happy numbers: ";
        for ( int i = 0; i < count; i++) {
            if (arr[i] < 0) {
                notNegative = arr[i] * (-1);
            } else
                notNegative = arr[i];
            number1 = new Integer(notNegative).toString();
            if (number1.length() % 2 == 0) {
                for (int j = 0; j < number1.length() / 2; j++) {
                    sum1 += number1.charAt(j);
                    sum2 += number1.charAt(number1.length() - j - 1);
                }
                if (sum1 == sum2) {
                    happy += " " + arr[i];
                }
            }
        }

        System.out.print("\n" +  happy);


    }
*/
    /* private static void ElemEqualMiddle(int[] arr) {
        String s = "Elements that are equal to the half-sum of neighboring elements: ";
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == (arr[i - 1] + arr[i + 1]) / 2) {
                s += " " + arr[i];
            }
        }
        System.out.print("\n" + s);
    }
    */
   /* private static void DifferentThreeDigitNumber(int count, int[] arr) {
        Integer i;
        String b = "Three-digit number";
        String number;
        for ( i = 0; i < count; i++) {
            number = new Integer(arr[i]).toString();
           if (arr[i] > 99 && arr[i] < 1000 && number.charAt(0) != number.charAt(1)
                   && number.charAt(0) != number.charAt(2) && number.charAt(1) != number.charAt(2)) {
               b += " " + arr[i];
            }
        }
        System.out.print("\n" + b);
    }*/
   /* private static void DivBy7and9(int count, int[] arr) {
        String div = "Numbers that are divisible by 5 or 7: ";
        for (int i = 0; i < count; i++) {
            if ((arr[i] % 5 == 0) && (arr[i] % 7 == 0)) {
                div += " " + arr[i];
            }
        }
        System.out.print("\n" + div);
    }
   */

 /*   private static void DivBy3or9(int count, int[] arr) {
        String div = "Numbers that are divisible by 3 or 9";
        for (int i = 0; i < count; i++) {
            if ((arr[i]%3==0)||(arr[i]%9==0)){
                div += " " + arr[i];
            }
        }
        System.out.print("\n" + div);
    }
*/
   /* private static void MinMax(int count, int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("min=" + min + " max=" + max);

    }
*/
       /*private static void EvenOddNumbers(int count, int[] arr) {
        String odd = "odd numbers: ", even = "even numbers: ";
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 0) {
                even += " " + arr[i];
            } else {
                odd += " " + arr[i];
            }

        }
        System.out.print("\n" + even + " \n" + odd);
        }*/


}



