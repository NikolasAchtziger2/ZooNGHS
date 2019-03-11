
/**
 * Write a description of class Penguin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Penguin extends Avian implements Swimmer 
{
    @Override
    public void move() {
        System.out.println("The penguin slides");
    }
    @Override
    public void eat() {
        System.out.println("the penguin eats a whole school");
    }
    @Override
    public void noise() {
        System.out.println("The penguin makes penguin noises");
    }
    @Override 
    public void swim() {
        System.out.println("The penguin swims for miles");
    }
}
