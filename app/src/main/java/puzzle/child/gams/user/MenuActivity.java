package puzzle.child.gams.user;

import android.content.Intent;
import android.graphics.Color;
 import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

 import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

import puzzle.child.gams.R;
import puzzle.child.gams.gamePuzzle.BaseActivity;
import puzzle.child.gams.gamePuzzle.ImageFromYourGalayActivity;
import puzzle.child.gams.gamePuzzle.YourImageActivity;
import puzzle.child.gams.test.customView;
import puzzle.child.gams.utilitis.BuilderManager;

public class MenuActivity extends AppCompatActivity {

    Button Easy ,Medium ,Hard ,Difficult ,yourImage ,CaptureYourImage ,userAcount;
    String easy ,medium ,hard ,difficult;
    private BoomMenuButton bmb;
    private ArrayList<Pair> piecesAndButtons = new ArrayList<>();
    customView customView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.new_layout);

//        bmb = (BoomMenuButton) findViewById(R.id.bmb);
//        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
//            HamButton.Builder builder = new HamButton.Builder()
//                    .normalImageRes(R.drawable.butterfly)
//                    .normalImageRes(BuilderManager.imageResources[i])
//                    .normalTextRes(BuilderManager.textResorce[i]);
//            bmb.addBuilder(builder);
//        }



//        Easy= (Button)findViewById(R.id.Easy);
//        Medium= (Button)findViewById(R.id.Medium);
//        Hard= (Button)findViewById(R.id.Hard);
//        Difficult= (Button)findViewById(R.id.Difficult);
//        yourImage=(Button)findViewById(R.id.yourImage);
//        userAcount=(Button)findViewById(R.id.userAcount);
//        CaptureYourImage=(Button)findViewById(R.id.CaptureYourImage);
//        easy="Easy";
//        medium="Medium";
//        hard ="Hard";
//        difficult ="Difficult";
//
//        userAcount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,UserAcount.class);
//                 startActivity(intent);
//
//            }
//        });
//        Easy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
//                intent.putExtra("catogery",easy);
//                startActivity(intent);
//            }
//        });
//
//        Medium.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
//                intent.putExtra("catogery",medium);
//                startActivity(intent);
//            }
//        });
//        Hard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
//                intent.putExtra("catogery",hard);
//                startActivity(intent);
//            }
//        });
//
//        Difficult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
//                intent.putExtra("catogery",difficult);
//                startActivity(intent);
//
//            }
//        });
//        yourImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,YourImageActivity.class);
//                startActivity(intent);
//
//            }
//        });
//        CaptureYourImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MenuActivity.this,ImageFromYourGalayActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        CircleMenu  circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
//
//        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.menu, R.mipmap.cancel)
//                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.home)
//                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.search)
//                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.setting)
//                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.nn)
//                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.gps)
//                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
//
//                    @Override
//                    public void onMenuSelected(int index) {}
//
//                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
//
//            @Override
//            public void onMenuOpened() {}
//
//            @Override
//            public void onMenuClosed() {}
//
//        });
    }
}
