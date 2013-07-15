package edu.grinnell.CSC207.F2013.project_files;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import edu.grinnell.CSC207.F2013.ushahidi.Incident;

public class UshahidiAdapter {
	Random generator = new Random();
	
	public UshahidiAdapter(String server)
		throws Exception
	{
		// STUB
	} // UshahidiAdapter(String)
	
	public Iterator<Incident> getIncidents()
	{
		// STUB
		Incident[] incidents = new Incident[3];
		incidents[0] = new Incident(1, "one");
		incidents[1] = new Incident(generator.nextInt(), "five");
		incidents[2] = new Incident(generator.nextInt(), "one");
		return Arrays.asList(incidents).iterator();
	} // getIncidents()
	
	public void drop(int id) throws Exception
	{

		// STUB
	} // drop(int)
	
//	public void filterOut(Predicate<Incident> pred)
//	{ 
//		// STUB
//	} // filterOut
	
	public Incident find(String title) 
	{	
		return null;
		// STUB
	} // find
	
	public void sort() 
	{
		// STUB
	} // sort
	
} // class UshahidiAdapter
