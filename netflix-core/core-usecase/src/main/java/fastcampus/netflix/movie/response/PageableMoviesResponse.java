package fastcampus.netflix.movie.response;

import lombok.Builder;

import java.util.List;

@Builder
public record PageableMoviesResponse(
        List<MovieResponse> tmdbMovies,
        int page,
        boolean hasNext
) {

}
