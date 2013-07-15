package edu.grinnell.CSC207.F2013.activities;

import edu.grinnell.CSC207.F2013.projects.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutMe extends Activity {

	ListView infoList;
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_me);
		
		listInfo();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_me, menu);
		return true;
	
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, MainActivity.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
	public void listInfo () 
	{
		String[] info = {"Name:\n Your Name",
				"Username:\n Your Username",
				"Major:\n Your Major",
				"Age:\n Your Age",
				"Residence:\n Your Dorm",
				"Home Town:\n Your Home Town",
				"Favourite Food:\n Your Favourite Food",
				"Personal Blurb:\n Your Personal Blurb." +
				"Write anything you want here. It can " +
				"be as long as you want."};
		infoList = (ListView) findViewById(R.id.listView1);
		
		adapter = new ArrayAdapter<String>(this, R.layout.simple_row);
		adapter.addAll(info);
		infoList.setAdapter(adapter);
		
	} // listInfo ()

}
