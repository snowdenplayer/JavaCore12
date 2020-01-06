package ua.lviv.lgs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        List<Car> car = new ArrayList();
        for (int i = 0; i < 5; i++) {
                Car car1 = new Car(r.nextInt(10),r.nextInt(60)+1958,new Engine(r.nextInt(12)+2),new Rudder(r.nextInt(20)));

                car.add(car1);


        }
        boolean quite = false;

        while (!quite) {

            System.out.println("\n\n1. Show cars. \n2. Fill all cars from one. \nq. Exit.");

            switch (scanner.nextLine()) {

                case "q":

                    quite = true;
                    break;

                case "1":

                    System.out.println(car);
                    break;

                case "2":

                    Car etalon = new Car(15,1987,new Engine(12),new Rudder(17));


                    for (int i = 0; i < car.size(); ++i)
                      car.set(i,etalon);

                    System.out.println("Complete!");
                    System.out.println(car);
                    break;

                default:

                    System.out.println("Wrong input, please try again!");
                    break;
            }
        }


        scanner.close();

    }

}