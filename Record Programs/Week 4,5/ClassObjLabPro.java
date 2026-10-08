class Animal {
    String name;
    String stay;
    String food;
    String sound;

    Animal(String name, String stay, String food, String sound) {
        this.name = name;
        this.stay = stay;
        this.food = food;
        this.sound = sound;
    }

    void display() {
        System.out.println("Animal : " + name);
        System.out.println("Stays  : " + stay);
        System.out.println("Eats   : " + food);
        System.out.println("Sound  : " + sound);
        System.out.println();
    }
}

public class ClassObjLabPro  {
    public static void main(String[] args) {

        Animal cow = new Animal("Cow", "Cowshed", "Grass", "Moo");
        Animal pig = new Animal("Pig", "Pigsty", "Vegetables", "Oink");
        Animal horse = new Animal("Horse", "Stable", "Grass", "Neigh");

        cow.display();
        pig.display();
        horse.display();
    }
}

