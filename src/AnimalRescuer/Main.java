package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Tisi";
        cat.age = 2;
        cat.favfoodname = "sunculitza";
        cat.favplaytimeactivity = "playing with a ball of yarn";
        cat.health = 8;
        cat.hungerlevel = 10;
        cat.mood = 10;
        System.out.println("my favorite cat's name is:");
        System.out.println(cat.name);
        System.out.println("her age is:");
        System.out.println(cat.age);
        System.out.println("her favorite food is");
        System.out.println(cat.favfoodname);
        System.out.println("her favorite playtime activity is:");
        System.out.println(cat.favplaytimeactivity);
        System.out.println("on a scale from 1 to 10 her health is:");
        System.out.println(cat.health);
        System.out.println("on a scale from 1 to 10 her hunger levels are:");
        System.out.println(cat.hungerlevel);
        System.out.println("on a scale from one to 10 her mood is almost always a:");
        System.out.println(cat.mood);

        AnimalFood type=new AnimalFood();
        type.name = "Whiskers";
        System.out.println("Tisi's favorite food is:");
        System.out.println(type.name);
        type.availability = "Whiskers is easy to find in pet shops";
        System.out.println(type.availability);
        type.price = 25;
        System.out.println("The cost for a kg of Whiskers is:");
        System.out.println(type.price);
        System.out.println("the number of kilo's of Whiskers Tisi eats within a week is:");
        type.quantity = 1;
        System.out.println(type.quantity);
        RecreationalActivity game = new RecreationalActivity();
        game.name = "Playing with a ball of yarn";
        System.out.println("Tisi's favorite activity is:");
        System.out.println(type.name);

        Adopter person = new Adopter();
        person.name = "Sabrina";
        System.out.println("Tisi's adopter name is:");
        System.out.println(person.name);
        System.out.println("Sabrina's budget is:");
        person.budget = 200;
        System.out.println(person.budget);


    }
}





