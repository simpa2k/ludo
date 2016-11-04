package die;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Robert on 2016-11-04.
 */
public class Die {

    Random rnd = new Random();
    int die;
//    boolean reThrow;

    public void throwDie() {
//        reThrow = false;
        if (die == 6) {
            die = rnd.nextInt(6) +1;
            System.out.println(die);
            throwDie();
        } else {
            die = rnd.nextInt(6) +1;
            System.out.println(die);
        }
    }
}

