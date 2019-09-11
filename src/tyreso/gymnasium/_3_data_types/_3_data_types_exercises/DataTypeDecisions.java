package tyreso.gymnasium._3_data_types._3_data_types_exercises;

import java.sql.SQLOutput;

public class DataTypeDecisions {

    public static void main(String[] args){
        /**
         * In the code below some decisions have to be made regarding how to best represent a specific form of data,
         * pick a datatype for the variables based of the documentation and the variable name. Replace the text
         * "primitivetype" with a valid and adequate primitive datatype.
         *
         * Remove EXACTLY the code "//TODO !REMOVE ME! " before replacing "primitivetype"
         *
         * TODO YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!
         */

        //!!!Example!!!
        //Number of toes on left foot
        //TODO !REMOVE ME! primitivetype numToesOnLeftFoot;
        //Becomes
        byte numToesOnLeftFoot;  //You don't often have more than 128 toes on your feet, hence "byte"

        //The number of students in the class
         int numStudentsInClass;

        //A recommendation on whether the stock(aktier) should be sold
         boolean sellStock;

        //The number of ants in the world
         long antsOnEarth;

        //Bank balance on your GTA savefile in dollars
         long grandTheftAutoBankBalance;

        //Your course grade, represented as a->f
         char letterGrade;

        //Your course grade, represented as a number for averaging
         double numberGrade;

        //Your actual bank balance in SEK
         double accountBalanceInSek;

        //Variable that represents whether you've done your homework or not
         boolean homeWorkDone;

        /**
         * TODO BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!  BONUS CHALLENGE BELOW!!!
         * Extra challenges for primitive data types. This will also prepare you for Lektion 4 - Operators.
         *
         * Experiment with the behaviour of the integer-primitive:
         *
         * 1. What happens if you try to divide by 0?
         * 2. What happens if you divide 5 by 2?
         * 3. What happens if you divide 2 by 5?
         * 4. Find out what the modulus/modulo-operator does (hint its the percent sign: %) and use it to do a
         *    reasonable calculation and printout of 5 divided by 2
         *
         */

        //Deklarera variablerna som ska hålla heltalen och initialisera dessa till rätt värden
        int heltalFem = 5;
        int heltalTva = 2;
        int heltalNoll = 0;

        //Divide by 0
        int divideByZero = 0; //TODO REPLACE '0' WITH YOUR CODE!!!
        System.out.println("Resultatet av division med noll är: ");
        System.out.println(divideByZero);

        //Divide 5 by 2
        //Print the result to console
        //TODO YOUR CODE HERE!


        //Divide 2 by 5
        //Print the result to console
        //TODO YOUR CODE HERE!

        //Divide 5 by 2
        //Print part 1 of result to console
        //TODO YOUR CODE HERE!

        //Use modulo 5 by 2
        //Print part 2 of result to console
        //TODO YOUR CODE HERE!
    }


}
