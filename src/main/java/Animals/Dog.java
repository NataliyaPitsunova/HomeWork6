package Animals;

import Animals.Animal;

import java.util.InputMismatchException;

//У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int a) {

            if (a>500) {
                System.out.println("Собака "+name+ " не может пробежать больше 500 метров");
            } else {if (a<0){
                System.out.println("Не может быть отрицательное значение");}
                else {
                    System.out.println("Собака "+name+ " пробежал "+a+" метров");}
            }
    }

    @Override
    public void swim(int b) {

        if (b>10) {
            System.out.println("Собака "+name+ " не может проплыть более 10 метров");
        } else {if (b<0){
            System.out.println("Не может быть отрицательное значение");}
        else {
            System.out.println("Собака "+ name+ " проплыл "+b+" метров");}
        }
    }





}