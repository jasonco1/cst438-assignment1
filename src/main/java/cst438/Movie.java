package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private long id; 
	
	@NotNull
	@Size(min=3, max=25)
	private String firstName;
	
	@NotNull
	@Size(min=3, max=25)
	private String lastName;
	
	@NotNull
	@Size(min=3, max=25)
	private String movieTitle;
	
	@NotNull
	private int movieRating;
	
	 @NotNull 
	 private String date;
	 
	public Movie() {
		firstName = null;
		lastName = null;
		movieTitle = null;
		movieRating = 0;	
		date = new java.util.Date().toString();
	}
	
	public Movie(long id, String firstName, String lastName, String movieTitle, int movieRating, String date ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.date = new java.util.Date().toString();
		
	}

	public long getId() {return id;}
	public void setId(long id) {this.id = id;}

	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}

	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}

	public String getMovieTitle() {return movieTitle;}
	public void setMovieTitle(String movieTitle) {this.movieTitle = movieTitle;}

	public int getMovieRating() {return movieRating;}
	public void setMovieRating(int movieRating) {this.movieRating = movieRating;}
	
	public String getDate() {return date;} 
	public void setDate(String date){this.date = date;}
	 
		
}
