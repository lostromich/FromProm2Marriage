package com.example.fromprom2marriage;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	// Declare gloabl media player
	MediaPlayer CurrMediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CurrMediaPlayer = MediaPlayer.create(this, R.raw.waltz_of_old_times);
		// CurrMediaPlayer.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		CurrMediaPlayer = MediaPlayer.create(this, R.raw.waltz_of_old_times);
		CurrMediaPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		CurrMediaPlayer.stop();
		CurrMediaPlayer.release();
		super.onPause();
	}

}
