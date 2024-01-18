import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // length() method
        String achieve = "Achieve";
        System.out.println("Size of the string " + achieve + " is " + achieve.length());

        // concat(String str) and + operator
        String achieveExcellence = achieve.concat(" Java excellence");
        System.out.println("Current value of the achieve variable: " + achieve);
        System.out.println("Value of the achieveExcellence: ".concat(achieveExcellence));

        String achieveCodeExcellence = achieveExcellence + " in your code";
        System.out.println("Value of the achieveCodeExcellence: " + achieveCodeExcellence);

        // substring
        String programs = "Programs";
        String programs2 = programs.substring(0);
        String programs3 = programs.substring(0, 8);
        System.out.printf("%s %s %s%n", programs, programs2, programs3);
        System.out.println(programs.substring(4,7));

        // trim
        String helloWithSpaces = "       Hello World!      ";
        String hello = helloWithSpaces.trim();
        System.out.printf("helloWithSpaces: %s |hello: %s", helloWithSpaces, hello);

        // tricky Java tests example
        String something = "        something        ";
        something.trim();
        System.out.println(something); // What will be printed to the console?

        // toLowerCase/toUpperCase
        String userInput = "here are my details: NAME: Micky MOUSE Adress: DisneyLand Road 1";
        String inputLowerCase = userInput.toLowerCase();
        System.out.println(inputLowerCase);
        String inputUpperCase = inputLowerCase.toUpperCase();
        System.out.println(inputUpperCase);

        // indexOf/lastIndexOf (like the opposite of charAt)
        char firstLetter = hello.charAt(0);
        System.out.println("Position of the first occurrence of letter l:");
        System.out.println(hello.indexOf('l'));
        System.out.println(hello.indexOf(108)); // you can provide unicode for the letter
        System.out.println("Position of the last occurrence of letter l:");
        System.out.println(hello.lastIndexOf('l'));

        System.out.println("Position of substring World in Hello World: " + hello.indexOf("World"));

        // replace
        System.out.println("Old hello content: " + hello);
        String newHello = hello.replace('l', '?');
        System.out.println("New hello content: " + newHello);

        String veryNewHello = hello.replace("World!", "Beautiful World!");
        System.out.println("Very new hello content: " + veryNewHello);

        String longString = "This is some very long string. Content of the string is not so important." +
                "We will just be using this string to demonstrate some functionality!";
        System.out.println(longString);
        System.out.println(longString.replace("string", "bus"));

        // casting with the valueOf
        int someInt = 10;
        System.out.println("Value of someInt: " + someInt);
        System.out.println("Value of someInt: " + String.valueOf(someInt));

        /*
        There are really a lot of methods in the String/StringBuilder class.
        We haven't covered all of them, but names are usually descriptive.
         */
    }
}