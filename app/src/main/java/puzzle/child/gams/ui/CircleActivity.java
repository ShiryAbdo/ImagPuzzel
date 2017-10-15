package puzzle.child.gams.ui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;

import java.util.ArrayList;

import puzzle.child.gams.R;


public class CircleActivity extends Activity
{
	private CircleMenuLayout mCircleMenuLayout;
	private String[] mItemTexts = new String[] {};
	private int[] mItemImgs = new int[] { R.drawable.a,
			R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.e,
			R.drawable.f };
	private ArrayList<TextDrawable> gg ;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gg= new ArrayList<>();
		TextDrawable drawable = TextDrawable.builder()
				.beginConfig()
				.textColor(Color.BLACK)
				.useFont(Typeface.DEFAULT)
				.fontSize(30) /* size in px */
				.bold()
				.toUpperCase()
				.endConfig()
				.buildRect("a", Color.RED);

		TextDrawable drawable1 = TextDrawable.builder()
				.beginConfig()
				.textColor(Color.BLACK)
				.useFont(Typeface.DEFAULT)
				.fontSize(30) /* size in px */
				.bold()
				.toUpperCase()
				.endConfig()
				.buildRect("b", Color.RED);
		TextDrawable drawable2 = TextDrawable.builder()
				.beginConfig()
				.textColor(Color.BLACK)
				.useFont(Typeface.DEFAULT)
				.fontSize(30) /* size in px */
				.bold()
				.toUpperCase()
				.endConfig()
				.buildRect("c", Color.RED);
		gg.add(drawable);
		gg.add(drawable1);
		gg.add(drawable2);
		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(gg, mItemTexts);

		mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
		{
			@Override
			public void itemClick(View view, int pos)
			{
				Toast.makeText(CircleActivity.this, "this"+mItemTexts[pos],Toast.LENGTH_SHORT).show();
			}
			@Override
			public void itemCenterClick(View view)
			{
				Toast.makeText(CircleActivity.this,"you can do something just like ccb  ",Toast.LENGTH_SHORT).show();
			}
		});
	}
}