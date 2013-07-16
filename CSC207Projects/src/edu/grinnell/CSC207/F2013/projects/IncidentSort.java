package edu.grinnell.CSC207.F2013.projects;

import edu.grinnell.CSC207.F2013.activities.Projects;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class IncidentSort extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_incident_sort);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.incident_sort, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, Projects.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)

}
