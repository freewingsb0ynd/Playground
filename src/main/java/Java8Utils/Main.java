package Java8Utils;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Random r = new Random();
    List<ObjectA> list1 = new ArrayList<>();
    for (int i=0;i<1e8;i++){
      list1.add(ObjectA.of(r.nextInt((int) 1e7)));
    }
    int result3=0;

    long time0 = System.currentTimeMillis();
    Optional<ObjectA> result0=list1.stream().reduce((obj1, obj2)-> ObjectA.of(obj1.getPrice()+obj2.getPrice()));
    long time1 = System.currentTimeMillis();
    OptionalInt result1 = list1.stream().mapToInt(ObjectA::getPrice).reduce((prc1, prc2)->(prc1+prc2) );
    long time2 = System.currentTimeMillis();
    int result2 = list1.stream().reduce(0, ((integer, objectA) -> integer + objectA.getPrice()),Integer::sum);
    long time3= System.currentTimeMillis();
    for (ObjectA obj : list1) {
      result3 += obj.getPrice();
    }
    long time4 = System.currentTimeMillis();
    result0.ifPresent(s-> System.out.print(s.getPrice()));
    System.out.println(":   " + (time1 - time0));
    System.out.println(result1+":   " + (time2 - time1));
    System.out.println(result2+":   " + (time3 - time2));
    System.out.println(result3+":   " + (time4 - time3));
    
    }


  }

