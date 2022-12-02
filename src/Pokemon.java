public class Pokemon {
    private String name;
    private String type;
    private int healthPoints;

    private String moveOne;

    private String moveTwo;

    private String moveThree;


    public Pokemon() {
        name = "null";
        type = "null";
        healthPoints = 0;
        moveOne = "null";
        moveTwo = "null";
        moveThree = "null";

    }

    public Pokemon(String Name,String Type,int HealthPoints,String MoveOne, String MoveTwo, String MoveThree){
        name = Name;
        type = Type;
        healthPoints = HealthPoints;
        moveOne = MoveOne;
        moveTwo = MoveTwo;
        moveThree = MoveThree;

    }
//    Getters
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public int getHealthPoints()
    {
        return healthPoints;
    }
    public String getMoveOne()
    {
        return moveOne;
    }
    public String getMoveTwo()
    {
        return moveTwo;
    }
    public String getMoveThree()
    {
        return moveThree;
    }

    //    SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setHealthPoints(int HealthPoints){
        this.healthPoints = HealthPoints;
    }
    public void setMoveOne(String MoveOne){
        this.moveOne = MoveOne;
    }
    public void setMoveTwo(String MoveTwo){
        this.moveTwo = MoveTwo;
    }
    public void setMoveThree(String MoveThree){
        this.moveTwo = MoveThree;
    }


    }
