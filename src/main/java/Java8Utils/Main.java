package Java8Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    final int INPUT = 12;
    List<ObjectA> list1 = new ArrayList<>();
    list1.add(ObjectA.of(1));
    list1.add(ObjectA.of(2));
    list1.add(ObjectA.of(45));
    list1.add(ObjectA.of(-9));

    List<ObjectA> list2 = new ArrayList<>();
    list2.add(ObjectA.of(10));
    list2.add(ObjectA.of(51));
    list2.add(ObjectA.of(34));
    list2.add(ObjectA.of(-102));
    
    int results = INPUT;
    for (ObjectA obj : list1) {
      results += obj.getPrice();
    }
    for (ObjectA obj : list2) {
      results += obj.getPrice();
    }

    System.out.println("Results: " + results);
  }
}
