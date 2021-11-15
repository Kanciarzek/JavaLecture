package pl.edu.wsb_nlu.java.lecture6.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5); list.add(100); list.add(66);
        list.remove(1);
        for (Integer i: list){
            System.out.println(i);
        }

    }
}
