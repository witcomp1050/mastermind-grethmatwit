package edu.wit.comp1050;
import java.util.Scanner;
import java.util.Random;

class mastermind{
   public static void main(String[] args) {
       String Answer = getColorAnswer();
       System.out.println(Answer);

       //Select number of attempts
       System.out.println("Select number of attempts (8,10,or 12): ");
       Scanner input = new Scanner(System.in);
       int attempts = input.nextInt();

       System.out.println("Enter your guess (up tp 4 characters): ");
       String guess = input.next();
       guess = guess.toUpperCase();

       for (int h = 0; h < 3; h++){
           if(guess.charAt(h)==Answer.charAt(h)){
               System.out.println("*");
               //signify correctness
           }
       }
       if (guess.equals(Answer)){
           System.out.println("YOU DID IT!");

       }

       for (int j = 1 ; j < attempts ; j++){
           System.out.println("Enter your guess (up tp 4 characters): ");
           guess = input.next();
           guess = guess.toUpperCase();
           for (int h = 0 ; h < 3 ; h++){
               if(guess.charAt(h)==Answer.charAt(h)){
                   System.out.println("*");
                   //signify correctness
               }
           }
           if (guess.equals(Answer)){
               System.out.println("YOU DID IT!");
               break;
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



        return (""+A+""+B+""+C+""+D);
    }
}