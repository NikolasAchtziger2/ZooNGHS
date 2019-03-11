
/**
 * Write a description of class Elephant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elephant extends Mammal implements Swimmer
{
    @Override
    public void move() {
        System.out.println("The elephant walks commiting mass genocide onto ants and worms below");
    }
    @Override
    public void eat() {
        System.out.println("The elephant eats the forest");
    }
    @Override
    public void noise() {
        System.out.println("The elephant trumpets");
    }
    @Override 
    public void swim() {
        System.out.println("The elephant swims at an incrediably fast pace");
    }
}
