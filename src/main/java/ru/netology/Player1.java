package ru.netology;

public class Player1 {
    protected int id;
    protected String name;
    protected int strength;

    public Player1(int id, String name, int strength){
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }

}
