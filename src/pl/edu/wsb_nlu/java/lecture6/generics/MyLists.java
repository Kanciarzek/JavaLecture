package pl.edu.wsb_nlu.java.lecture6.generics;

public class MyLists {

    static class MyList{
        int beg = 0;
        int end = 0;
        int[] array;
        MyList(int maxLength){
            array = new int[maxLength];
        }
        void add(int e){
            array[end] = e;
            end++;
        }
        int getLast(){
            return array[end-1];
        }
        int getFirst(){
            return array[beg];
        }
        void removeFromBeginning(){
            beg++;
        }
        int get(int i){
            return array[i + beg];
        }
        void print(){
            for (int i = beg; i < end; i++)
                System.out.println(array[i]);
        }
    }


    static class MyStringList{
        int beg = 0;
        int end = 0;
        String[] array;
        MyStringList(int maxLength){
            array = new String[maxLength];
        }
        void add(String e){
            array[end] = e;
            end++;
        }
        String getLast(){
            return array[end-1];
        }
        String getFirst(){
            return array[beg];
        }
        void removeFromBeginning(){
            beg++;
        }
        String get(int i){
            return array[i + beg];
        }
        void print(){
            for (int i = beg; i < end; i++)
                System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList(100);
        myList.add(5);
        myList.add(6);
        myList.add(100);
        myList.removeFromBeginning();
        myList.print();
        MyStringList myStringList = new MyStringList(100);
        myStringList.add("Test");
        myStringList.add("Test2");
        myStringList.print();
    }

}
