package ua.lviv.lgs.task3;

public class Application {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add("ABCF"+5);
        }
        arr.remove(4);
        arr.remove(2);


        System.out.println(arr.toString());
    }
}
