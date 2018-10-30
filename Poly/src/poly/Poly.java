package poly;
import java.util.ArrayList;

public class Poly 
{
    public static void main(String[] args) 
    {
        Lion lion = new Lion(6, "White"); 
        Fish fish = new Fish(1, "Rainbow");
        Dog dog = new Dog(6, "Brown");
        
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        aryAnimal.add(dog);
        
        for(int i = 0; i <aryAnimal.size(); i++)
        {
            allSpeak(aryAnimal.get(i));
        }
    }    

    public static void allSpeak(Animal animal)
    {
        animal.speak();
    }
    
}
