package puzzle.child.gams;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMain extends Fragment {


    private SlidePuzzleView view;
    SlidePuzzle  slidePuzzle ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        slidePuzzle = new SlidePuzzle();
        view = new SlidePuzzleView(getContext(), slidePuzzle);
        View rooteView= view;
        return rooteView;
    }

}
