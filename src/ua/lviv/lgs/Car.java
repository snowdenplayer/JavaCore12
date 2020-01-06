package ua.lviv.lgs;

public class Car {
    private int power;
    private int year;
    private Engine engine;
    private Rudder rudder;

    public Car(int power, int year, Engine engine, Rudder rudder) {
        this.power = power;
        this.year = year;
        this.engine = engine;
        this.rudder = rudder;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", year=" + year +
                ", engine=" + engine +
                ", rudder=" + rudder +
                '}';
    }
}