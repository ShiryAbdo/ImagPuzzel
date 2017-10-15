package puzzle.child.gams.user;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import puzzle.child.gams.R;
import puzzle.child.gams.test.MenuActivity;
import puzzle.child.gams.ui.MainCircleActivity;

public class SplachScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplachScreen.this,  MainCircleActivity.class);
                startActivity(i);

                // close this activity
                finish();

            }
        });


        new Handler().postDelayed(new Runnable() {

			/*
             * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplachScreen.this,  MainCircleActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
