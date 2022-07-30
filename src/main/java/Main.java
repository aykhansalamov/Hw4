import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.species = "dog";
        pet.nickName = "Rock";
        pet.age = 5;
        pet.trickLevel = 75;
        pet.habits = new String[]{"eat", "drink", "sleep"};

        Human father = new Human("Vito", "Karleone");
        Human mother = new Human("Jane", "Karleone");
        Human child = new Human("Michael", "Karleone", 1977,
                mother, father,
                90,
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