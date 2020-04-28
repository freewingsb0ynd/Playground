package Java8Utils;

public class ObjectA {
  private int price;

  public int getPrice(){
    return price;
  }

  public static ObjectA of(int price){
    ObjectA obj = new ObjectA();
    obj.price = price;
    return obj;
  }
}
