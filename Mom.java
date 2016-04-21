public abstract class Mom extends Animal{

  private int momsNumber;

  public Mom(String myType, int herNumber){
    super(myType);
    momsNumber = herNumber;
  }

  public int getMomsNumber(){
    return momsNumber;
  }

  public abstract String eat();
}
