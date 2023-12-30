package robots;

public class AdvancedRobot extends Robot implements Yell, Move, Shoot, Defence {
    public AdvancedRobot(String name) {super(name, "1.1.0");}

    @Override
    public String startYelling() {return "Oy! What you are looking at?";}

    @Override
    public String move() {return "I'm going anywhere I want!";}

    @Override
    public String shoot() {return "Aware, I'm shooting like a pro!";}
}
