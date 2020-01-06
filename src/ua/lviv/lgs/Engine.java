package ua.lviv.lgs;

public class Engine {
    private int cylindry;

    public Engine(int cylindry) {
        this.cylindry = cylindry;
    }

    public int getCylindry() {
        return cylindry;
    }

    public void setCylindry(int cylindry) {
        this.cylindry = cylindry;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylindry=" + cylindry +
                '}';
    }
}