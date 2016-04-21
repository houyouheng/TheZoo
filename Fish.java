public class Fish extends WaterPet{

  public Fish(String type, String myName, String typeOfWater){
      super(type, myName, typeOfWater);
  }

  public String eat(){
    return "Eats other fish!";
  }
}
