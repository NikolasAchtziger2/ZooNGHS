
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animal
{
    String name;
    double weight;
    public void setWeight(int w)
    {
        weight = w;
    }
    public double getWeight(){
    return weight;
    }
    public String getName(){
    return name;
    }
    public void setName(String n) {
        name = n;
    }
    public abstract void eat();
    public void sleep(){
        System.out.println("shhh, the " + name + "is sleeping");
    }
    public abstract void noise();
    public abstract void move();
    
}

 
