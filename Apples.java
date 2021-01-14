//this is a reference class
class Apple
{
  //intstance variables
  private String type;
  private double size; //inches diameter
  private boolean isTart;
  //constructors
  public Apple()
  {
    type = null;
    size = 0;
    isTart = false;
  }

  //toString
  public String toString()
  {
    String output = "Type " + type + "\nSize (inches diameter)" + size + "\nIs it tart?" + isTart;
    return output;
  } 
}