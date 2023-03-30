import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Task 1

        System.out.println("Task 1: ");

        System.out.println("Please enter the length of array you want to define: ");
        int arrayDesiredLength = reader.nextInt();
        int[] integerArray = new int[arrayDesiredLength];
        System.out.println("Length of array " + integerArray.length);

        for (int i = 0; i <= integerArray.length - 1; i++) {
            System.out.println("Please enter the " + (i + 1) + ". element value: ");
            int value = reader.nextInt();
            integerArray[i] = value;
        }

        for (int i = (integerArray.length - 1); i >= 0; i--) {
            System.out.println(integerArray[i]);
            if ((integerArray[i] % 2 == 0)) {
                System.out.println("The number is even number.");
            } else {
                System.out.println("The number is not an even number.");
            }
            if ((integerArray[i] > 10)) {
                System.out.println("The number is greater than 10.");
            } else {
                System.out.println("The number is not greater than 10.");
            }
        }

        // Zadatak 2

        System.out.println("Task 2: ");
        int[] arrayOFNumbers = {123, 23, 3, 0, 1, 2, 4, 5, 120, 19, 20, 21, 22, 23, 24, 26, 98};
        String[] ordinalNumbers = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
        int condition;

        if (arrayOFNumbers.length <= ordinalNumbers.length) {
            condition = arrayOFNumbers.length;
        } else {
            condition = ordinalNumbers.length;
        }

        for (int i = 0; i <= (condition - 1); i++) {
            System.out.println(ordinalNumbers[i] + " number in array: " + arrayOFNumbers[i]);
        }

        // Zadatak 3

        System.out.println("Task 3: ");

        int[] anyArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(anyArray.length);
        int[] anyArrayToOpposite = new int[anyArray.length];
        for (int i = (anyArray.length - 1); i >= 0; i--) {
            anyArrayToOpposite[(anyArray.length - 1) - i] = anyArray[i];
        }

        System.out.println("New opposite array is : ");
        for (int i = 0; i <= (anyArrayToOpposite.length - 1); i++) {
            System.out.println(anyArrayToOpposite[i]);
        }

        // Zadatak 4

        System.out.println("Task 4: ");

        System.out.println("Please insert a word to check if it is palindrome:");
        String wordPalindrome = reader.next();

        char[] stringToChar = wordPalindrome.toCharArray();
        int middleOfArray = (stringToChar.length / 2) - 1;
        boolean toCheckPalindrome = true;

        for (int i = 0; i <= middleOfArray; i++) {
            if (stringToChar[i] == stringToChar[(stringToChar.length - 1) - i]) {
                toCheckPalindrome = true;
            } else toCheckPalindrome = false;
        }

        if (toCheckPalindrome == true) {
            System.out.println("The inserted word " + wordPalindrome + " is palindrome.");
        } else {
            System.out.println("The inserted word " + wordPalindrome + " is not a palindrome.");
        }

        // Zadatak 5

        System.out.println("Task 5: ");

        System.out.println("Please enter the lower number in range: ");
        int lowerNumber = reader.nextInt();
        System.out.println("Please enter the larger number in range: ");
        int largerNumber = reader.nextInt();
        int lengthOfArray = (largerNumber - lowerNumber) - 1;
        int[] arrayOfNumbers = new int[lengthOfArray];
        int[] arrayOfEvenNumbers = new int[(lengthOfArray/2)+1];
        int j = 0;

        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            arrayOfNumbers[i] = (lowerNumber + 1) + i;
            System.out.println(arrayOfNumbers[i]);

            if ((arrayOfNumbers[i] % 2) == 0) {
                arrayOfEvenNumbers[j] = arrayOfNumbers[i];
                j++;
            }
        }

        System.out.println("Even numbers for range " + lowerNumber + " to " + largerNumber + " are: ");

        for (int i = 0; i <= arrayOfEvenNumbers.length - 1; i++) {
            System.out.print(arrayOfEvenNumbers[i] + ",");
        }

        // Zadatak 6

        System.out.println("Task 6: ");

        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6, 7};
        int[] arrayThree = {7, 8};
        int lengthFinal = arrayOne.length + arrayTwo.length + arrayThree.length;
        int[] arrayOneTwoThree = new int[lengthFinal];

        for (int i = 0; i <= arrayOne.length - 1; i++) {
            arrayOneTwoThree[i] = arrayOne[i];
        }
        for (int i = 0; i <= arrayTwo.length - 1; i++) {
            arrayOneTwoThree[i + (arrayOne.length)] = arrayTwo[i];
        }
        for (int i = 0; i <= arrayThree.length - 1; i++) {
            arrayOneTwoThree[(arrayOne.length + arrayTwo.length) + i] = arrayThree[i];
        }

        for (int i = 0; i <= arrayOneTwoThree.length - 1; i++) {
            System.out.println(arrayOneTwoThree[i]);
        }

        // Zadatak 7

        System.out.println("Task 7: ");

        int[] arrayFirst = {1, 2, 3, 4, 5, 6, 7};
        int[] arraySecond = {1, 1, 1, 1, 1};
        int maxValue = max(arrayFirst.length, arraySecond.length);
        int minValue = min(arrayFirst.length, arraySecond.length);
        int[] finalArray = new int[maxValue];

        for (int i = 0; i <= minValue - 1; i++) {
            finalArray[i] = arrayFirst[i] + arraySecond[i];
        }

        for (int i = minValue; i <= maxValue - 1; i++) {
            if (arrayFirst.length > arraySecond.length) {
                finalArray[i] = arrayFirst[i];
            } else {
                finalArray[i] = arraySecond[i];
            }
        }

        for (int i = 0; i <= finalArray.length - 1; i++) {
            System.out.println(finalArray[i]);
        }

        // Zadatak 8

        System.out.println("Task 8: ");

        String[] arrayOfString = {"Ima", "trp", "li", "u", "ART", "slm", "stringu", "znak", "krk", "brb"};
        String[] arrayOfStringToUpper = new String[arrayOfString.length];
        String[] arrayOfStringsWithoutVowels = new String[arrayOfString.length];
        System.out.println(arrayOfString.length);
        int index = 0;
        //int numberOfStringsToRemove = 0;

        for (int i = 0; i <= arrayOfString.length - 1; i++) {
            arrayOfStringToUpper[i] = arrayOfString[i].toUpperCase();

            if (arrayOfStringToUpper[i].contains("A") || arrayOfStringToUpper[i].contains("E") || arrayOfStringToUpper[i].contains("I") || arrayOfStringToUpper[i].contains("O") || arrayOfStringToUpper[i].contains("U")) {
                //numberOfStringsToRemove = numberOfStringsToRemove + 1;

            } else {
                arrayOfStringsWithoutVowels[index]=arrayOfString[i];
                index=index+1;
            }
        }

       /* String[] arrayWithoutVowels = new String[arrayOfString.length - numberOfStringsToRemove];
        int index = 0;

        for (int i = 0; i <= arrayOfString.length - 1; i++) {
            if (arrayOfStringToUpper[i].contains("A") || arrayOfStringToUpper[i].contains("E") || arrayOfStringToUpper[i].contains("I") || arrayOfStringToUpper[i].contains("O") || arrayOfStringToUpper[i].contains("U")) {
            } else {
                arrayWithoutVowels[index] = arrayOfString[i];
                index = index + 1;
            }
        }*/

        System.out.println("New string array without strings containing vowels is: ");

        for (int i = 0; i <= arrayOfStringsWithoutVowels.length - 1; i++) {
            System.out.println(arrayOfStringsWithoutVowels[i]);
        }


        // Zadatak 9

        System.out.println("Task 9: ");

        int[] firstForSum = {1, 1, 1};
        int[] secondForSum = {1, 1, 1};
        int sumFinal = 0;

        for (int i = 0; i <= firstForSum.length - 1; i++) {
            for (int k = 0; k <= secondForSum.length - 1; k++) {
                sumFinal = sumFinal + firstForSum[i] + secondForSum[k];
            }
        }
        System.out.println("The sum of all elements in the array is: " + sumFinal);
    }
}
