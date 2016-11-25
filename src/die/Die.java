package die;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Robert on 2016-11-04.
 */
public class Die {

    Random rnd = new Random();
    int die;

    public void throwDie() {

        if (die == 6) {
            die = rnd.nextInt(6) +1;
            System.out.println(die);
            throwDie();
        } else {
            die = rnd.nextInt(6) +1;
            System.out.println(die);
        }
    }

    public int getDie() {
        return die;
    }
}

