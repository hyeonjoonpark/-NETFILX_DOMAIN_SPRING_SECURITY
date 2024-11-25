package fastcampus.netflix.movie;

import fastcampus.netflix.movie.response.PageableMoviesResponse;

public interface FetchMovieUsecase {
    PageableMoviesResponse fetchFromClient(int page);
}
