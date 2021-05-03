package cst438;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Rating { // localhost:8080/movies/new
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("/movies")
	public String hello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("time", new java.util.Date().toString());
		return "index";
	}
	
	@GetMapping("/movies/new")
	public String createPerson(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "movie_form";				
	}
	
	@PostMapping("/movie")
	public String processMovieForm(@Valid Movie movie, 
			BindingResult result, 
			Model model) {
		if (result.hasErrors()) {
			return "movie_form";
		}
		/* model.addAttribute("date", new java.util.Date().toString()); */
		movieRepository.save(movie);
		Iterable<Movie> movies = movieRepository.findAll(); 
		model.addAttribute("movies", movies);
		return "movie_list";
	}
	
	@GetMapping("/movie")
	public String getAllPeople( Model model) {
		Iterable<Movie> movies = movieRepository.findAll();
		model.addAttribute("movies", movies);
		return "movie_list";	
	}
}
