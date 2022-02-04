package ro.fasttrackit.curs16;

public class RecursiveFunctions {
    public int length(String word) {
        //EXIT CONDITION
        if (word == null || word.isEmpty()) {
            return 0;
        } else {
            //RE-ENTRY
            return 1 + length(word.substring(1)); //da-mi substringul incepand de la indexul 1, asa ignora prima litera
        }
    }

    public int digitSum(int number) {
        if (number <10) {
            return number;
        } else {
            return digitSum(number/10) + number%10;
        }
    }
}
