import java.util.Scanner;

public class helloWorld {

    public static void arrayStuff(){
        int[] intArray = new int[10];

        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i*2;
            System.out.println(intArray[i]);
            sum += intArray[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void findGen(int age){
        if (age > 80) System.out.println("You are the greatest generation");
        else if (age > 60) System.out.println("You are a baby boomer");
        else if (age > 40) System.out.println("You are generation X");
        else if (age > 23) System.out.println("You are a millenial");
        else System.out.println("You are iGen");
    }

    public static int promptUser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        return age;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        arrayStuff();

        int age = promptUser();

        findGen(age);

    }
}



