import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
  public static void main(String[] args) {
    int myNum = 1;
    int myNum2 = 1;

    String myName = "Adam";
    String myName2 = "Adam";

    String myName3 = new String("Adam");
    String myName4 = new String("Adam");
    System.out.println(myName3.equals(myName4));

    // Arrays
    String[] people = { "Kevin", "Matthew", "Jenelle", "Caden" };
    Object[] randomStuff = { "Kevin", true, 343 };

    int[] numbers = new int[10];
    for (int i = 1; i < numbers.length; i++) {
      numbers[i] = i;
    }
    System.out.println(Arrays.toString(numbers));

    // ArrayList
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("I'm");
    stringList.add("adding");
    stringList.add("some");
    stringList.add("strings");

    for (int j = 0; j < stringList.size(); j++) {
      System.out.println(stringList.get(j));
    }

    // For Each Loop
    for (String word : stringList) {
      System.out.println(word);
    }

    // HashMaps
    HashMap<String, String> ourHobbies = new HashMap<String, String>();
    ourHobbies.put("Matthew", "Photography");
    ourHobbies.put("Adam", "Hiking");
    ourHobbies.put("Stuart", "Martial Arts");
    ourHobbies.put("Cadan", "Making Music");
    ourHobbies.put("Caila", "Drawing");
    ourHobbies.put("Jenelle", "Dancing");
    ourHobbies.put("Kevin", "Soccer");
    ourHobbies.put("Hope", "Reading");
    ourHobbies.put("Reena", "Shoveling snow");

    System.out.println(ourHobbies.get("Cadan"));

    for (String name : ourHobbies.keySet()) {
      System.out.println(name);
    }

    for (String hobby : ourHobbies.values()) {
      System.out.println(hobby);
    }

    for (HashMap.Entry<String, String> bothValues : ourHobbies.entrySet()) {
      System.out.println("Key = " + bothValues.getKey() + ", Value = " + bothValues.getValue());
    }

    // Methods
    System.out.println(maxArrayValue(numbers));
    countToTwo();
  }

  public static void countToTwo() {
    for (int i = 0; i <= 2; i++) {
      System.out.println(i);
    }
  }

  public static int maxArrayValue(int[] nums) {
    // Declare a variable for the max number
    // loop through nums
    // compare nums iteration with max number variable
    // if number is larger reassign max number value
    // return max number
    int maxNumber = nums[0];
    for (int i = 1; i <= nums.length; i++) {
      try {
        if (nums[i] > maxNumber) {
          maxNumber = nums[i];
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    return maxNumber;
  }

}