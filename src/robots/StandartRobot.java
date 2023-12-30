package robots;

public class StandartRobot extends Robot implements Yell, Move, Shoot {
    public StandartRobot(String name) {super(name, "1.0.3"); }

    @Override
    public String startYelling() {return "Hey!";}

    @Override
    public String move() {return "I can move only forward and make turns.";}

    @Override
    public String shoot() {return "Need some preparations and I will shoot where you are pointing at.";}
}
