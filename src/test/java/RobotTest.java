import com.elgo.Robot;
import com.elgo.RobotType1;
import com.elgo.RobotType2;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RobotTest {

    @Test
    public void avancer() {
        ArrayList<Robot> Robots = new ArrayList<Robot>();
        Robots.add(new RobotType1(20));
        Robots.add(new RobotType2(20));
        for (int i = 0; i < Robots.size(); i++){
            Robots.get(i).avancer();
        }
        for (int i = 0; i < Robots.size(); i++){
            System.out.println("Position du Robot de Type : "+ (i+1)+ " : "+ Robots.get(i).position);
        }
    }
}