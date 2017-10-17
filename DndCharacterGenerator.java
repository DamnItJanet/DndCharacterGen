// DnD Character Generator
// Adam Ashcraft
// September 6th, 2017

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class DndCharacterGenerator {

    static Character character = new Character();
    static Scanner input = new Scanner(System.in);

    public static int[] rollStats() {
        Random dice = new Random();
        int skills[] = new int[6];
        int rolls[] = new int[4];

        // Roll each skill
        for (int i = 0; i < 6; i++) {
            // Roll four D6
            for (int j = 0; j < 4; j++)
                rolls[j] = dice.nextInt(5) + 1;

            // Sort the numbers
            Arrays.sort(rolls);

            // Drop the smallest number and add the rest to the skill
            for (int j = 1; j < 4; j++)
                skills[i] += rolls[j];
        }

        Arrays.sort(skills);
        return skills;
    }

    public static void chooseRace() {
        int raceChoice = 0;
        int subraceChoice = 0;
        boolean validAnswer = false;

        // Choosing a race
        while (!validAnswer) {
            System.out.println("Enter the number of the race you would you like your character to be:");
            System.out.println("\t1. Dragonborn");
            System.out.println("\t2. Dwarf");
            System.out.println("\t3. Elf");
            System.out.println("\t4. Gnome");
            System.out.println("\t5. Half-Elf");
            System.out.println("\t6. Half-Orc");
            System.out.println("\t7. Halfling");
            System.out.println("\t8. Human");
            System.out.println("\t9. Tiefling");

            raceChoice = input.nextInt();
            input.nextLine();
            System.out.println();

            if (raceChoice > 0 && raceChoice < 10)
                validAnswer = true;
        }

        validAnswer = false;

        // Choosing a subrace
        switch (raceChoice) {
            case 1:
                // Set race to Dragonborn
                character.setRace("Dragonborn");
                break;

            case 2:
                while (subraceChoice != 1 && subraceChoice != 2) {
                    // Dwarf subrace choice
                    System.out.println("What subrace would you like your Dwarf to be?");
                    System.out.println("\t1. Hill Dwarf");
                    System.out.println("\t2. Mountain Dwarf");

                    subraceChoice = input.nextInt();
                    input.nextLine();
                    System.out.println();
                }

                if (subraceChoice == 1)
                    character.setRace("Hill Dwarf");
                else if (subraceChoice == 2)
                    character.setRace("Mountain Dwarf");

                break;

            case 3:
                while (subraceChoice != 1 && subraceChoice != 2 && subraceChoice != 3) {
                    // Elf subrace choice
                    System.out.println("What subrace would you like your Elf to be?");
                    System.out.println("\t1. High Elf");
                    System.out.println("\t2. Dark Elf");
                    System.out.println("\t3. Wood Elf");

                    subraceChoice = input.nextInt();
                    input.nextLine();
                    System.out.println();
                }

                if (subraceChoice == 1)
                    character.setRace("High Elf");
                else if (subraceChoice == 2)
                    character.setRace("Dark Elf");
                else if (subraceChoice == 3)
                    character.setRace("Wood Elf");

                break;

            case 4:
                while (subraceChoice != 1 && subraceChoice != 2) {
                    // Gnome subrace choice
                    System.out.println("What subrace would you like your Gnome to be?");
                    System.out.println("\t1. Forest Gnome");
                    System.out.println("\t2. Rock Gnome");

                    subraceChoice = input.nextInt();
                    input.nextLine();
                    System.out.println();
                }

                if (subraceChoice == 1)
                    character.setRace("Forest Gnome");
                else if (subraceChoice == 2)
                    character.setRace("Rock Gnome");

                break;

            case 5:
                // Set race to Half-Elf
                character.setRace("Half-Elf");
                break;

            case 6:
                // Set race to Half-Orc
                character.setRace("Half-Orc");
                break;

            case 7:
                while (subraceChoice != 1 && subraceChoice != 2) {
                    // Halfling subrace choice
                    System.out.println("What subrace would you like your Halfling to be?");
                    System.out.println("\t1. Lightfoot Halfling");
                    System.out.println("\t2. Stout Halfling");

                    subraceChoice = input.nextInt();
                    input.nextLine();
                    System.out.println();
                }

                if (subraceChoice == 1)
                    character.setRace("Lightfoot Halfling");
                else if (subraceChoice == 2)
                    character.setRace("Stout Halfling");

                break;

            case 8:
                // Set race to Human
                character.setRace("Human");
                break;

            case 9:
                // Set race to Tiefling
                character.setRace("Tiefling");
                break;
        }
    }

    public static void chooseClass() {
        int classChoice = 0;
        int pathChoice = 0;
        boolean validAnswer = false;

        while (!validAnswer) {
            System.out.println("Enter the number of the class you would you like your character to be:");
            System.out.println("\t1. Barbarian");
            System.out.println("\t2. Bard");
            System.out.println("\t3. Cleric");
            System.out.println("\t4. Druid");
            System.out.println("\t5. Fighter");
            System.out.println("\t6. Monk");
            System.out.println("\t7. Paladin");
            System.out.println("\t8. Ranger");
            System.out.println("\t9. Rogue");
            System.out.println("\t10. Sorcerer");
            System.out.println("\t11. Warlock");
            System.out.println("\t12. Wizard");

            classChoice = input.nextInt();
            input.nextLine();
            System.out.println();

            if (classChoice >= 1 && classChoice <= 12)
                validAnswer = true;
        }

        switch (classChoice) {
            case 1:
                // Set class to Barbarian
                character.setClass("Barbarian");
                break;

            case 2:
                // Set class to Bard
                character.setClass("Bard");
                break;

            case 3:
                // ADD DIVINE DOMAIN CHOICE
                // Set class to Cleric
                character.setClass("Cleric");
                break;

            case 4:
                // Set class to Druid
                character.setClass("Druid");
                break;

            case 5:
                // ADD FIGHTING STYLE CHOICE
                // Set class to Fighter
                character.setClass("Fighter");
                break;

            case 6:
                // Set class to Monk
                character.setClass("Monk");
                break;

            case 7:
                // Set class to Paladin
                character.setClass("Paladin");
                break;

            case 8:
                // Set class to Ranger
                character.setClass("Ranger");
                break;

            case 9:
                // Set class to Rogue
                character.setClass("Rogue");
                break;

            case 10:
                // ADD SORCEROUS ORIGIN CHOICE
                // Set class to Sorcerer
                character.setClass("Sorcerer");
                break;

            case 11:
                // Set class to Warlock
                character.setClass("Warlock");
                break;

            case 12:
                // Set class to  Wizard
                character.setClass("Wizard");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Dungeons and Dragons 5th edition character generator!\n");

        int skills[] = rollStats();
        chooseRace();
        chooseClass();
        character.setStats(skills);
        character.calculateHealth();
        character.chooseName();

        character.printCharacterDetails();

    }
}
