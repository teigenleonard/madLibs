/**
 * Created by teigenleonard on 6/23/17.
 */

import java.util.Scanner;
public class madLibs
{
    public static void main(String args[])
    {
        String name;
        String adjective;
        String noun;
        String adverb;
        String verb;

        Scanner foo = new Scanner(System.in);
        System.out.printf("Enter a name:\n");
        name = foo.nextLine();
        System.out.printf("Enter an adjective:\n");
        adjective = foo.nextLine();
        System.out.printf("Enter a noun:\n");
        noun = foo.nextLine();
        System.out.printf("Enter an adverb:\n");
        adverb = foo.nextLine();
        System.out.printf("Enter a verb ending in -ing:\n");
        verb = foo.nextLine();

        System.out.printf("My Mad Libs\n _____________________ \n");
        System.out.printf("%s is a %s %s", name, adjective, noun);
        System.out.printf("All day and all night they are %s %s", adverb, verb);


    }
}
