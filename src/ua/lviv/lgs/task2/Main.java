package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Press 1 if you want to check that months exist");
        System.out.println("Press 2 if you want to print all mounth with the same seasson");
        System.out.println("Press 3 if you want to print all mounths that have the same number" + " of days");
        System.out.println("Press 4 if you want to print all mounths that have minimal number of day");
        System.out.println("Press 5 if you want to print all mounths that have maximal number of day");
        System.out.println("Press 6 if you want to print next seasson");
        System.out.println("Press 7 if you want to print previous seasson");
        System.out.println("Press 8 if you want to print all mounths that have even number of days");
        System.out.println("Press 9 if you want to  print all mounths that have odd number of days");
        System.out.println("Press 10 if you want know that mounth has even number of days");

    }

    public static void main(String[] args) {
        ArrayList<Month> month = new ArrayList<Month>();
        month.addAll(Arrays.asList(Month.values()));
        System.out.println(month);
        ArrayList<Seassons> seassons = new ArrayList();
        seassons.addAll(Arrays.asList(Seassons.values()));


        Scanner in = new Scanner(System.in);
        while (true) {
            menu();
            switch (in.next()) {
                case "1": {
                    in = new Scanner(System.in);
                    String monthS = in.next();
                    boolean flag = isMonthPresent(month, monthS);
                    if (!flag) {
                        System.out.println("Doesnt exist");
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter seasson");
                    in = new Scanner(System.in);
                    String directionSe = in.next();

                    boolean flag = false;

                    for (Month mon : month) {
                        if (mon.getSeassons().name().equalsIgnoreCase(directionSe)) {
                            flag = true;

                        }
                    }
                    if (flag == true) {

                        for (Month mounth : month) {
                            if (mounth.getSeassons().toString().equalsIgnoreCase(directionSe)) {
                                System.out.println(mounth);
                            }
                        }
                    }
                    if (flag == false) {
                        System.out.println("Mounth doesen`t exist");

                    }

                    break;
                }

                case "3": {
                    System.out.println("Enter days");
                    in = new Scanner(System.in);
                    int days = in.nextInt();

                    boolean flag = false;

                    for (Month mon : month) {
                        if (mon.getDays() == days) {
                            flag = true;

                        }
                    }
                    if (flag == true) {

                        for (Month mon : month) {
                            if (mon.getDays() == days) {
                                System.out.println(mon);
                            }
                        }
                    }
                    if (flag == false) {
                        System.out.println("Mounth doesen`t exist");

                    }
                    break;
                }
                case "4": {
                    Month mont = Month.valueOf("SEPTEMBER");
                    for (Month mon : month) {
                        if (mon.getDays() < mont.getDays()) {
                            mont = mon;
                        }

                    }
                    System.out.println(mont);


                    break;
                }

                case "5": {
                    int days = Month.JANUARY.getDays();
                    for (Month m : month) {
                        if (m.getDays() > days) days = m.getDays();
                    }
                    for (Month m : month)
                        if (m.getDays() == days) System.out.println(m.name() + " - Number of days " + days);


                    break;
                }
                case "6": {
                    System.out.println("Enter season");
                    in = new Scanner(System.in);
                    String season = in.next();

                    boolean flag = Season(seassons, season);
                    if (flag) {
                        Seassons s = Seassons.valueOf(season.toUpperCase());
                        int ordinal = s.ordinal();
                        if(ordinal == seassons.size()-1){
                            System.out.println(seassons.get(0));
                        }else {
                            System.out.println(seassons.get(ordinal+1));
                        }

                    }
                    if (!flag) {
                        System.out.println("Doesnt exist");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Enter season");
                    in = new Scanner(System.in);
                    String season = in.next();

                    boolean flag = Season(seassons, season);
                    if (flag) {
                        Seassons s = Seassons.valueOf(season.toUpperCase());
                        int ordinal = s.ordinal();
                        if(ordinal == 0){
                            System.out.println(seassons.size()-1);
                        }else {
                            System.out.println(seassons.get(ordinal-1));
                        }

                    }
                    if (!flag) {
                        System.out.println("Doesnt exist");
                    }
                    break;
                }

                case "8": {
                    System.out.println("Even number");

                    for (Month mon : month) {
                        if(mon.getDays()%2==0){
                            System.out.println(mon.name() + " days " + mon.getDays() );
                        }

                    }

                    break;
                }
                case "9": {
                    System.out.println("Even number");

                    for (Month mon : month) {
                        if(mon.getDays()%2==1){
                            System.out.println(mon.name() + " days " + mon.getDays() );
                        }

                    }

                    break;
                }
                case "10":{
                    System.out.println("Enter month");
                    String m = in.next();
                    boolean flag = isMonthPresent(month,m);
                    Month ma = Month.valueOf(m);
                    if(flag){
                        if(ma.getDays()%2==0){
                            System.out.println("Even " + " days " + ma.getDays());
                        }
                        else {
                            System.out.println("Odd " + " days " + ma.getDays());
                        }
                    }
                    break;
                }

            }

        }
    }

    private static boolean isMonthPresent(ArrayList<Month> months, String month) {
        boolean flag = false;
        for (Month m : months) {
            if (m.name().equalsIgnoreCase(month)) {
                System.out.println("Month exist");
                flag = true;
            }
        }
        return flag;
    }

    private static boolean Season(ArrayList<Seassons>  seassons, String seasson) {
        boolean flag = false;
        for (Seassons m : seassons) {
            if (m.name().equalsIgnoreCase(seasson)) {
                System.out.println("Month exist");
                flag = true;
            }
        }
        return flag;
    }
}