package TemaSesiunea13;

public class Box <T>{

    private T value;

    public void setValue(T newValue){
        this.value = newValue;
    }
    public T getValue(){
        return value;
    }
}
