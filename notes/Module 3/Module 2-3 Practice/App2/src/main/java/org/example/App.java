package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }
}

    //Example for Nested Classes:
   abstract class Animal {
        public void speak() {
            System.out.println(("I am an animal"));
        }
    }

    class Dog extends Animal {

        // Override
        @Override
        public void speak() {
            System.out.println(("Woof!"));
        }

    }

    class Cat extends Animal {

        // Override
        @Override
        public void speak() {
            System.out.println(("Meow!"));
            }

        }

// (Previous Examples)
        // Example 1:
//        String s = new String( "Hello World");
//        for (int i = 1; 1 < 100; i++) {
//            s = s + " " + 1;
//        }
//        System.out.println(s);
//
        // Example 2:
//        float i = 0.0F;     // Example for floats
//        long j = 1_000_000_000L;    // Example for longs
//        int t = 32L;    // Example of a narrowing Conversion (!!!!NOT ALLOWED!!!!)
//        int u = (int)32L;   // Example of a cast
//
//        float i = (float)4_999_000_999L;    // Example showcasing a loss of precision as floating point numbers are not as precise as integral numbers
//        System.out.println(i);

        // Example 3: Showcasing Java Arithmetic Operators
//        long i = 4_999_000_999L;
//        System.out.println(i + 8.0);    // Example of Mixed Mode Arithmetic
//
//        long i = 4_999_000_999L;
//        System.out.println(i + i % 4.5);    // Example of Modulus

//        long i = 1;
//        System.out.println(i++);    // Example showcasing Postfix // i = 1 +
//        System.out.println(i);

//        long i = 1;
//        System.out.println(++i);    // Example showcasing Prefix // i = + 1
//        System.out.println(i);

        // Example 4: Showcasing Relational Operators in Java
//        double d1 = 9.0;
//        double d2 = 9.001;
//        if (Math.abs(d1=d2) < 0.001)
//      }

        // Example 5: Showcasing Logical Operators
//        boolean b = false;
//        boolean b1 = true;
//        System.out.println(b && b1);

        // Example using var:
//        var message = "Hello World! ";

        // Example of Trinary Operator: (10:15-10:20)
//        int i = 0;
//        boolean b ()