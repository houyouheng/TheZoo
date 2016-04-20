public class Dolphin extends Animal implements Performer {

  public Dolphin() {
    super("Dolphin");
  }

  public String stuntList() {
    return "Dive\nCatch";
  }

  public String eat() {
    return "Dolphin eats a fish";
  }

  public void doStunt(String stunt) {
    if (stunt.equals("Dive")) {
      System.out.println("Dolphin Dives");
    }
    else if (stunt.equals("Catch")) {
      System.out.println("Dolphin catchess");
    }
    else {
      System.out.println("Dolphin doesn't know how to " + stunt);
    }
  }
}
