public class AnimalKingdom{


    public static void main(String[] args) {

        Integer i = 10; //boxing
        System.out.println(i); //unboxing

        
        
    }
}
interface Animal{

    void foodHabits();

}
class Herbivore implements Animal{
    public void foodHabits(){

        

    }
}

class Carnivore implements Animal{
    public void foodHabits(){

    }
}