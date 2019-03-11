import java.util.ArrayList;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ZooDriver
{
    public static void main(String args[]) {
        //Dog myDog = new Dog();  
        //myDog.setWeight(100); 
        //myDog.setName("Admiral");
        //Bat myBat = new Bat();
        //myBat.setName("Vlad");
        //myBat.setWeight(1);
        //Eagle myEagle = new Eagle();
        ArrayList<Animal> AnimalList = new ArrayList<Animal>();
        AnimalList.add(new Dog());
        AnimalList.add(new Dolphin());
        AnimalList.add(new Eagle());
        AnimalList.add(new Penguin());
        AnimalList.add(new Hamster());
        AnimalList.add(new Elephant());
        AnimalList.add(new Human());
        AnimalList.add(new Bat());
        AnimalList.add(new Duck());
        AnimalList.get(0).setName("Vincent");
        AnimalList.get(1).setName("Pablo");
        AnimalList.get(2).setName("Leonardo");
        AnimalList.get(3).setName("Michelangelo");
        AnimalList.get(4).setName("Rembrandt");
        AnimalList.get(5).setName("Rapheael");
        AnimalList.get(6).setName("Andy");
        AnimalList.get(7).setName("Henri");
        AnimalList.get(8).setName("Edvard");
        for(Animal a : AnimalList) {
            a.noise();
            System.out.println(a.getName());
            if (a instanceof Flyer) {
               ((Flyer)a).fly();
            }
            else if(a instanceof Swimmer){
                ((Swimmer)a).swim();
            }
        }
        
    }
}

