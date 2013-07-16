package edu.grinnell.CSC207.F2013.projects;

import edu.grinnell.CSC207.F2013.activities.Projects;
import edu.grinnell.CSC207.F2013.projects.R;
import edu.grinnell.CSC207.F2013.projects.R.layout;
import edu.grinnell.CSC207.F2013.projects.R.menu;
import edu.grinnell.CSC207.F2013.ushahidi.API;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class UshahidiIncident extends Activity {

	TextView incident;
	API greatLakes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ushahidi_incident);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		incident = (TextView) findViewById(R.id.textView1);
		incident.setVisibility(TextView.GONE);
		
		incident.setMovementMethod(new ScrollingMovementMethod());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ushahidi_incident, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, Projects.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)

	public void displayIncident (View v) {
		
		try {

			greatLakes = new API("http://www.greatlakescommonsmap.org/");
			incident.setText(greatLakes.nextIncident().toString());
			incident.setVisibility(TextView.VISIBLE);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Log.e("MYAPP", "exception", e);
		}
	}
}
