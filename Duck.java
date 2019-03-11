
/**
 * Abstract class Duck - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Duck extends Avian implements Flyer
{
    public void noise() {
        System.out.println("The Duck Quacks");
    }
    public void eat() {
        System.out.println("The duck violently slaughters a family of small fish");
    }
    public void move() {
        System.out.println("The duck swam");
    }
    public void fly() {
        System.out.println("The duck migrated north for the winter");
    }
    public void swim() {
        System.out.println("The duck swam");
    }
}

