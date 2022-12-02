import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) throws InterruptedException {
        Pokemon Pikachu = new Pokemon("Pikachu", "Electric", 35,
                "Thunderbolt",
                "Tackle",
                "Growl");

        Pokemon Squirtle = new Pokemon("Squirtle", "Water", 45,
                "Water Gun",
                "Tail Whip",
                "Tackle");

        Pokemon Charmander = new Pokemon("Charmander", "Fire", 50,
                "Fire blast",
                "Scratch",
                "Ember");

        Pokemon Pidgin = new Pokemon("Pidgin", "Flying", 15,
                "Wing attack",
                "Tackle",
                "Sand attack");

        int HighHitPoints = (int) (Math.floor(Math.random() * 9) + 3);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick your pokemon...");
        System.out.println("You are using Pikachu... Good luck!");
        start(Pikachu, Squirtle, Charmander, Pidgin, HighHitPoints);
    }

    private static void start(Pokemon Pikachu, Pokemon Squirtle, Pokemon Charmander, Pokemon Pidgin, int HighHitPoints) throws InterruptedException {
        System.out.println("Time for your first battle");
        System.out.println("Your opponent sends out Pidgin: Health points: " + Pidgin.getHealthPoints());
        Scanner userInput = new Scanner(System.in);

        int enemyHp = Pidgin.getHealthPoints();
        int userPokemonHp = Pikachu.getHealthPoints();

        do {
            System.out.println("Select 1 to use " + Pikachu.getMoveOne());
            System.out.println("Select 2 to use " + Pikachu.getMoveTwo());
            System.out.println("Select 3 to use " + Pikachu.getMoveThree());
            int user = userInput.nextInt();

            switch (user) {
                case 1 -> {
                    System.out.println(Pikachu.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pidgin HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Pidgin.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 2 -> {
                    System.out.println(Pikachu.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pidgin HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Pidgin.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 3 -> {
                    System.out.println(Pikachu.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pidgin HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Pidgin.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
            }
        } while (enemyHp > 0);
         if (enemyHp < 0) {
             System.out.println("You beat trainer one");
             System.out.println("Congratulations");
        }
         else if (userPokemonHp <= 0){
                System.out.println("Your pokemon fainted");
                System.out.println("Game Over");
//                        System.exit(0);
            }
         secondBattle(Pikachu,Squirtle,Charmander,HighHitPoints);
        }
    private static void secondBattle(Pokemon Pikachu, Pokemon Squirtle, Pokemon Charmander, int HighHitPoints) throws InterruptedException {
        System.out.println("Time for your first battle");
        System.out.println("Your opponent sends out Squirtle: Health points: " + Squirtle.getHealthPoints());
        Scanner userInput = new Scanner(System.in);

        int enemyHp = Squirtle.getHealthPoints();
        int userPokemonHp = Pikachu.getHealthPoints();

        do {
            System.out.println("Select 1 to use " + Pikachu.getMoveOne());
            System.out.println("Select 2 to use " + Pikachu.getMoveTwo());
            System.out.println("Select 3 to use " + Pikachu.getMoveThree());
            int user = userInput.nextInt();

            switch (user) {
                case 1 -> {
                    System.out.println(Pikachu.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Squirtle HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Squirtle.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 2 -> {
                    System.out.println(Pikachu.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Squirtle HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Squirtle.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Squirtle HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 3 -> {
                    System.out.println(Pikachu.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Squirtle HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Squirtle.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
            }
        } while (enemyHp > 0);
        if (enemyHp < 0) {
            System.out.println("You beat trainer two");
            System.out.println("Congratulations");
        }
        else if (userPokemonHp <= 0){
            System.out.println("Your pokemon fainted");
            System.out.println("Game Over");
        }

        finalBattle( Pikachu,Charmander, HighHitPoints);
    }
    private static void finalBattle(Pokemon Pikachu,Pokemon Charmander, int HighHitPoints) throws InterruptedException {

        System.out.println("Time for your first battle");
        System.out.println("Your opponent sends out Charmander: Health points: " + Charmander.getHealthPoints());
        Scanner userInput = new Scanner(System.in);

        int enemyHp = Charmander.getHealthPoints();
        int userPokemonHp = Pikachu.getHealthPoints();

        do {
            System.out.println("Select 1 to use " + Pikachu.getMoveOne());
            System.out.println("Select 2 to use " + Pikachu.getMoveTwo());
            System.out.println("Select 3 to use " + Pikachu.getMoveThree());
            int user = userInput.nextInt();

            switch (user) {
                case 1 -> {
                    System.out.println(Pikachu.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Charmander HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);

                    Thread.sleep(3000);
                    System.out.println(Charmander.getMoveOne() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 2 -> {
                    System.out.println(Pikachu.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Charmander HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Charmander.getMoveTwo() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
                case 3 -> {
                    System.out.println(Pikachu.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Charmander HP: ");
                    System.out.println(enemyHp = enemyHp - HighHitPoints);
                    Thread.sleep(3000);
                    System.out.println(Charmander.getMoveThree() + " caused " + HighHitPoints + " damage");
                    System.out.println("Pikachu HP: ");
                    System.out.println(userPokemonHp = userPokemonHp - HighHitPoints);
                }
            }
        } while (enemyHp > 0);
        if (enemyHp < 0) {
            System.out.println("You beat trainer two");
            System.out.println("Congratulations");
        }
        else if (userPokemonHp <= 0){
            System.out.println("Your pokemon fainted");
            System.out.println("Game Over");
        }
    }
    }
