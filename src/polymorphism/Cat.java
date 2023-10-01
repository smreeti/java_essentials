package polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meow");
    }

    public void scratch(){
        System.out.println("Cat scratch things");
    }
}
