package puzzle.child.gams;

import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import puzzle.child.gams.gameMomery.DifficultData;
import puzzle.child.gams.gameMomery.EasyData;
import puzzle.child.gams.gameMomery.HardData;
import puzzle.child.gams.gameMomery.MediumData;

public class BaseActivity extends AppCompatActivity {
    Bundle bundle;
    String catogery ;
    Button showImage  ;
    ImageView next ,refresh;

    int imageSourse ;
    EasyData easyData ;
    MediumData mediumData;
    HardData hardData ;
    DifficultData difficultData ;
    ArrayList<Integer> images ;
    String NN;
    final Context context = this;
    Toolbar toolbar ;
    Random random;
    int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        setSupportActionBar(toolbar);
        random = new Random();
        bundle=getIntent().getExtras();
        showImage=(Button)findViewById(R.id.showImage);


        if(bundle!=null) {
            catogery= bundle.getString("catogery");

        }
         toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        toolbar.setTitle(catogery);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        toolbar.setTitle("shimaa");
        toolbar.setLogo(R.drawable.llogo);
//        toolbar.setLogoDescription(getResources().getString(R.string.logo_desc));



        images = new ArrayList<>();
        easyData= new EasyData();
        mediumData= new MediumData();
        hardData=new HardData();
        difficultData= new DifficultData();
        next= (ImageView)findViewById(R.id.next);
        refresh=(ImageView)findViewById(R.id.refresh);

        if(catogery.equals("Easy")){
            toolbar.setTitle(catogery);
            images=easyData.getEasyDataArray();
            imageSourse=images.get(count);
        }if(catogery.equals("Medium")){
            toolbar.setTitle(catogery);
            images=mediumData.getMediumData();
            imageSourse=images.get(count);
        }if(catogery.equals("Hard")){
            toolbar.setTitle(catogery);
            images=hardData.getHardData();
            imageSourse=images.get(count);
        }if(catogery.equals("Difficult")) {
            toolbar.setTitle(catogery);
            images =difficultData.getDifficultData();
            imageSourse = images.get(count);
        }


        MainPuzzle newFragment = new MainPuzzle();
        Bundle args = new Bundle();
        args.putString("catogery", catogery);
        args.putInt("image",imageSourse);
        newFragment.setArguments(args);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back

        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();


        showImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // custom dialog
                final Dialog dialog = new Dialog(context, R.style.custom_dialog_theme);
                dialog.setContentView(R.layout.custom);



                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(imageSourse);

                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imageSourse==images.size()){


                }else{}
                MainPuzzle newFragment = new MainPuzzle();
                Bundle args = new Bundle();
                args.putString("catogery", catogery);
                if(count==images.size()){
                    // custom dialog
                    final Dialog dialog = new Dialog(context, R.style.custom_dialog_theme);
                    dialog.setContentView(R.layout.dialog_layout);
                    TextView text =(TextView)dialog.findViewById(R.id.text);
                    text.setText("Congratulations you finish"+" "+catogery+" "+"Level");



                    Button dialogButton = (Button) dialog.findViewById(R.id.backtoMenu);
                    // if button is clicked, close the custom dialog
                    dialogButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                            startActivity(intent);
                        }
                    });

                    dialog.show();
                }else{
                    int next = count++;
                    imageSourse=images.get(next);
                    args.putInt("image",images.get(next));
                }




                newFragment.setArguments(args);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back

                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }


        });


    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
//        if(id == R.id.action_refresh){
//         }
//        if(id == R.id.next){
//            if(imageSourse==images.size()){
//
//
//            }else{}
//            MainPuzzle newFragment = new MainPuzzle();
//            Bundle args = new Bundle();
//            args.putString("catogery", catogery);
//            if(count==images.size()){
//                // custom dialog
//                final Dialog dialog = new Dialog(context, R.style.custom_dialog_theme);
//                dialog.setContentView(R.layout.dialog_layout);
//                TextView text =(TextView)dialog.findViewById(R.id.text);
//                text.setText("Congratulations you finish"+" "+catogery+" "+"Level");
//
//
//
//                Button dialogButton = (Button) dialog.findViewById(R.id.backtoMenu);
//                // if button is clicked, close the custom dialog
//                dialogButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
//                        startActivity(intent);
//                    }
//                });
//
//                dialog.show();
//            }else{
//                args.putInt("image",images.get(count++));
//             }
//
//
//
//
//            newFragment.setArguments(args);
//            FragmentTransaction transaction = getFragmentManager().beginTransaction();
//
//            // Replace whatever is in the fragment_container view with this fragment,
//            // and add the transaction to the back stack so the user can navigate back
//
//            transaction.replace(R.id.fragment_container, newFragment);
//            transaction.addToBackStack(null);
//
//            // Commit the transaction
//            transaction.commit();
//
//         }
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BaseActivity.this,   MenuActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
