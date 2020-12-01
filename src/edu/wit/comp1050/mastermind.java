package edu.wit.comp1050;
import java.util.Scanner;
import java.util.Random;

class mastermind{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       for(int z=0;z<1;){
           System.out.printf("%nCan the CodeMaker use duplicate colors? (y/n): ");
           String duplicate = input.next();
           System.out.printf("%nCan the CodeMaker use blank spaces? (y/n): ");
           String blank = input.next();

           String Answer = getColorAnswer(duplicate,blank);

           System.out.printf("%nAnswer: " + Answer);

           //Select number of attempts
           System.out.printf("%nSelect number of attempts (8,10,or 12): ");

           int attempts = input.nextInt();

           System.out.printf("%nEnter your guess (up to 4 characters): ");
           String guess = input.next();
           guess = guess.toUpperCase();

           for (int h = 0; h < guess.length(); h++){
               if(guess.charAt(h)==Answer.charAt(h)){
                   System.out.printf("*");
                   //signify correctness
               }
           }
           if (guess.equals(Answer)&&guess.length()==Answer.length()){
               System.out.printf("%nYOU DID IT!");
               System.out.printf("%nPlay again? (y/n): ");
               String playAgain = input.next();
               playAgain = playAgain.toUpperCase();
               if (playAgain.charAt(0) != 'Y'){
                   z=z++;
               }
               continue;

           }

           for (int j = 1 ; j < attempts ; j++){
               System.out.printf("%nEnter your guess (up to 4 characters): ");
               guess = input.next();
               guess = guess.toUpperCase();
               for (int h = 0 ; h < guess.length() ; h++){
                   if(guess.charAt(h)==Answer.charAt(h)){
                       System.out.printf("*");
                       //signify correctness
                   }
               }
               if (guess.equals(Answer)&&guess.length()==Answer.length()){
                   System.out.printf("%nYOU DID IT!");
                   break;
               }
               if (j==(attempts-1) && !guess.equals(Answer)){
                  System.out.printf("%nGood effort!");

               }

           }
           System.out.printf("%nPlay again? (y/n): ");
           String playAgain = input.next();
           playAgain = playAgain.toUpperCase();
           if (playAgain.charAt(0) != 'Y'){
               z=z++;
           }

       }



    }

    public static String getColorAnswer(String duplicate, String blank){

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