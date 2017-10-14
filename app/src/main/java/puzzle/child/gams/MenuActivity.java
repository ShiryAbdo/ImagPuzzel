package puzzle.child.gams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button Easy ,Medium ,Hard ,Difficult ,yourImage ,CaptureYourImage;
    String easy ,medium ,hard ,difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Easy= (Button)findViewById(R.id.Easy);
        Medium= (Button)findViewById(R.id.Medium);
        Hard= (Button)findViewById(R.id.Hard);
        Difficult= (Button)findViewById(R.id.Difficult);
        yourImage=(Button)findViewById(R.id.yourImage);
        CaptureYourImage=(Button)findViewById(R.id.CaptureYourImage);
        easy="Easy";
        medium="Medium";
        hard ="Hard";
        difficult ="Difficult";
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
    }
}
