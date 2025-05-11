//import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

//        // Printing to the console
//        System.out.println("I like Pizza !");
//        System.out.print("They taste good.\n");
//        System.out.println("Buy me some 🫠");
//        System.out.print("I am craving for that !");


//        // Variables
//        // Primitive
//        int age = 18;
//        double gpa = 9.48;
//        char grade = 'O';
//        boolean isStudent = true;
//
//        System.out.println("Your age is " + age);
//        System.out.println("Your gpa is " + gpa);
//        System.out.println("Your grade is " + grade);
//        System.out.println("Student ? " + isStudent);
//
//        if (isStudent){
//            System.out.println("Yes, you're a student");
//        } else{
//            System.out.println("You're not a student");
//        }
//
//        // Reference
//        String name = "Sri";
//        String car = "Lamborghini";
//
//        System.out.println("Your name is " + name + " and you own a " + car);


//        // User input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//        System.out.print("Are you a student: (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Your name is " + name);
//        System.out.println("Your age is " + age);
//        System.out.println("Your gpa is " + gpa);
//        if (isStudent){
//            System.out.println("You are a student\n");
//        } else{
//            System.out.println("You're not !!\n");
//        }
//
//        System.out.print("Enter the year you were born: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Enter the color you like: ");
//        String color = scanner.nextLine();
//
//        System.out.println("You were born in " + age + " and the color you like is " + color);
//
//        scanner.close();

//        // Area of a triangle
//        Scanner scanner = new Scanner(System.in);
//
//        double width = 0, height = 0, area = 0;
//        System.out.print("Enter the width: ");
//        width = scanner.nextDouble();
//        System.out.print("Enter the height: ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//        System.out.println("The area of the triangle is: " + area + "cm²");


//         // Arithmetic Operators
//         int x = 10, y = 3, z, a;
//
//         z = x + y;
//         a = x % y;
//         x += 1;
//         y--;
//
//        System.out.println(z + " " + a + " " + x + " " + y);
//
//        // Order of operations [P-E-M-D-A-S]
//        double result = 3 * 4 - (8 - 3) + Math.pow(2, 2) / 2.0;
//        System.out.println(result);


//        // Conditionals
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        int age;
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        if (name.isEmpty()) {
//            System.out.println("\nYou didn't enter your name !!");
//        } else {
//            System.out.println("\nWelcome " + name + "!");
//        }
//
//
//        if (age >= 65) {
//            System.out.println("You are a senior citizen");
//        } else if (age >= 18) {
//            System.out.println("You are an adult");
//        } else if (age < 0) {
//            System.out.println("You haven't been born yet !");
//        } else if (age == 0) {
//            System.out.println("You are a baby");
//        } else {
//            System.out.println("You are a child");
//        }
//
//        scanner.close();


//        // Random module
//        Random random = new Random();
//
//        int number;
//        boolean toss;
//        number = random.nextInt(1, 7);
//        toss = random.nextBoolean();
//
//        System.out.println(number);
//        if (toss) {
//            System.out.println("HEADS");
//        } else {
//            System.out.println("TAILS");
//        }


//        // Math operations
//        double result;
//
//        result = Math.pow(3, 2);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.14);
//        result = Math.round(3.14);
//        result = Math.sqrt(9);
//        result = Math.max(3, 2);
//        result = Math.min(3, 2);
//        result = Math.abs(-3);
//
//        System.out.println(result);
//
//        // Problem - 1: Hypotenuse (c = a² + b²)
//        Scanner scanner = new Scanner(System.in);
//
//        double a, b, c;
//
//        System.out.print("Enter the side 'a': ");
//        a = scanner.nextDouble();
//        System.out.print("Enter the side 'b': ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("The hyp. is " + c + " cm");
//
//        scanner.close();
//
//        // Problem - 2: Circumference, Area and Volume of a circle
//        Scanner scanner = new Scanner(System.in);
//
//        double radius, circumference, area, volume;
//        System.out.print("Enter the radius of the circle: ");
//        radius = scanner.nextDouble();
//
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
//
//        System.out.printf("The area of the circle is: %.2f cm\n", circumference);
//        System.out.printf("The area of the circle is: %.2f cm²\n", area);
//        System.out.printf("The area of the circle is: %.2f cm³", volume);
//
//        scanner.close();


//        // printf();
//        // %[specifier character][.precision][flags][width]
//
//        // %[specifier character] %f for double, %c for char, %s for string, %b for bool
//        int age = 18;
//        System.out.printf("Your age is %d", age);
//
//        // %[.precision]
//        double pi = 3.1415;
//        System.out.printf("\nThe value of pi is %.2f", pi);
//
//        // %[flags] '+', ',', '(', ' ' --> A minus if neg. or space if pos.
//        double number1 = 5100000.558;
//        double number2 = -999849465.255544;
//        System.out.printf("\n%+,f", number1);
//        System.out.printf("\n%+,(f", number2);
//
//        // %[width] number, neg.num, 0 --> padding
//        int id1 = 1;
//        int id2 = 23;
//        int id3 = 456;
//        int id4 = 7890;
//
//        System.out.printf("\n%04d", id1);
//        System.out.printf("\n%4d", id2);
//        System.out.printf("\n%-4d", id3);
//        System.out.printf("\n%d", id4);



    }
}
































