package edu.grinnell.CSC207.F2013.projects;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.CSC207.F2013.ushahidi.API;
import edu.grinnell.CSC207.F2013.activities.Projects;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class SelectIncidentsArray extends Activity {

	EditText searchBar;
	int searchTerm;
	Button findButton;
	ListView incidentList;
	ArrayAdapter<Incident> adapter;
	List<Incident> incidents = new ArrayList<Incident>();
	API greatLakes;
	int dataSize;
	int addCounter = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_incidents_array);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		searchBar = (EditText) findViewById(R.id.editText1);
		findButton = (Button) findViewById(R.id.button1);
		incidentList = (ListView) findViewById(R.id.listView1);
		
		adapter = new ArrayAdapter<Incident>(this, R.layout.simple_row, incidents);
		
		incidentList.setAdapter(adapter);
		
		try {
			getIncidents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_incidents_array, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, Projects.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
	public void find (View v) throws Exception {

		int id;
		searchTerm = Integer.parseInt(searchBar.getText().toString());
		
		for (int i = 0; i < dataSize; i++) {
			Incident pointer = greatLakes.nextIncident();
			id = pointer.getIncidentId();
			if (id == searchTerm) {
				incidents.add(pointer);
				adapter.notifyDataSetChanged();
			}
		}
	} // find (View)
	
	public void getIncidents () throws Exception {

		try {

			greatLakes = new API("http://www.greatlakescommonsmap.org/");
			dataSize = greatLakes.getIncidentsList().size();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Log.e("MYAPP", "exception", e);
		}
		
	}

}
