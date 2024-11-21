package fastcampus.netflix.movie;

import fastcampus.netflix.movie.response.MovieResponse;
import fastcampus.netflix.movie.response.PageableMoviesResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService implements FetchMovieUsecase {
    private final TmdbMoviePort tmdbMoviePort;

    @Override
    public PageableMoviesResponse fetchFromClient(int page) {
        TmdbPageableMovies tmdbPageableMovies = tmdbMoviePort.fetchPageable(page);
        return PageableMoviesResponse.builder()
                .tmdbMovies(
                        tmdbPageableMovies.tmdbMovies().stream()
                        .map(
                                movie -> MovieResponse.builder()
                                        .movieName(movie.movieName())
                                        .isAdult(movie.isAdult())
                                        .genre(movie.genre())
                                        .overview(movie.overview())
                                        .releaseAt(movie.releaseAt())
                                        .build()
                        ).collect(Collectors.toList())
                )
                .hasNext(tmdbPageableMovies.hasNext())
                .page(tmdbPageableMovies.page())
                .build();
    }
}
