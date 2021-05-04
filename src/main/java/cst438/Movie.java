package cst438;

import java.security.Timestamp;
import javax.persistence.Column;
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
	
	@Column(name="date")
	private Timestamp date;

	public Movie() {
		firstName = null;
		lastName = null;
		movieTitle = null;
		movieRating = 0;
	}
	
	public Movie(long id, String firstName, String lastName, String movieTitle, int movieRating, Timestamp date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
		
}
