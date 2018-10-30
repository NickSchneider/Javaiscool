package poly;

public class Animal 
{
    int age;
    String color;
    
    Animal(int age, String color)
    {
        this.age = age;
        this.color = color;
        display();
    }
    
    public void display()
    {
        System.out.printf("I am %d and my color is %s\n", age, color);
    }
    
    public void speak()
    {
        System.out.println("I have no idea what to say");
    }
}
