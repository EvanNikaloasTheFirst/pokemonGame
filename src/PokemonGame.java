import java.util.Scanner;
import java.util.ArrayList;
public class PokemonGame {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> badges = new ArrayList<>();
//      Use of encapsulation via the Pokemon.java class
        Pokemon Pikachu = new Pokemon("Pikachu", "Electric", 27,
                "Thunderbolt",
                "Tackle",
                "Growl", 9);

        Pokemon Squirtle = new Pokemon("Squirtle", "Water", 27,
                "Water Gun",
                "Tail Whip",
                "Tackle", 9);

        Pokemon Charmander = new Pokemon("Charmander", "Fire", 30,
                "Fire blast",
                "Scratch",
                "Ember", 13);

        Pokemon Pidgin = new Pokemon("Pidgin", "Flying", 12,
                "Wing attack",
                "Tackle",
                "Sand attack", 5);

        Pokemon Piplup = new Pokemon("Piplup", "Water", 14,
                "Splash",
                "Water disc",
                "Tackle", 5);

        Pokemon Garchomp = new Pokemon("Garchomp", "Fighting", 25,
                "Slam punch",
                "Rock throw",
                "Tackle", 5);

// Starts game
        start(Pikachu, Squirtle, Charmander, Pidgin, Piplup, Garchomp, badges);
    }
    private static void start(Pokemon Pikachu, Pokemon Squirtle, Pokemon Charmander,
                              Pokemon Pidgin, Pokemon Garchomp, Pokemon Piplup, ArrayList badges) throws InterruptedException {

        Pokemon[] pokemons = {Pikachu, Squirtle, Charmander};
        Pokemon[] enemies = {Garchomp, Piplup, Pidgin};
        int choice;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select your pokemon:");
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println("Enter " + i + " for " + pokemons[i].getName());
        }
        choice = userInput.nextInt();
        Pokemon userChoice = pokemons[choice];
        System.out.println("You are using " + userChoice.getName() + "... Good luck!");
        for (Pokemon enemy : enemies) {
            challenges(userChoice, enemy, badges);
        }
    }

    public static void rollAttack(Pokemon attackingPokemon, Pokemon defendingPokemon) throws InterruptedException {
        int attackDamage = (int) (Math.random() * attackingPokemon.getLevel());
        if (attackingPokemon.getHealthPoints() > 0) {

                System.out.println(attackingPokemon.getName() + " used " + attackingPokemon.getMoveOne() + " and caused " + attackDamage + " pts of damage");
                defendingPokemon.setHealthPoints(defendingPokemon.getHealthPoints() - attackDamage);
                System.out.println(defendingPokemon.getName() + " HP: " + defendingPokemon.getHealthPoints());
                Thread.sleep(3000);
                System.out.println("-------------------");
            }
        }



    public static void rollAttack2(Pokemon attackingPokemon, Pokemon defendingPokemon) throws InterruptedException {
        int attackDamage = (int) (Math.random() * attackingPokemon.getLevel());
        if (attackingPokemon.getHealthPoints() > 0) {
                System.out.println(attackingPokemon.getName() + " used " + attackingPokemon.getMoveTwo() + " and caused " + attackDamage + "pts of damage");
                defendingPokemon.setHealthPoints(defendingPokemon.getHealthPoints() - attackDamage);
                System.out.println(defendingPokemon.getName() + " HP: " + defendingPokemon.getHealthPoints());
                Thread.sleep(3000);
                System.out.println("-------------------");
            }
        }


    public static void rollAttack3(Pokemon attackingPokemon, Pokemon defendingPokemon) throws InterruptedException {
        int attackDamage = (int) (Math.random() * attackingPokemon.getLevel());
        if (attackingPokemon.getHealthPoints() > 0) {
                System.out.println(attackingPokemon.getName() + " used " + attackingPokemon.getMoveThree() + " and caused " + attackDamage + "pts of damage");
                defendingPokemon.setHealthPoints(defendingPokemon.getHealthPoints() - attackDamage);
                System.out.println(defendingPokemon.getName() + " HP : " + defendingPokemon.getHealthPoints());
                Thread.sleep(3000);
                System.out.println("-------------------");
            }
        }


    public static void challenges(Pokemon attackingPokemon, Pokemon defendingPokemon, ArrayList badges) throws InterruptedException {
        int user;
        Scanner userInput = new Scanner(System.in);
        Thread.sleep(1100);
        System.out.println(("You are fighting " + defendingPokemon.getName() + ", good luck! "));

        while (attackingPokemon.getHealthPoints() > 0 && defendingPokemon.getHealthPoints() > 0) {
            System.out.println("Enter 1 to use: " + attackingPokemon.getMoveOne());
            System.out.println("Enter 2 to use: " + attackingPokemon.getMoveTwo());
            System.out.println("Enter 3 to use: " + attackingPokemon.getMoveThree());
            user = userInput.nextInt();
            switch (user) {
                case 1 -> {
                    if (attackingPokemon.getHealthPoints() > 0 && defendingPokemon.getHealthPoints() > 0) {
                        rollAttack(attackingPokemon, defendingPokemon);
                        rollAttack(defendingPokemon, attackingPokemon);
                    }
                }
                case 2 -> {
                    if (attackingPokemon.getHealthPoints() > 0 && defendingPokemon.getHealthPoints() > 0) {
                        rollAttack2(attackingPokemon, defendingPokemon);
                        rollAttack2(defendingPokemon, attackingPokemon);
                    }
                }

                case 3 -> {
                    if (attackingPokemon.getHealthPoints() > 0 && defendingPokemon.getHealthPoints() > 0) {
                        rollAttack3(attackingPokemon, defendingPokemon);
                        rollAttack3(defendingPokemon, attackingPokemon);
                    }
                }
            }
        }
        if (defendingPokemon.getHealthPoints() <= 0) {
            System.out.println("You defated " + defendingPokemon.getName());
            badges.add(defendingPokemon.getType() + " badge");
            System.out.println("Congratulations, you earned the " + defendingPokemon.getType() + " badge");
            Thread.sleep(1100);
            System.out.println("Your badges earned: ");
            for (Object badge : badges) System.out.println(badge);
        } else {
            System.out.println("Your pokemon fainted");
            System.out.println("Game Over");
            System.exit(0);
            System.out.println("Your badges earned: ");
            for (Object badge : badges) System.out.println(badge);
        }
    }
}
