package edu.grinnell.CSC207.F2013.project_files;

public interface Predicate<T> {
	public boolean apply(T val);
	public boolean equals(Object o);
}
