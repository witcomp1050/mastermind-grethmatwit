package edu.wit.comp1050;
import java.util.Scanner;
import java.util.Random;

class mastermind{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in).useDelimiter("[\r\n/]") ;
       for(int z=0;z<1;){


           String Answer = getColorAnswer();

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

    public static String getColorAnswer(){

        Scanner input = new Scanner(System.in).useDelimiter( "(\\b|\\B)" ) ;

        System.out.printf("%nUse default settings? (y/n)= ");
        //can use duplicates but no spaces
        String defaultSetting = input.next();
        defaultSetting = defaultSetting.toUpperCase();

        //generate array
        char [] colorArray = new char[]{'R','O','Y','G','B','P',' '};

        if(defaultSetting.charAt(0) == 'Y'){
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
        if (defaultSetting.charAt(0)=='N'){
            System.out.printf("%nCan the CodeMaker use duplicate colors? (y/n): ");
            String duplicate = input.nextLine();
            duplicate = duplicate.toUpperCase();

            System.out.printf("%nCan the CodeMaker use blank spaces? (y/n): ");
            String blank = input.nextLine();
            blank = blank.toUpperCase();


            /*
            colorArray[0] = 'R';
            colorArray[1] = 'O';
            colorArray[2] = 'Y';
            colorArray[3] = 'G';
            colorArray[4] = 'B';
            colorArray[5] = 'P';
            colorArray[6] = ' ';

            */
            //generate answer
            if ((blank.charAt(0)=='Y')&&(duplicate.charAt(0)=='Y')){

                Random rand = new Random();
                int a = rand.nextInt(6);
                int b = rand.nextInt(6);
                int c = rand.nextInt(6);
                int d = rand.nextInt(6);

                char A = colorArray[a];
                char B = colorArray[b];
                char C = colorArray[c];
                char D = colorArray[d];

                return (""+A+""+B+""+C+""+D);
            }
            if((blank.charAt(0)=='N')&&(duplicate.charAt(0)=='N')){
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
                while(b==a){
                    b = rand.nextInt(5);
                }
                int c = rand.nextInt(5);
                while((c==b)||c==a){
                    c = rand.nextInt(5);
                }
                int d = rand.nextInt(5);
                while ((d==a)||(d==b)||(d==c)){
                    d = rand.nextInt(5);
                }

                char A = colorArray[a];
                char B = colorArray[b];
                char C = colorArray[c];
                char D = colorArray[d];



                return (""+A+""+B+""+C+""+D);

            }
            if((blank.charAt(0)=='N')&&(duplicate.charAt(0)=='Y')){
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
            if((blank.charAt(0)=='Y')&&(duplicate.charAt(0)=='N')){
            /*
            colorArray[0] = 'R';
            colorArray[1] = 'O';
            colorArray[2] = 'Y';
            colorArray[3] = 'G';
            colorArray[4] = 'B';
            colorArray[5] = 'P';
            colorArray[6] = ' ';

            */
                //generate answer

                Random rand = new Random();
                int a = rand.nextInt(6);
                int b = rand.nextInt(6);
                while(b==a){
                    b = rand.nextInt(6);
                }
                int c = rand.nextInt(6);
                while((c==b)||c==a){
                    c = rand.nextInt(6);
                }
                int d = rand.nextInt(6);
                while ((d==a)||(d==b)||(d==c)){
                    d = rand.nextInt(6);
                }

                char A = colorArray[a];
                char B = colorArray[b];
                char C = colorArray[c];
                char D = colorArray[d];



                return (""+A+""+B+""+C+""+D);

            }
            else{
                System.out.printf("%nInvalid settings");
                getColorAnswer();
            }

        }
        System.out.printf("%nInvalid settings");
        getColorAnswer();
        return null;

    }

}