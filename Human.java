
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Mammal implements Swimmer, Flyer
{
    @Override
    public void move() {
        System.out.println("The human sprints very slowly");
    }
    @Override
    public void eat() {
        System.out.println("The human eats the human thats eating human");
    }
    @Override
    public void noise() {
        System.out.println("The humans talk to each other"); 
    }
    @Override 
    public void swim() {
        System.out.println("The humans swim very slowly");
    } 
    @Override 
    public void fly() {
        System.out.println("The human flys in its machine");
    }
}
