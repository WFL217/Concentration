package com.example.jason.ftp;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;


public class Manager extends Activity
{
    private static int ROW_COUNT = -1;
	private static int COL_COUNT = -1;
	private Context context;
	private Drawable backImage;
	private int [] [] cards;
	private List<Drawable> images;
	private Card firstCard;
	private Card seconedCard;
	private Music backgroundMusic;
	
	private static Object lock = new Object();
	
	int turns;
	private TableLayout mainTable;

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        backgroundMusic = Music.get(this);

		setContentView(R.layout.main);

       ((Button)findViewById(R.id.Play)).setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(Manager.this, gameActivity.class);
			startActivity(i);
		}
	});
		((Button)findViewById(R.id.Menu)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Manager.this, HSActivity.class);
				startActivity(i);
			}


		});
    }

    @Override
	protected void onPause()
	{
		super.onPause();
	}
}