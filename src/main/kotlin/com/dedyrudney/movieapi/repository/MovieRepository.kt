package com.dedyrudney.movieapi.repository

import com.dedyrudney.movieapi.entity.Movie
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MovieRepository: CrudRepository<Movie,Int>{

    @Query("SELECT m FROM Movie as m")
    fun getAllMovies(): List<Movie>
}