Pokemon Game - Java 🚀
------------------------
Project Description 📑
-------------------
I have created a simple Pokemon battling game where users can select from a variety of Pokemons to battle
an array of enemies. This was a project created as part of an interview task for an internship with Airbus so 
I was required to use any version of Java and using only default Java libraries.

I  created this project using a very static method (as you can see in my intial commit) to create a frame work to work with to allow
the program to run intitially. Then building upon this I began to implement fucntions which allowed the 
program to become more dynamic. 

Using a simple input from the user, the user will navigate through selecting their fighting
pokemon and participating in a number of battles with rival pokemons.

Specification 🔎
------------------------
Interactive fiction game in java

Interactive fiction is a way of conveying the story whilst still giving the reader 
choices which might effect the stories outcome, 
taking a left path might lead you to a dead end or a pit full of snakes or 
taking the right path might lead you to the treasure vault

Use any IDE you want
Make any story you want
Use the option system as in the template below (you don't have to stick with its current choices), make sure you show off your skills on top of it though!
Do not use any non-default java libraries
You can use any version of java, but I would recommend Java 8
We are looking for a genuine interest in programming so try and make this project with a theme you enjoy and try and use some interesting techniques/methods

(Hint: you probably want to call start() from a public static void main so that it can run on start up, you may also want to initialize a few things there!)



private static void start()

    {

        System.out.println("You are in a room, there is a window, a door and a broom");

        System.out.println("Do you: 0: look out the window");

        System.out.println("Do you: 1: open the door and leave");

        if(!inventory.contains("broom"))

        {

            System.out.println("Do you: 2: take the broom");

        }

         

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch(input)

        {

            case "0":

                look("window");

                start();

                break;

            case "1":

                moveTo("hallway");

                break;

            case "2":

                if(!inventory.contains("broom"))

                {

                    System.out.println("You take the broom");

                    //You will need to initialize inventory in your main() method!

                    inventory.add("broom");

                }

                start();

                break;
        }
    }
   
  
    ------------------------
    How to Use the Project ⚒️
    
   1. Input a number from 0 - 2 to select the displayed Pokemons available
   2. Upon every round the user will be displayed with 3 attacking moves.
   Input a number from 1 - 3 to perfrom the desired move.
   3. As long as your Pokemon or the enemy pokemon's HP is above 0, the battle will continue;
   ---------------
   What did I learn ? 📩
   ------------------
   I refreshed my memory using java to perfrom repetive tasks in a much more dynamic aspect.
   Using setters and getters it was much easier to create Pokemons and set the relevant attributes to them. 
   Also referencing the attributes of the Pokemons was much easier to retrieve using the .get() function.
   
   
