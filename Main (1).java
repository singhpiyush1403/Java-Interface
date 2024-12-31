
interface Animal {
    void sound(); 
    void eat();    
}


class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks: Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats dog food.");
    }
}


class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows: Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats cat food.");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

       
        System.out.println("Dog:");
        dog.sound();
        dog.eat();

        System.out.println("\nCat:");
        cat.sound();
        cat.eat();
    }
}
