import java.util.Scanner;
import java.util.ArrayList;
public class PokemonGame {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> badges = new ArrayList<>();
//      Use of encapsulation via the Pokemon.java class
        Pokemon Pikachu = new Pokemon("Pikachu", "Electric", 35,
                "Thunderbolt",
                "Tackle",
                "Growl", 9);

        Pokemon Squirtle = new Pokemon("Squirtle", "Water", 4,
                "Water Gun",
                "Tail Whip",
                "Tackle", 9);

        Pokemon Charmander = new Pokemon("Charmander", "Fire", 5,
                "Fire blast",
                "Scratch",
                "Ember", 13);

        Pokemon Pidgin = new Pokemon("Pidgin", "Flying", 12,
                "Wing attack",
                "Tackle",
                "Sand attack", 5);

        //      Varies the amount of damage applied on the enemy

        int EasyPoints = (int) (Math.random() * Pidgin.getLevel()+ 1);
        int MediumPoints = (int) (Math.random() * Squirtle.getLevel() + 1);
        int HardPoints = (int) (Math.random() * Charmander.getLevel()+ 1);

        System.out.println("You are using Pikachu... Good luck!");
        start(Pikachu, Squirtle, Charmander, Pidgin, EasyPoints, MediumPoints, HardPoints, badges);
    }

    private static void start(Pokemon Pikachu, Pokemon Squirtle, Pokemon Charmander,
                              Pokemon Pidgin, int EasyPoints, int MediumPoints,
                              int HardPoints, ArrayList<String> badges) throws InterruptedException {

        System.out.println("Time for your first battle");
        Thread.sleep(1500);
        System.out.println("Your opponent sends out Pidgin: Health points: " + Pidgin.getHealthPoints());
        Scanner userInput = new Scanner(System.in);

        int enemyHp = Pidgin.getHealthPoints();
        int userPokemonHp = Pikachu.getHealthPoints();
        int UserAttackPoints;
        int user;

        while (enemyHp > 0 && userPokemonHp > 0) {
            System.out.println("Select 1 to use " + Pikachu.getMoveOne());
            System.out.println("Select 2 to use " + Pikachu.getMoveTwo());
            System.out.println("Select 3 to use " + Pikachu.getMoveThree());
            user = userInput.nextInt();
            UserAttackPoints = (int) (Math.random() * Pikachu.getLevel());

            switch (user) {
                case 1 -> {
                    System.out.println(Pikachu.getName() + " used " + Pikachu.getMoveOne() + " and caused " + UserAttackPoints + " pts of damage");
                    System.out.println("Pidgin HP: ");
                    System.out.println(enemyHp = enemyHp - UserAttackPoints);
                    Thread.sleep(3000);
                    System.out.println("---------------");
                    if (enemyHp > 0) {
                        System.out.println(Pidgin.getName() + " used " + Pidgin.getMoveOne() + " and caused " + EasyPoints + " pts of damage");
                        System.out.println("Pikachu HP: ");
                        System.out.println(userPokemonHp = userPokemonHp - EasyPoints);
                        Thread.sleep(1500);
                        System.out.println("---------------");
                    }
                }
                case 2 -> {
                    System.out.println(Pikachu.getName() + " used " + Pikachu.getMoveTwo() + " and caused " + UserAttackPoints + " pts of damage");
                    System.out.println("Pidgin HP: ");
                    System.out.println(enemyHp = enemyHp - UserAttackPoints);
                    Thread.sleep(3000);
                    System.out.println("---------------");
                    if (enemyHp > 0) {
                        System.out.println(Pidgin.getName() + " used " + Pidgin.getMoveTwo() + " and caused " + EasyPoints + " pts of damage");
                        System.out.println("Pikachu HP: ");
                        System.out.println(userPokemonHp = userPokemonHp - EasyPoints);
                        Thread.sleep(1500);
                        System.out.println("---------------");
                    }
                }
                case 3 -> {
                    System.out.println(Pikachu.getName() + " used " + Pikachu.getMoveThree() + " and caused " + UserAttackPoints + " pts of damage");
                    enemyHp = enemyHp - UserAttackPoints;
                    System.out.println("Pidgin HP: " + enemyHp);
                    Thread.sleep(3000);
                    System.out.println("---------------");
                    if (enemyHp > 0) {
                        System.out.println(Pidgin.getName() + " used " + Pidgin.getMoveThree() + " and caused " + EasyPoints + " pts of damage");
                        userPokemonHp = userPokemonHp - EasyPoints;
                        System.out.println("Pikachu HP: " + userPokemonHp);
                        Thread.sleep(1500);
                        System.out.println("---------------");
                    }
                }
            }
        }

        if (enemyHp <= 0) {
            System.out.println("You beat trainer one");
            badges.add("Flying badge");
            System.out.println("Congratulations, you earned the " + badges.get(0));
        } else {
            System.out.println("Your pokemon fainted");
            System.out.println("Game Over");
            System.out.println("Your badges earned: ");
            for (String badge : badges) {
                System.out.println(badge);
            }
        }}}
