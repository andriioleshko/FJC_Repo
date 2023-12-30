package robots;

public class PrimitiveRobot extends Robot implements Yell, Move, Shoot {
    public PrimitiveRobot(String name) {super(name, "1.0.0");}

    @Override
    public String startYelling() {return "I can't yell at you, Master.";}

    @Override
    public String move() {return "I cannot move.";}

    @Override
    public String shoot() {return "I'll try my best to shoot.";}
}
