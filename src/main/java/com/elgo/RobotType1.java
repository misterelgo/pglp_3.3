package com.elgo;

public class RobotType1 extends Robot {

    public RobotType1(int position) {
        super(position);
    }
    public void avancer(){
        super.position+=20;
    }
}
