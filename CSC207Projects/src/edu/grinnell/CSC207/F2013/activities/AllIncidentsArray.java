package edu.grinnell.CSC207.F2013.activities;

import edu.grinnell.CSC207.F2013.projects.R;
import edu.grinnell.CSC207.F2013.projects.R.layout;
import edu.grinnell.CSC207.F2013.projects.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AllIncidentsArray extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_incidents);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.all_incidents, menu);
		return true;
	}

}
