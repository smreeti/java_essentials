package polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog woof");
    }

    public void fetch(){
        System.out.println("Dog fetch");
    }
}
