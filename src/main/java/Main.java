import Animals.Animal;
import Animals.Cat;
import Animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal dogFedor = new Dog("Федор", "Рыжий");
        dogFedor.run(200);
        dogFedor.swim(15);
        Animal catVasya = new Cat("Вася", "Черный");
        catVasya.run(250);
        catVasya.swim(10);
        Animal catMusya = new Cat("Муся", "Белая");
        catMusya.run(150);
        catMusya.swim(0);
        System.out.println("Количество животных: "+ Animal.getNumberOfAnimal());
    }
}
