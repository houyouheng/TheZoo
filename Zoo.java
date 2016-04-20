import java.util.*;

public class Zoo {

    private int animalCount;
    private List<Animal> animalList;

    public Zoo() {
        animalList = new ArrayList<Animal>();
    }


    public void addToZoo(Animal a) {
      animalList.add(a);
    }

    public void rollCall() {
        //TODO: have Performers list their stunts
        for (Animal a : animalList) {
            System.out.println(a);
            if (a instanceof Pet) {
                System.out.println( ((Pet) a).getName());
            }
            if (a instanceof Performer) {
              System.out.println( ((Performer) a).stuntList());
            }
        }
    }
}
