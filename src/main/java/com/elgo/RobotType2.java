package com.elgo;

public class RobotType2 extends Robot {

    public RobotType2(int position) {
        super(position);
    }
    public void avancer(){
        super.position+=10;
    }
}
