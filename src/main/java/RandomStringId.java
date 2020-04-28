import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringId {
  public static void main(String[] args) {
    int numberOfIds = 6;
    int[] structure = new int[]{8,4,4,4,12};
    char separator = '-';
    for(int i = 1; i <= numberOfIds; i++){
      StringBuilder result  = new StringBuilder(randomHexaString(structure[0]));
      for (int j = 1; j < structure.length; j++){
        result.append(separator);
        result.append(randomHexaString(structure[j]));
      }
      String output = result.toString();
      System.out.println(i + "/ random = " + output);
    }
  }

  private static String randomHexaString(int length){
    return RandomStringUtils.random(length, 0, 16, true, true, "0123456789abcdef".toCharArray());
  }
}
