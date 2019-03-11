
/**
 * Write a description of class Dolphin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dolphin extends Mammal implements Swimmer
{
    @Override
    public void move() {
        System.out.println("The dolphin leaps");
    }
    @Override
    public void eat() {
        System.out.println("The dolphin eats some shcools");
    }
    @Override
    public void noise() {
        System.out.println("the dolphin whistles ");
    }
    @Override 
    public void swim() {
        System.out.println("The dolphin glides through ocean");
    }
}
