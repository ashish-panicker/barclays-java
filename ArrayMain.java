import java.io.Console;

public class ArrayMain{

    public static void main(String[] args) {

        ArrayTest at =  new ArrayTest();

        int [] numbers = {1,2,3};

        // System.out.println("Sum = " + at.sum(1,2,3,4));
        // System.out.println("Sum = " + at.sum(1,2,3,4,5,6));
        // System.out.println("Sum = " + at.sum(1,2,3,4,6,7,8,9,1,2,45));

        System.out.println("Name?  ");

        String name = System.console().readLine();
        
        System.out.println("Name: " + name);

        System.out.println("Password?  ");

        char[] password = System.console().readPassword();
        System.out.println("Password:  " + String.valueOf(password));
    }
}

class ArrayTest{

    String[] names;
    
    // int [] x = new int[10];

    public void printNames() {

        names = new String[] {"Arun", "Ashish", "Rohit"};

        System.out.println(names.length);
        
        for(int index = 0; index < names.length; index++){
            System.out.println("Hello " + names[index]);
        }

        for(String name: names){
            System.out.println("Hello " + name);
        }
                
    }

    public int sum(int... numbers){

        int sum = 0;

        System.out.println("Numbers array length: " + numbers.length);

        for(int number : numbers){
            sum += number;
        }

        System.out.println("\n");

        return sum;
    }

}
