public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        // Calls the sayMyStrength method
        knight.sayMyStrength();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        // Calls the sayMyStrength method
        mage.sayMyStrength();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        // Calls the sayMyStrength method
        thief.sayMyStrength();

        // Creates a new object named "ärcher" from Character class
        Character archer = new Character(10, 6, 9, "Jeno");
        archer.sayMyName();
        archer.sayMyStrength();

        Character healer = new Character(2, 4, 10, "Mark");
        healer.sayMyName();
        healer.sayMyStrength();
    }
}
