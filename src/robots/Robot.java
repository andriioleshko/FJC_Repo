package robots;

public class Robot implements Shoot, Move, Yell, Defence {
    private String name;
    private String version;

    public Robot(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String shoot() {
        return null;
    }

    @Override
    public String startYelling() {
        return null;
    }

    @Override
    public String defence() {
        return "Nobody can't override my functions and force to do what is banned for me when I was created :).";
    }
}