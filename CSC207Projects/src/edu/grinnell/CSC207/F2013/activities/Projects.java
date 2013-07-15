package edu.grinnell.CSC207.F2013.activities;

import edu.grinnell.CSC207.F2013.projects.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Projects extends Activity {
	
	ListView projectList;
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projects);
		
		listProjects();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.projects, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) 
	{
		Intent upIntent = new Intent(this, MainActivity.class);
		startActivity(upIntent);
		return true;
	} // onOptionsItemSelected (MenuItem)
	
	public void listProjects () 
	{
		String[] projects = {"Project 1", "Project 2", "Project 3"};
		projectList = (ListView) findViewById(R.id.listView1);
		
		adapter = new ArrayAdapter<String>(this, R.layout.simple_row);
		adapter.addAll(projects);
		projectList.setAdapter(adapter);
		
		// Create Intents to link to a specific project
		final Intent meow = new Intent(this, MeowingKitty.class);
		
		projectList.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position, long ID) {
				
				// 
				switch(position) {
					case 0:
						startActivity(meow);
						break;
					case 1:
					//	call intents according to the list row's ID number
						break;
					default:
						break;
				}
			}
		});
		
	} // listProjects ()

}
