
/**
 * Write a description of class Bat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat extends Mammal implements Flyer
{
    @Override
    public void move() {
        System.out.println("The bat crawled");
    }
    @Override
    public void eat() {
        System.out.println("The bat ate the mosquitto");
    }
    @Override
    public void noise() {
        System.out.println("The bat makes a squeak");
    }
    @Override
    public void fly() {
        System.out.println("The bat flew");
    }
}
