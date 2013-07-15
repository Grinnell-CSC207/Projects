package edu.grinnell.CSC207.F2013.activities;

import edu.grinnell.CSC207.F2013.projects.R;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MeowingKitty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meowing_kitty);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.meowing_kitty, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, MainActivity.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
	public void meow (View v) {
		MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.catmeow);
		mp.start();
	} // meow (View) 

}
