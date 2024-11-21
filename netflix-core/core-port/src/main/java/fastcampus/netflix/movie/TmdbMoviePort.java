package fastcampus.netflix.movie;

public interface TmdbMoviePort {
    TmdbPageableMovies fetchPageable(int page);
}
