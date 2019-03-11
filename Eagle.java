
/**
 * Write a description of class Eagle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eagle extends Avian implements Flyer
{
    @Override
    public void move() {
        System.out.println("The eagle is chasing after its prey");
    }
    @Override
    public void eat() {
        System.out.println("The eagle ate the fish");
    }
    @Override
    public void noise() {
        System.out.println("The eagle makes says sqwah");
    }
    @Override
    public void fly() {
        System.out.println("The eagle flew");
    }
}
