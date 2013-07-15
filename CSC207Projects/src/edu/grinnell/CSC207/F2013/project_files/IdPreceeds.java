package edu.grinnell.CSC207.F2013.project_files;

import edu.grinnell.CSC207.F2013.ushahidi.Incident;

public class IdPreceeds implements Predicate<Incident>{

	int id;
	
	public IdPreceeds (int id)
	{
		this.id = id;
	} // IdPrecedes (int)
	
	@Override
	public boolean apply (Incident val) {
		return val.getIncidentId() < this.id;
	} // apply (Incident)
}
