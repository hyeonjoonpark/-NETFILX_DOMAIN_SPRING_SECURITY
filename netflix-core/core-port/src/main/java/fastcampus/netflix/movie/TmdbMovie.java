package fastcampus.netflix.movie;

public record TmdbMovie(
        String movieName, // 영화 이름
        Boolean isAdult, // 성인영화 분류
        String genre, // 장르
        String overview, // 설명
        String releaseAt // 출시일자
) {

}
