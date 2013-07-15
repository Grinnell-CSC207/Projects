package edu.grinnell.CSC207.F2013.activities;

import edu.grinnell.CSC207.F2013.projects.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void toProjects (View v) 
	{
		Intent projects = new Intent(this, Projects.class);
		startActivity(projects);
	}  // toProjects (View)
	
	public void toAbout (View v) 
	{
		Intent about = new Intent(this, AboutMe.class);
		startActivity(about);
	} // toInfo (View)

}
