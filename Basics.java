public class Basics{

    public static void main(String[] args) {

        System.out.println("No of Arguments: " + args.length);

        System.out.println(args[0]);

        // Integer         int
        // Long            long
        // Short           short
        // Byte            byte
        // Character       char
        // Float           float
        // Double          double

        // java.lang

        if( args.length != 0 && args.length < 2 ){

            int age = Integer.parseInt(args[0]);
            checkVotingStatus(age);

        }                
    }


    public static void checkVotingStatus(int age) {
        if(age >= 18){
            System.out.println("Hey congrats! You can vote.");
        }else{
            System.out.println("Sorry! You cannot vote.");
        }
    }

    public void print(){

    }
}

class Math{

    public static int add(int number1, int number2){
        return number1 + number2;
    }
}