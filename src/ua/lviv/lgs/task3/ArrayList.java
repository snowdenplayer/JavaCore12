package ua.lviv.lgs.task3;

import java.util.Arrays;

public class ArrayList {
    private int size;
    private  String [] arr;

    public ArrayList() {
        this.arr = new String[10];
    }
    public void add(String s ){
        if(arr.length == size){
            changeSize();
        }
        arr[size++]=s;
    }
    public void changeSize(){
        int newSize = (arr.length*3)/2+1;
        arr = Arrays.copyOf(arr,newSize);

    }
    public void remove(int index){
        int posution = 0;
        String[]tmp = new String[arr.length-1];
        if(index < arr.length && index>=0){
            for (int i = 0; i < arr.length; i++) {
                if(index!=i){
                    tmp[posution]=arr[i];
                    posution++;
                }
            }
            this.arr = tmp;
        }else {
            throw new ArrayIndexOutOfBoundsException("Error");
        }
        System.out.println(Arrays.toString(arr));

    }

    @Override
    public String toString() {
        return "ArrayList{" +
                  Arrays.toString(arr) +
                '}';
    }
}
