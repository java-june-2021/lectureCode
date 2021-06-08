public class FirstProgram {

  // Entry Point Method
  public static void main(String[] args) {
    System.out.println("Hello, Java 2021");

    byte myByte = 100; // Stores whole numbers from -128 to 127
    short myShort = 1000; // Stores whole numbers from -32,768 tp 32,767
    int myInt = 100000; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long myLong = 10000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float myFloat = 3.14f; // Stores fractional numbers. 6 to 7 dceimal digits
    double myDouble = 3.1423747; // Stores fractional numbers up to 15 decimal digits
    boolean myBool = true; // Stores true or false;
    char myChar = 'r'; // Stores single character / letter or ASCII values

    Character myChar2 = 'r';
    System.out.println(Character.toUpperCase(myChar2));
    Integer myInteger = 100000;

    // Strings
    String myString = "Java June 2021";
    System.out.println(myString.length());

    String bootcamp = "Java";
    String bootCamp = "June";
    String bootCAMP = "2021";

    System.out.println(bootcamp + bootCamp + bootCAMP);

    // Operators and Conditionals
    int isOdd = 5;
    if (isOdd % 2 != 0) {
      System.out.println("Number is odd");
    } else {
      System.out.println("Number is not odd");
    }

    // Loops
    int i = 0;
    while (i <= 4) {
      System.out.println("Were counting");
      i++;
    }

    for (int j = 0; j <= 4; j++) {
      System.out.println("Were counting");
    }

    System.out.println(sayHello("Sean"));
    sayHello();
  }

  public static String sayHello(String name) {
    return "Hello " + name;
  }

  public static void sayHello() {
    System.out.println("Hello!");
  }
}