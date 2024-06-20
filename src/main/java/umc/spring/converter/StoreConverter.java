package umc.spring.converter;

import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.domain.StoreAddRequestDTO;
import umc.spring.domain.StoreAddResponseDTO;

import java.time.LocalDateTime;

public class StoreConverter {
    public static StoreAddResponseDTO.JoinResultDTO toJoinResultDTO(Store store) {
        return StoreAddResponseDTO.JoinResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(StoreAddRequestDTO.ReviewDTO request) {
            return Review.builder()
                    .id(request.getId())
                    .score(request.getScore())
                    .title(request.getTitle())
                    .build();
    }

    public static Store toStore(StoreAddRequestDTO.JoinDTO request) {
        return Store.builder()
                .id(request.getId())
                .name(request.getName())
                .address(request.getAddress())
                .score(request.getScore())
                .build();
    }
}
