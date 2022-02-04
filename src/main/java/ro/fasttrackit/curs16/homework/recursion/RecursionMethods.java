package ro.fasttrackit.curs16.homework.recursion;

public class RecursionMethods {

    //sum of first n integer numbers
    public int sumOfFirstNNumbers (int number) {
        if (number <= 1) {
            return number;
        } else {
            return number + sumOfFirstNNumbers(number - 1);
        }
    }

    public int sumOfEvenNumbers (int number) {
        if (number == 0) {
            return number;
        } else if (number % 2 != 0) {
            return sumOfEvenNumbers(number - 1); //daca n=1, return 0
        } else {
            return number + sumOfEvenNumbers(number-2);
        }
    }

    public int sumOfOddNumbers (int number) {
        if (number <=1) {
            return number;
        } else if (number % 2 == 0) {
            return sumOfOddNumbers(number -1);
        } else {
            return number + sumOfOddNumbers(number-2);
        }
    }

//    Palindrome: a word that reads the same backwards as forwards, e.g. madam or ana
//    recursive check of first and last letter
    public boolean isPalindrome1 (String word) {
        if (word == null) {
            return false;
        } else if (word.isEmpty() || word.length() == 1) {
            return true;
        } else {
            if(word.charAt(0) == word.charAt(word.length()-1)) {
                return isPalindrome1(word.substring(1,word.length()-1)); //urm String fara 1-a si ultima litera
            }
        }
        return false;
    }

//    recursive string reverse
    public boolean isPalindrome2 (String word) {
        String result = reverseString(word);
        if (result == null) {
            return false;
        } else if (result.isEmpty() || result.length() == 1) {
            return true;
        } else {
            if (result.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String reverseString (String word) {
        if (word == null) {
            return null;
        } else if (word.isEmpty()) {
            return "";
        } else if (word.length() == 1) {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0); // return prima litera si reverse string de la a 2-a litera
        }
    }

//    sum of digits for a number
    public int sumOfDigits (int number) {
        if (number < 0) {
            number = Math.abs(number);
        }
        if (number < 10) {
            return number;
        } else {
            return sumOfDigits(number/10) + number%10;
        }
    }

//    create a method that will give you the value for the n-th element from fibonacci's array
    public int fibonacciRecursion(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        } else {
            return fibonacciRecursion(number -2) + fibonacciRecursion(number-1);
        }
    }
}
