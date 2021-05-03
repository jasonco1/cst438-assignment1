package cst438;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	//remember to add JPA query here and create iterable list function.
}
