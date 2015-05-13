package org.lab.restController;

import java.util.Collection;

import org.lab.model.Movie;
import org.lab.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
class MovieRestController {

	@Autowired
	MovieRepository movieRepository;

	@RequestMapping(method = RequestMethod.GET)
	Collection<Movie> listAllMovies() {
		return this.movieRepository.findAll();
	}

	@RequestMapping(value = "{movieId}", method = RequestMethod.GET)
	Movie getMovie(@PathVariable(value = "movieId") Long id) {
		return movieRepository.findOne(id);
	}

	@RequestMapping(value = "/find/{movieTitle}", method = RequestMethod.GET)
	Collection<Movie> findMovieByTitle(@PathVariable(value = "movieTitle") String title) {
		Collection<Movie> movie = this.movieRepository.findByTitle(title);
		return movie;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	Movie saveMovie(@RequestBody Movie movie) {
		return this.movieRepository.save(movie);
	}
}
