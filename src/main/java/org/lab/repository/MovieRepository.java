package org.lab.repository;

import java.util.Collection;

import org.lab.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Collection<Movie> findByTitle(@Param("title") String title);

}
