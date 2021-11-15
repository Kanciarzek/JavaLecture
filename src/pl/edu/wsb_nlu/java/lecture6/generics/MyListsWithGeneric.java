package pl.edu.wsb_nlu.java.lecture6.generics;

public class MyListsWithGeneric {

    static class MyListGeneric<T>{
        int beg = 0;
        int end = 0;
        T[] array;
        MyListGeneric(int maxLength){
            array = (T[]) new Object[maxLength];
//            We cannot use "new T[]"; T is not known at compilation time
        }
        void add(T e){
            array[end] = e;
            end++;
        }
        T getLast(){
            return array[end-1];
        }
        T getFirst(){
            return array[beg];
        }
        void removeFromBeginning(){
            beg++;
        }
        T get(int i){
            return array[i + beg];
        }
        void print(){
            for (int i = beg; i < end; i++)
                System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
//        MyListGeneric<int> myList = new MyListGeneric<int>(100);
//        Type argument cannot be primitive type
        MyListGeneric<Integer> myList = new MyListGeneric<>(100);
        myList.add(5);
        myList.add(6);
        myList.add(100);
        myList.removeFromBeginning();
        myList.print();
        MyListGeneric<String> myStringList = new MyListGeneric<>(100);
        myStringList.add("Test");
        myStringList.add("Test2");
        myStringList.print();

    }

}
