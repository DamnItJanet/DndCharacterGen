// DnD Character Generator
// Adam Ashcraft
// September 6th, 2017

import java.util.Scanner;

public class Character {
    static Scanner input = new Scanner(System.in);
    static String name = "";
    static String race = "";
    static String clas = "";
    static String path = "No path chosen yet";
    static int skills[] = new int[6];
    static int modifiers[] = new int[6];
    static int health = 0;

    public static void setName(String newName) {
        name = newName;
    }

    public static void setRace(String newRace) {
        race = newRace;
    }

    public static void setClass(String newClass) {
        clas = newClass;
    }

    public static void setStats(int[] newSkills) {
        int choiceNum = -1;
        boolean valid = false;
        boolean[] choices = new boolean[6];
        choices[0] = choices[1] = choices[2] = choices[3] = choices[4] = choices[5] = false;

        System.out.println("This is what you rolled: " + newSkills[0] + ", " + newSkills[1] + ", " +
            newSkills[2] + ", " + newSkills[3] + ", " + newSkills[4] + ", " + newSkills[5] + ".");

        for (int i = 0; i < 6; i++) {
            while (valid == false) {
                System.out.println("Where would you like to put your " + newSkills[i] + "?");
                System.out.println("Do not choose a number that you have previously chosen.");
                System.out.println("\t1. Strength");
                System.out.println("\t2. Dexterity");
                System.out.println("\t3. Constitution");
                System.out.println("\t4. Intelligence");
                System.out.println("\t5. Wisdom");
                System.out.println("\t6. Charisma\n");

                choiceNum = input.nextInt() - 1;
                input.nextLine();

                if (choiceNum >= 0 && choiceNum <= 5 && choices[choiceNum] == false) {
                    valid = true;
                    choices[choiceNum] = true;

                    skills[choiceNum] = newSkills[i];
                }
                else {
                    System.out.println("That was not a valid choice, please try again.\n");
                }
            }
            valid = false;
        }

        // Calculate each ability modifier
        for (int i = 0; i < 6; i++)
            modifiers[i] = (skills[i] - 10) / 2;
    }

    public static void calculateHealth() {
        switch (clas) {
            case "Barbarian":
                health = 12 + modifiers[2];
                break;

            case "Bard":
                health = 8 + modifiers[2];
                break;

            case "Cleric":
                health = 8 + modifiers[2];
                break;

            case "Druid":
                health = 8 + modifiers[2];
                break;

            case "Fighter":
                health = 10 + modifiers[2];
                break;

            case "Monk":
                health = 8 + modifiers[2];
                break;

            case "Paladin":
                health = 10 + modifiers[2];
                break;

            case "Ranger":
                health = 10 + modifiers[2];
                break;

            case "Rogue":
                health = 8 + modifiers[2];
                break;

            case "Sorcerer":
                health = 6 + modifiers[2];
                break;

            case "Warlock":
                health = 8 + modifiers[2];
                break;

            case "Wizard":
                health = 6 + modifiers[2];
                break;
        }
    }

    public static void printCharacterDetails() {
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Class: " + clas);
        System.out.println("Strength: " + skills[0] + "\tModifier: " + modifiers[0]);
        System.out.println("Dexterity: " + skills[1] + "\tModifier: " + modifiers[1]);
        System.out.println("Constitution: " + skills[2] + "\tModifier: " + modifiers[2]);
        System.out.println("Intelligence: " + skills[3] + "\tModifier: " + modifiers[3]);
        System.out.println("Wisdom: " + skills[4] + "\tModifier: " + modifiers[4]);
        System.out.println("Charisma: " + skills[5] + "\tModifier: " + modifiers[5]);
    }
}
