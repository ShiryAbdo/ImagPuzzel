package puzzle.child.gams.gameMomery;

import java.util.ArrayList;
import java.util.Random;

import puzzle.child.gams.R;

/**
 * Created by falcon on 12/10/2017.
 */

public class HardData {
//    image size 1800*1000

    ArrayList<Integer> numberArray =new ArrayList<>();



    int [] arraImagRtage ={R.drawable.hard_one,R.drawable.hard_two,R.drawable.hard_three,R.drawable.hard_foure};


    int range = arraImagRtage.length;
    int myImgCount = 0;


    Random random = new Random();


    public  ArrayList<Integer> getHardData() {

        for( int i = 0; i < range; ++i)
        {
            myImgCount = random.nextInt(range);
            if(!numberArray.contains(arraImagRtage[myImgCount])){
                numberArray.add(arraImagRtage[myImgCount]);
            }
        }

        return numberArray;
    }
}
