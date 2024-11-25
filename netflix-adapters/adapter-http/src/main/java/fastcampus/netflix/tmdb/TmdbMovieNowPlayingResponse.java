package fastcampus.netflix.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record TmdbMovieNowPlayingResponse(
        TmdbDateResponse dates,
        String page,
        @JsonProperty("total_pages") int totalPages,
        @JsonProperty("total_results") int totalResults,
        List<TmdbMovieNowPlaying> results
) {

}
