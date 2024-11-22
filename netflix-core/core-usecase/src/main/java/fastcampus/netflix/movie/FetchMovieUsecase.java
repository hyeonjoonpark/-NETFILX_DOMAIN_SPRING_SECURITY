package fastcampus.netflix.movie;

import fastcampus.netflix.movie.response.PageableMoviesResponse;

@Service
public interface FetchMovieUsecase {
    PageableMoviesResponse fetchFromClient(int page);
}
