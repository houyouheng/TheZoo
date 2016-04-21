public class ZooTest {
  public static void main(String[] args) {
    Zoo myZoo = new Zoo();
    //TODO: Add animals to the Zoo
    // - one Pet (not performer)
    // - one performer (not pet)
    // - one performer (and pet)
    // - one neither
    Turtle myTurtle = new Turtle("Buddy");
    myZoo.addToZoo(myTurtle);

    Dolphin myDolphin = new Dolphin();
    myZoo.addToZoo(myDolphin);

    Whale myWhale = new Whale();
    myZoo.addToZoo(myWhale);

    Dog myDog = new Dog("WolfWolf");
    myZoo.addToZoo(myDog);


    myZoo.rollCall();
  }
}
