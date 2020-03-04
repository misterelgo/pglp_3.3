package com.elgo;

public abstract class Robot {
    protected int position;
    public Robot(int position){
        this.position = position;
    }
    public void avancer(){
        this.position+=10;
    }
}
