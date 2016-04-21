public abstract class Animal {

  private int age; //in days

  private String type;

  public Animal(String myType) {
    type = myType;
  }
  public abstract String eat();

  public String toString() {
    String title = type;
    return title + "\n" + this.eat();
  }
}
