package edu.grinnell.CSC207.F2013.projects;

import java.util.ArrayList;

import edu.grinnell.CSC207.F2013.activities.Projects;
import edu.grinnell.CSC207.F2013.projects.R;
import edu.grinnell.CSC207.F2013.projects.R.layout;
import edu.grinnell.CSC207.F2013.projects.R.menu;
import edu.grinnell.CSC207.F2013.ushahidi.API;
import edu.grinnell.CSC207.F2013.ushahidi.Incident;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllIncidentsArray extends Activity {

	ListView listIncidents;
	ArrayAdapter<Incident> adapter;
	ArrayList<Incident> allIncidents;
	int dataSize = 0;
	API greatLakes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_incidents_array);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		listIncidents = (ListView) findViewById(R.id.listView1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.all_incidents_array, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, Projects.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
	public void listAll (View v) {		
		
		try {

			greatLakes = new API("http://www.greatlakescommonsmap.org/");
			dataSize = greatLakes.getIncidentsList().size();
			allIncidents = greatLakes.getIncidentsList();
			adapter = new ArrayAdapter<Incident>(this, R.layout.simple_row, allIncidents);
			listIncidents.setAdapter(adapter);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Log.e("MYAPP", "exception", e);
		}	
		
	}

}
