package edu.wit.comp1050;
import java.util.Scanner;
import java.util.Random;

class mastermind{
   public static void main() {
       String Answer = getColorAnswer();
       System.out.println(Answer);

       Scanner input = new Scanner(System.in);

       System.out.println("Enter your 4 character guess:");
       String guess = input.next();
       guess = guess.toUpperCase();

       for (int i=0;i>3;i++){
           if(guess.charAt(i)==Answer.charAt(i)){
               System.out.printf("*");
               //signify correctness
           }
       }

    }

    public static String getColorAnswer(){

       //generate array
       char [] colorArray = new char[]{'R','O','Y','G','B','P'};
       /*
       colorArray[0] = 'R';
       colorArray[1] = 'O';
       colorArray[2] = 'Y';
       colorArray[3] = 'G';
       colorArray[4] = 'B';
       colorArray[5] = 'P';

        */
       //generate answer

        Random rand = new Random();
        int a = rand.nextInt(5);
        int b = rand.nextInt(5);
        int c = rand.nextInt(5);
        int d = rand.nextInt(5);

        char A = colorArray[a];
        char B = colorArray[b];
        char C = colorArray[c];
        char D = colorArray[d];


        return "A"+"B"+"C"+"D";
    }
}