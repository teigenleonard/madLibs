/**
 * Created by teigenleonard on 6/23/17.
 */

import java.util.Scanner;
public class madLibs
{
    public static void main(String args[])
    {
        String ageAsString;
        String name;
        String adjective;
        String noun;
        String adverb;
        String verb;
        boolean badWord;

        Scanner foo = new Scanner(System.in);

        System.out.printf("How old are you?\n");
        ageAsString = foo.nextLine();
        int age = Integer.parseInt(ageAsString);
        if (age < 13)
        {
            System.out.printf("You are not old enough to play this game");
            System.exit(0);
        }

        System.out.printf("Enter a name:\n");
        name = foo.nextLine();
        System.out.printf("Enter an adjective:\n");
        adjective = foo.nextLine();

        do
        {
            System.out.printf("Enter a noun:\n");
            noun = foo.nextLine();
            badWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
            if (badWord)
            {
                System.out.printf("C'mon, you can do better than that. Try again! \n\n");
            }
        } while (badWord);
        System.out.printf("Enter an adverb:\n");
        adverb = foo.nextLine();
        System.out.printf("Enter a verb ending in -ing:\n");
        verb = foo.nextLine();

        System.out.printf("My Mad Libs\n _____________________ \n\n");
        System.out.printf("%s is a %s %s.", name, adjective, noun);
        System.out.printf("  All day and all night they are %s %s.", adverb, verb);


    }
}
