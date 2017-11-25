package Home_first;

import java.util.Scanner;

/**
 * Created by Viktoriia_Sherstiuk on 6/6/2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений
        //от -n до n с помощью датчика случайных чи-сел.

        System.out.print("Enter (n) the size of the array ");
        int n = in.nextInt();
        int arraytwo[][];
        arraytwo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arraytwo[j][i]=((int)(Math.random() * (n)*2) - n);

            }
        }
        int e = 0;
        for (int i=0;  i<n; i++)
            for (int k=i+1; k < n; k++) {
                if ( arraytwo[i][e] >  arraytwo[k][e]){
                    for (int j=0; j < n; j++) {
                        int temp =  arraytwo[i][j];
                        arraytwo[i][j]= arraytwo[k][e];
                        arraytwo[k][e]=temp;
                    }
                }
            }
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                System.out.print(arraytwo[i][j] + "  ");
            }
        }

        //Input number n from console for tasks #1-8
     /*System.out.print("Enter the amount of numbers with a space and click Enter button ");
       String count =  in.nextLine();
       String[] arr = count.split(" ");*/



        //1. findShortestAndLongestString(arr);
        //2. sortStringsWithAscOrDescByLength(arr);
        //3. findAverageStringsLength(arr);
        //4. findWordWithMinDifferentSymbols(arr);
        //5. findnumbersWithEqualOddDigitAndEven(arr);
        //7. numbersWithOnlyDifferentDigit(arr);
        //8. arrTwoDimensionalLeftToRightAndTopToBottom(in);


    }
    //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
  /*  private static void arrTwoDimensionalLeftToRightAndTopToBottom(Scanner in) {
        int n, k, arrtwo[][], min = 1;
        System.out.print("Enter (k) ");
        k = in.nextInt();
        System.out.print("Enter (n) the size of the array ");
        n = in.nextInt();
        arrtwo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrtwo[i][j] = min;
                min++;
            }
        }
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrtwo[i][j] + "  ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrtwo[j][i] + "  ");
            }
        }
    }*/


    //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
    /*private static void numbersWithOnlyDifferentDigit(String[] arr) {
        String result = "";
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            if (allDiffWords(arr[i]) == true) {
                result = arr[i]+" ";
                break;
            }
        }
        System.out.println("Number consisting only of different digits " + result);
    }*/
//5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
   /* public static void findnumbersWithEqualOddDigitAndEven(String[] arr) {
        if (arr.length == 0) {
            System.out.println("Нет слов");
            return;
        }
        int quantity = 0;
        String result1 = "";
        int numArr[] = new int[arr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
            if (numArr[i] % 2 == 0) {
                result1 += " " + arr[i];
            }

        }
        String[] oddnum = result1.split(" ");
        for (int i = 1; i < oddnum.length; i++) {
            if (oddDigit(oddnum[i]) == evenDigit(oddnum[i])) {
                quantity++;
            }
        }
        System.out.println(quantity++);

    }
*/



//4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
  /* public static void findWordWithMinDifferentSymbols(String[] arr) {
       final String message = "Слово, в котором число различных символов минимально (число различных символов): ";
       if (arr.length == 0) {
           System.out.println(message + "Нет слов");
           return;
       }
       String result = arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (diffWords(result) > diffWords(arr[i])) {
               result = arr[i];
           }
       }
       System.out.println(message + result + "(" + diffWords(result)
               + ")");
   }*/
      /*
         //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
         private static void findShortestAndLongestString(String[] arr) {
             int b = 0, a = 0;
             String number, a1 = "", b1 = "";
             String max = String.valueOf(arr[0]);
             String min = String.valueOf(arr[0]);
             for (int i = 0; i < arr.length; i++) {
                 number = new Integer(arr[i]).toString();
                 if (min.length() >= number.length()) {
                     min = String.valueOf(arr[i]);
                     a = number.length();
                 }
                 if (number.length() >= max.length()) {
                     max = String.valueOf(arr[i]);
                     b = number.length();
                 }
             }
             for (int j = 0; j < arr.length; j++) {
                 number = new Integer(arr[j]).toString();
                 if (a == number.length()) {
                     a1 += " " + arr[j];
                 }
                 if (b == number.length()) {
                     b1 += " " + arr[j];
                 }
             }
             System.out.print("min=" + a1 + " length=" + a + " max=" + b1 + " length=" + b);
         }
*/

  /*
  //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

    private static void findAverageStringsLength(String[] arr) {
        int sum=0, no=0, no1=0;
        for (int i = 0; i < arr.length; i++) {
            //number = new Integer(arr[i]).toString();
            sum += arr[i].length();
        }
        System.out.print("findMoreAverageStringsLength: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > sum / 2) {
                System.out.print(arr[i] + "(lenght:");
                System.out.print(arr[i].length() + "), ");
            } else {
                no += 1;
            };
        }
        if (no >=arr.length ) {
            System.out.print("no such numbers");
        }
        System.out.print("\n" + "findLessAverageStringsLength: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < sum / 2) {
                System.out.print(arr[i] + "(lenght:" );
                System.out.print(arr[i].length() + "), ");
            } else {
                no1 += 1;
            };
        }
        if (no1>=arr.length ){
            System.out.print( "no such numbers");
        }
    }
    */
/*
    //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
    private static void sortStringsWithAscOrDescByLength(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                String number = new Integer(arr[i]).toString();
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.print("The numbers with ascending sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n" + "The numbers with descending sorting: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
*/
}
