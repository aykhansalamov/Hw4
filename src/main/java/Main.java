import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.species = "poodle";
        pet.nickName = "Lucy";
        pet.age = 2;
        pet.trickLevel = 64;
        pet.habits = new String[]{"eating", "running", "playing"};

        Human father = new Human("Mark", "Zuckerberg", 1985);
        Human mother = new Human("Marry", "Zuckerberg", 1986);

        Human child = new Human("Jack", "Zuckerberg", 2020,
                mother, father,
                84,
                pet,
                new String[][]{{"monday, do exercise"}}
        );


        child.greetPet();
        child.describePet();
        pet.respond();


        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean feedTime;
        if (pet.trickLevel >= secretNumber) {
            feedTime = true;
        } else {
            feedTime = false;
        }
        child.feedPet(feedTime);


        pet.eat();
        System.out.println(child);


    }
}