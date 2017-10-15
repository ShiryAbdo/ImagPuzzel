package puzzle.child.gams.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.ArrayList;

import puzzle.child.gams.R;
import puzzle.child.gams.gamePuzzle.BaseActivity;
import puzzle.child.gams.gamePuzzle.ImageFromYourGalayActivity;
import puzzle.child.gams.gamePuzzle.YourImageActivity;
import puzzle.child.gams.test.MenuActivity;
import puzzle.child.gams.test.SlidePuzzleMain;
import puzzle.child.gams.user.UserAcount;


public class MainCircleActivity extends Activity {

	private CircleMenuLayout mCircleMenuLayout;
	private String[] mItemTexts = new String[] { "Easy", "Medium", "Hard","Difficult", "Capture", "Galary"};
    String easy ,medium ,hard ,difficult;
    TextDrawable Capture_your_puzzle  ,Easyy ,Medium ,Hard ,Difficult,Your_photo_puzzle,User_Acount;


	private ArrayList<TextDrawable> gg ;

	private int[] mItemImgs = new int[] {R.drawable.b,
			R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.e,
			R.drawable.f,R.drawable.g,R.drawable.h};

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main02);
		gg= new ArrayList<>();
        easy="Easy";
        medium="Medium";
        hard ="Hard";
        difficult ="Difficult";
		  Easyy = TextDrawable.builder()
				.beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Easy",Color.rgb(128, 204, 51), 30);

		  Medium = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Medium",Color.rgb(128, 204, 51), 30);
 		  Hard = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Hard", Color.rgb(128, 204, 51), 30);
          Difficult = TextDrawable.builder()
                .beginConfig()
                 .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Difficult", Color.rgb(128, 204, 51), 30);


         Capture_your_puzzle = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Capture", Color.rgb(128, 204, 51), 30);

          Your_photo_puzzle = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(20)
                .withBorder(5)
                .width(150)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Galary Photo",Color.rgb(128, 204, 51), 30);

          User_Acount = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(120)  // width in px
                .height(90) // height in px
                .endConfig()
                .buildRoundRect("Acount", Color.rgb(128, 204, 51), 30);


		gg.add(Easyy);
		gg.add(Medium);
        gg.add(Hard);
        gg.add(Difficult);
        gg.add(Capture_your_puzzle);
        gg.add(Your_photo_puzzle);

        TextDrawable image1 = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(this.getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(130)  // width in px
                .height(100) // height in px
                .endConfig()
                .buildRoundRect("Easy", Color.rgb(128, 204, 51), 30);


        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(gg, mItemTexts);
        // more or less with default parameter
        final ImageView fabIconNew = new ImageView(this);
        fabIconNew.setImageDrawable(getResources().getDrawable(R.drawable.refresh));
        final TextDrawable image2 = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(130)  // width in px
                .height(100) // height in px
                .endConfig()
                .buildRoundRect("Medium",Color.rgb(128, 204, 51), 30);
        final TextDrawable image3 = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(130)  // width in px
                .height(100) // height in px
                .endConfig()
                .buildRoundRect("Hard",Color.rgb(128, 204, 51), 30);
        final TextDrawable image4 = TextDrawable.builder()
                .beginConfig()
                .textColor(Color.BLACK)
                .useFont(Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/gothic_bold.otf"))
                .fontSize(25)
                .withBorder(5)
                .width(130)  // width in px
                .height(100) // height in px
                .endConfig()
                .buildRoundRect("Difficult",Color.rgb(128, 204, 51), 30);



        final SubActionButton.Builder rLSubBuilder = new SubActionButton.Builder(this);
        final ImageView rlIcon1 = new ImageView(this);
        final ImageView rlIcon2 = new ImageView(this);
        final ImageView rlIcon3 = new ImageView(this);
        final ImageView rlIcon4 = new ImageView(this);
         rlIcon1.setImageDrawable(image1);
         rlIcon2.setImageDrawable(image2);
        rlIcon3.setImageDrawable(image3);
        rlIcon4.setImageDrawable(image4);

		mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
		{

			@Override
			public void itemClick(final View view, final int pos)


			{

                Intent intent ;

                switch (pos) {
                    case 0:
                        intent = new Intent(MainCircleActivity.this,BaseActivity.class);
                        intent.putExtra("catogery",easy);
                        startActivity(intent);


                        break;
                    case 1:

                        intent = new Intent(MainCircleActivity.this,BaseActivity.class);
                        intent.putExtra("catogery",medium);
                        startActivity(intent);

                        break;
                    case 2:
                        intent = new Intent(MainCircleActivity.this,BaseActivity.class);
                        intent.putExtra("catogery",hard);
                        startActivity(intent);
                        break;
                    case 3:
                          intent = new Intent(MainCircleActivity.this,BaseActivity.class);
                        intent.putExtra("catogery",difficult);
                        startActivity(intent);
                        break;
                    case 4:
                        String status =mItemTexts[pos];

                        if(status=="Capture") {


//                            gg.get(pos)=Easy;
//                            view.setImageDrawable(Easy);

                        } else {


                        }
                         final FloatingActionMenu rightLowerMenu = new FloatingActionMenu.Builder(MainCircleActivity.this)
                                 .addSubActionView(rLSubBuilder.setContentView(rlIcon1).build(),120,120)
                                .addSubActionView(rLSubBuilder.setContentView(rlIcon2).build(),120,120)
                                .addSubActionView(rLSubBuilder.setContentView(rlIcon3).build(),120,120)
                                .addSubActionView(rLSubBuilder.setContentView(rlIcon4).build(),120,120)

                                 .attachTo(view)
                                .build();
                        rlIcon1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),YourImageActivity.class);
                                intent.putExtra("DEFAULT_SIZE",3);
                                startActivity(intent);


                            }
                        });
                        rlIcon2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),YourImageActivity.class);
                                intent.putExtra("DEFAULT_SIZE",4);
                                startActivity(intent);

                            }
                        });
                        rlIcon3.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),YourImageActivity.class);
                                intent.putExtra("DEFAULT_SIZE",5);
                                startActivity(intent);

                            }
                        });
                        rlIcon4.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),YourImageActivity.class);
                                intent.putExtra("DEFAULT_SIZE",7);
                                startActivity(intent);

                            }
                        });

 //                         // Listen menu open and close events to animate the button content view
                        rightLowerMenu.setStateChangeListener(new FloatingActionMenu.MenuStateChangeListener() {
                            @Override
                            public void onMenuOpened(FloatingActionMenu menu) {



                                // Rotate the icon of rightLowerButton 45 degrees clockwise
                                fabIconNew.setRotation(0);
                                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 45);
                                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                                animation.start();
                            }

                            @Override
                            public void onMenuClosed(FloatingActionMenu menu) {
                                gg.set(pos,Capture_your_puzzle);
                                // Rotate the icon of rightLowerButton 45 degrees counter-clockwise
                                fabIconNew.setRotation(45);
                                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 0);
                                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                                animation.start();
                            }
                        });



                        break;
                    case 5:
                          intent = new Intent(MainCircleActivity.this,ImageFromYourGalayActivity.class);
                        startActivity(intent);
                        break;


                    default: System.out.println("Invalid month.");break;
                }

			}

			@Override
			public void itemCenterClick(View view)
			{
				Toast.makeText(MainCircleActivity.this,"you can do something just like ccb  ",Toast.LENGTH_SHORT).show();
			}
		});




	}
}