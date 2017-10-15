// DnD Character Generator
// Adam Ashcraft
// September 6th, 2017

public class Character {
    String name = "";
    String race = "";
    String class = "";
    String path = "No path chosen yet";
    int skills[] = new int[6];
    int modifiers[] = new int[6];
    int health = 0;

    public static void setName(String newName) {
        this.name = newName;
    }

    public static void setRace(String newRace) {
        this.race = newRace;
    }

    public static void setClass(String newClass) {
        this.class = newClass;
    }

    public static void setStats(int[] newSkills) {
        boolean[] choices = new boolean[6];
        choices[0] = choices[1] = choices[2] = choices[3] = choices[4] = choices[5] = false;

        boolean valid = false;

        System.out.println("This is what you rolled: " + newSkills[0] + ", " + newSkills[1] + ", " +
            newSkills[2] + ", " + newSkills[3] + ", " + newSkills[4] + ", " + newSkills[5] + ".");


        for (int i = 0; i < 6; i++) {
            System.out.println("Where would you like to put your " + newSkills[i] + "?");
            System.out.println("\t1. Strength");
            System.out.println("\t2. Dexterity");
            System.out.println("\t3. Constitution");
            System.out.println("\t4. Intelligence");
            System.out.println("\t5. Wisdom");
            System.out.println("\t6. Charisma");

            while (valid == false) {
                // ALLOCATE STATS
            }
        }
    }

    public static void calculateHealth() {
        switch (class) {
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
        System.out.println("Class: " + class);
        System.out.println("Strength: " + skills[0]);
        System.out.println("Dexterity: " + skills[1]);
        System.out.println("Constitution: " + skills[2]);
        System.out.println("Intelligence: " + skills[3]);
        System.out.println("Wisdom: " + skills[4]);
        System.out.println("Charisma: " + skills[5]);
    }
}
