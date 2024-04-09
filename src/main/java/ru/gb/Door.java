package ru.gb;

public class Door {
    private boolean door = false;

    public Door(){

    }
    public Door(boolean flag){
        this.door = flag;
    }

    @Override
    public String toString() {
        return door+"\n";
    }
}
