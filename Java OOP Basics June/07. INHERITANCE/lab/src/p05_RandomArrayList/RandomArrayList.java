package p05_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

class RandomArrayList extends ArrayList {

    private Random rnd = new Random();

    public Object getRandomElement(){
        int index = rnd.nextInt(this.size());
        return super.remove(index);
    }
}
