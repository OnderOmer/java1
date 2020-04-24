package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("\tOzgur");
        System.out.println("\t\t\t\t\t\t\t\t\tHello");

        // \t means a paragraph
        System.out.println("Cybertek\nSchool");
        System.out.println("\nMy\nname\nis\nOzgur");

        // \n means new line, starts with new line

        // print: My favorite TV show is " Game of Thrones"

        System.out.println("My Favorite TV show is \"Game of Thrones\"");

        // print: My favorite book is " I will never see the world again"
        System.out.println("My Favorite book is \"I will never see the world again\" ");
        // \" means double quote, prints double quote to the console

        System.out.println("\\");
        // \\ prints single slash on console
        System.out.println("/");

        System.out.println("My favorite job is \'Teaching\'");
        System.out.println("My favorite job is 'Teaching'");
        // \' and '' print single quote

    }



}
