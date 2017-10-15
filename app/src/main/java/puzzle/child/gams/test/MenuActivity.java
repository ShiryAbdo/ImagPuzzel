package puzzle.child.gams.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nightonke.boommenu.BoomMenuButton;

import android.util.Pair;

import java.util.ArrayList;

import puzzle.child.gams.R;
import puzzle.child.gams.gamePuzzle.BaseActivity;
import puzzle.child.gams.gamePuzzle.ImageFromYourGalayActivity;
import puzzle.child.gams.gamePuzzle.YourImageActivity;
import puzzle.child.gams.user.UserAcount;


public class MenuActivity extends AppCompatActivity  {


    Button Easy ,Medium ,Hard ,Difficult ,yourImage ,CaptureYourImage ,userAcount;
    String easy ,medium ,hard ,difficult;
    BoomMenuButton bmb;
    private ArrayList<Pair> piecesAndButtons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         setContentView(R.layout.new_layout);




        Easy= (Button)findViewById(R.id.Easy);
        Medium= (Button)findViewById(R.id.Medium);
        Hard= (Button)findViewById(R.id.Hard);
        Difficult= (Button)findViewById(R.id.Difficult);
        yourImage=(Button)findViewById(R.id.yourImage);
        userAcount=(Button)findViewById(R.id.userAcount);
        CaptureYourImage=(Button)findViewById(R.id.CaptureYourImage);
        easy="Easy";
        medium="Medium";
        hard ="Hard";
        difficult ="Difficult";

        userAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,UserAcount.class);
                 startActivity(intent);

            }
        });
        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
                intent.putExtra("catogery",easy);
                startActivity(intent);
            }
        });

        Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
                intent.putExtra("catogery",medium);
                startActivity(intent);
            }
        });
        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
                intent.putExtra("catogery",hard);
                startActivity(intent);
            }
        });

        Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,BaseActivity.class);
                intent.putExtra("catogery",difficult);
                startActivity(intent);

            }
        });
        yourImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,YourImageActivity.class);
                startActivity(intent);

            }
        });
        CaptureYourImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ImageFromYourGalayActivity.class);
                startActivity(intent);

            }
        });

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
