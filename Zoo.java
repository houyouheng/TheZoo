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
        //TODO: have Performers list their stunt
        for (Animal a : animalList) {
            System.out.println(a);
            if (a instanceof Pet) {
                System.out.println( ((Pet) a).getName());
            }
            if (a instanceof Performer) {
              System.out.println( ((Performer) a).stuntList());
            }
            if (a instanceof WaterPet){
              System.out.println(((WaterPet) a).getTypeOfWater());
              System.out.println(((WaterPet) a).checkFilter());
            }
            if (a instanceof Mom){
              System.out.println(((ColbysMom) a).getMomsNumber());
            }
        }
    }
}
