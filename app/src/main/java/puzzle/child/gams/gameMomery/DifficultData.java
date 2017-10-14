package puzzle.child.gams.gameMomery;

import java.util.ArrayList;
import java.util.Random;

import puzzle.child.gams.R;

/**
 * Created by falcon on 12/10/2017.
 */

public class DifficultData {
    ArrayList<Integer> numberArray =new ArrayList<>();



    int [] arraImagRtage ={R.drawable.diifficult_one,R.drawable.diifficult_one,R.drawable.diifficult_one,R.drawable.diifficult_one};


    int range = arraImagRtage.length;
    int myImgCount = 0;


    Random random = new Random();


    public  ArrayList<Integer> getDifficultData() {

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
