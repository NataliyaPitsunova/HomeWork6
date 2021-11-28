package Animals;

public abstract class Animal {
    static int numberOfAnimal;
    protected String name;
    protected String color;

    public Animal() {
    }

    public Animal(String name, String color){
    this.name=name;
    this.color=color;
    numberOfAnimal++;
    }

    public abstract void run(int a);


    public abstract void swim(int b);

    public void animalsInfo() {
        System.out.println("Животное: " + name+ "; Цвет: "+color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static int getNumberOfAnimal() {
        return numberOfAnimal;
    }


    }




