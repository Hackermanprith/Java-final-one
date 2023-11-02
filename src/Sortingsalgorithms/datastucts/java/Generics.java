package Sortingsalgorithms.datastucts.java;

public class Generics <T> {
    T value;
    String name;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    Generics(T value, String name){
        this.value = value;
        this.name = name;
    }


}
