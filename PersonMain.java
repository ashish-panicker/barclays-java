class Person {

    private long aadharId;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private boolean isPorcessed;

    public Person(long aadharId, String name, int age, String email, 
                String phoneNumber, 
                boolean isPorcessed){

        System.out.println("Before initialization");

        System.out.println("Name : " + this.name  
                            + "\nEmail : " + this.email
                            + "\nAge:" + this.age
                            + "\nPhone: " + this.phoneNumber
                            + "\nStatus: " + this.isPorcessed);

        this.aadharId = aadharId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isPorcessed = isPorcessed;
        
        System.out.println("After initialization");

        System.out.println("Name : " + this.name  
                            + "\nEmail : " + this.email
                            + "\nAge:" + this.age
                            + "\nPhone: " + this.phoneNumber
                            + "\nStatus: " + this.isPorcessed);
    }

    public Person(){
        System.out.println("Zero argument constructor executed...");

    }

    public void processAadhar(){
        
    }

    public void printAadhar(){

        System.out.println("Name : " + name  
                            + "\nEmail : " + email
                            + "\nAge:" + age
                            + "\nPhone: " + phoneNumber
                            + "\nStatus: " + isPorcessed);
        
    }

}

public class PersonMain{

    public static void main(String[] args) {
        
        Person p2 = new Person();

        Person p = new Person(12345, "Ashish", 30, 
        "ashish@gmail.com", "1234", true);
    }
}