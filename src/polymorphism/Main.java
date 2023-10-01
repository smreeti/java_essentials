package polymorphism;

public class Main {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //sasha is type Animal but instance of Dog
        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();

        ((Cat)sasha).scratch();
        feed(sasha);

        boolean isDog = sasha instanceof Animal;
        boolean isAnimal = sasha instanceof Dog;
        boolean isCat = sasha instanceof Cat;

     }

    public static void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("dog food");
        }
       else if(animal instanceof Cat){
            System.out.println("Cat food");
        }
    }
}
