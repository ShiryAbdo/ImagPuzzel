package puzzle.child.gams.gameMomery;

import java.util.ArrayList;
import java.util.Random;

import puzzle.child.gams.R;

/**
 * Created by falcon on 12/10/2017.
 */

public class MediumData {
//    image size 1500 *1000


    ArrayList<Integer> numberArray =new ArrayList<>();



    int [] arraImagRtage ={R.drawable.one_medium,R.drawable.two_medium,R.drawable.three_medium,R.drawable.foure_medium};


    int range = arraImagRtage.length;
    int myImgCount = 0;


    Random random = new Random();


    public  ArrayList<Integer> getMediumData() {

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
