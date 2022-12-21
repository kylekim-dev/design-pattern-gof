public class SingletonClass {
    // Definition: the singleton pattern is a software design pattern that restricts the instantiation of a class to a singular instance.
    private static SingletonClass instance  = null;

    private SingletonClass(){
    }

    public static SingletonClass getInstance(){
        // Lazy Initialization
        if(instance == null) { instance = new SingletonClass(); }
        return instance;
    }

    public void echo(){
        System.out.println("Hello, I'm Singleton Pattern.");
    }
}
