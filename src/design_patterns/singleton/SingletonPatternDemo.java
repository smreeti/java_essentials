package design_patterns.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}

class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
    }

    // Only one thread can execute this at a time
//    public static synchronized Singleton getInstance()
    //Get the only object available
    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}