package com.dedyrudney.movieapi.utils.mapper

import com.dedyrudney.movieapi.dto.MovieDTO
import com.dedyrudney.movieapi.entity.Movie
import org.springframework.stereotype.Component

@Component
class MovieMapper: Mapper<MovieDTO, Movie> {
    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO (
        entity.id,
        entity.name,
        entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
        )


}