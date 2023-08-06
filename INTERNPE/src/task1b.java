/**
 * This class represents a simple example of a task1b.
 */
public class task1b {
    private String name;
    private int age;

    /**
     * Constructs a new task1b object with the given name and age.
     *
     * @param name The name of the person.
     * @param age The age of the person.
     */
    public task1b(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Prints a greeting message for the person.
     */
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    /**
     * Entry point of the program. Creates a task1b object and demonstrates its usage.
     *
     * @param args Command line arguments (unused).
     */
    public static void main(String[] args) {
        // Create a task1b object
        task1b task1b = new task1b("Aniket", 30);

        // Accessing information using methods
        String personName = task1b.getName();
        int personAge = task1b.getAge();

        // Display information
        System.out.println("task1b's name: " + personName);
        System.out.println("task1b's age: " + personAge);

        // Update information using methods
        task1b.setName("sanjay");
        task1b.setAge(25);

        // Display updated information
        task1b.greet();
    }
}

