// The goal is to let the program have one and only one instance (object) of a certain class, ever.

public class Singleton {
    // The instance is created immediately when the class loads, so no threading issues.
    private static final Singleton instance = new Singleton();

    // The constructor must be private so no other part of the program
    // can create new instances of the class using new.
    private Singleton() {}

    // A public static method returns the instance.
    public static Singleton getInstance() {
        return instance;
    }

    public String showMessage() {
        return "Hello, I am a singleton!";
    }
}

/*
public class Singleton {
    // Store the single instance inside a private static member variable
    private static Singleton instance;

    // The constructor must be private so no other part of the program
    // can create new instances of the class using new.
    private Singleton() {}

    // A public static method (usually named getInstance()) that checks
    // if the instance exists, and creates it if it doesn’t, then returns it.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String showMessage() {
        return "Hello, I am a singleton!";
    }
}

 */