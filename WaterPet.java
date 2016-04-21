public abstract class WaterPet extends Pet{

  private String waterType;
  private int filterLastDays;

  public WaterPet(String type, String myName, String typeOfWater){
    super(type, myName);
    waterType = typeOfWater;
    filterLastDays = 14;
  }

  public String eat(){
    return "Eats other fish!";
  }

  public String getName(){
      return super.getName();
  }

  public String getTypeOfWater(){
      return this.waterType;
  }

  public String checkFilter(){
    if(filterLastDays > 0){
      return "Filters are clean!";
    }else{
      return "FILTERS NEED TO BE CLEANED LIKE NOW!";
    }

  }

  public String cleanFilter(){
    filterLastDays = 14;
    return "Filters are now cleaned!";
  }
}
