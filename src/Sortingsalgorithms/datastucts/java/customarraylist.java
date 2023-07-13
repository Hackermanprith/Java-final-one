package Sortingsalgorithms.datastucts.java;

public class customarraylist <T> {
    private int arr[];
    private int size;
    private int defaultsize = 10;
    public customarraylist(){
        arr = new int[defaultsize];
        size = 0;
    }
    public void add(int num, int index){
        if(size == arr.length){
            resize();
        }
        arr[size] = num;
        size++;
    }

    private void resize() {
        int temp[] = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;

    }

}
