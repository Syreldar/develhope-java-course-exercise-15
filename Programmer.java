public class Programmer
{
    String name;
    int age;
    boolean wearsGlasses;

    public void drinkCoffee()
    {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails()
    {
        System.out.printf("%s is a %d-yo programmer.%n", name, age);
    }

    public void hasGlasses()
    {
        System.out.printf("Is %s wearing glasses? %s.%n", name, wearsGlasses ? "Yes" : "No");
    }
}
