package schedular.com.project;
	
	//A Java program to demonstrate Comparator interface
	import java.io.*;
	import java.util.*;

	// A class 'Movies' that implements Comparable
	class Movies implements Comparable<Movies>
	{
		private double rating;
		private String name;
		private int year;

		// Used to sort Moviess by year
		public int compareTo(Movies m)
		{
			return this.year - m.year;
		}

		// Constructor
		public Movies(String nm, double rt, int yr)
		{
			this.name = nm;
			this.rating = rt;
			this.year = yr;
		}

		// Getter methods for accessing private data
		public double getRating() { return rating; }
		public String getName() { return name; }
		public int getYear()	 { return year; }
	}

	// Class to compare Moviess by ratings
	class RatingCompare implements Comparator<Movies>
	{
		public int compare(Movies m1, Movies m2)
		{
			if (m1.getRating() < m2.getRating()) return -1;
			if (m1.getRating() > m2.getRating()) return 1;
			else return 0;
		}
	}

	// Class to compare Moviess by name
	class NameCompare implements Comparator<Movies>
	{
		public int compare(Movies m1, Movies m2)
		{
			return m1.getName().compareTo(m2.getName());
		}
	}

	// Driver class
	class ComparatorExample
	{
		public static void main(String[] args)
		{
			ArrayList<Movies> list = new ArrayList<Movies>();
			list.add(new Movies("Force Awakens", 8.3, 2015));
			list.add(new Movies("Star Wars", 8.7, 1977));
			list.add(new Movies("Empire Strikes Back", 8.8, 1980));
			list.add(new Movies("Return of the Jedi", 8.4, 1983));

			// Sort by rating : (1) Create an object of ratingCompare
			//				 (2) Call Collections.sort
			//				 (3) Print Sorted list
			System.out.println("Sorted by rating");
			RatingCompare ratingCompare = new RatingCompare();
			Collections.sort(list, ratingCompare);
			for (Movies Movies: list)
				System.out.println(Movies.getRating() + " " +
								Movies.getName() + " " +
								Movies.getYear());


			// Call overloaded sort method with RatingCompare
			// (Same three steps as above)
			System.out.println("\nSorted by name");
			NameCompare nameCompare = new NameCompare();
			Collections.sort(list, nameCompare);
			for (Movies Movies: list)
				System.out.println(Movies.getName() + " " +
								Movies.getRating() + " " +
								Movies.getYear());

			// Uses Comparable to sort by year
			System.out.println("\nSorted by year");
			Collections.sort(list);
			for (Movies Movies: list)
				System.out.println(Movies.getYear() + " " +
								Movies.getRating() + " " +
								Movies.getName()+" ");
		}
	}



