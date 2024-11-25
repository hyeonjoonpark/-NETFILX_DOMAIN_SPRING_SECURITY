package fastcampus.netflix.tmdb;

import lombok.Builder;

@Builder
public record TmdbDateResponse(
    String maximum,
    String minimum
) {

}
