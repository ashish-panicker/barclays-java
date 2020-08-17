public class TrainingManager{

    public static void main(String[] args) {
        
        Trainee t1 = new Trainee();
        Trainee t2 = new Trainee();

        t1.course = "Java Microservices";

        t1.setAge(22);
        t1.setName("Arun");

        t2.setAge(22);
        t2.setName("Rohit");

        t1.printDetails();
        t2.printDetails();

    }
}