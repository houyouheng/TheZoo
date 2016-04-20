public class Turtle extends Pet{

  public Turtle(String name) {
    super("Turtle", name);
  }

  public String eat() {
    return this.getName() + " eats whatever turtles eat lol";
  }
}
