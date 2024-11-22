package fastcampus.netflix.movie.controller;

import fastcampus.netflix.api.ApiPath;
import fastcampus.netflix.movie.FetchMovieUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPath.MOVIE_API_URL)
@RequiredArgsConstructor
public class MovieController {
    private final FetchMovieUsecase fetchMovieUsecase; // TODO : Could not autowire. No beans of 'FetchMovieUsecase' type found.

    @GetMapping("/client/{page}")
    public String fetchMoviePageables(@PathVariable int page) {
        fetchMovieUsecase.fetchFromClient(page);

        return "";
    }
}
