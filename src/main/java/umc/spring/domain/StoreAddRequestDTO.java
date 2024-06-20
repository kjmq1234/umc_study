package umc.spring.domain;

import lombok.Getter;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StoreAddRequestDTO {

    @Getter
    public  static class JoinDTO {
        Long id;

        String name;

        String address;

        Float score;
    }

    @Getter
    public static class ReviewDTO {
        @NotNull
        Long id;

        @NotBlank
        String reviewContent;

        @NotNull
        Float score;

        @NotBlank
        String title;

        @NotNull
        String member_id;
    }
}
