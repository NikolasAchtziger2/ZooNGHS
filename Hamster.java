
/**
 * Write a description of class Hamster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hamster extends Mammal implements Swimmer
{
    @Override
    public void move() {
        System.out.println("The hamster spins in his wheel");
    }
    @Override
    public void eat() {
        System.out.println("The hamster eats carrots");
    }
    @Override
    public void noise() {
        System.out.println("The hamster squeals");
    }
    @Override 
    public void swim() {
        System.out.println("The hamster can barely swim");
    }
}
