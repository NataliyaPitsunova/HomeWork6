package Animals;

import Animals.Animal;

import java.util.InputMismatchException;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int a) {

        if (a>200) {
            System.out.println("Кот "+name+ " не может пробежать больше 200 метров");
        } else {if (a<0){
            System.out.println("Не может быть отрицательное значение");}
        else {
            System.out.println("Кот "+name+ " пробежал "+a+" метров");}
        }
    }

    @Override
    public void swim(int b) {
        System.out.println("Кот "+name+ " не умеет плавать");
    }

}
