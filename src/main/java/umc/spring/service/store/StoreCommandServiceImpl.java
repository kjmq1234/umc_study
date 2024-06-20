package umc.spring.service.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.*;
import umc.spring.repository.StoreRepository;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreCommandServiceImpl implements StoreCommandService{


    @Override
    @Transactional
    public Store JoinStore(StoreAddRequestDTO.JoinDTO request) {
        Store newStore = StoreConverter.toStore(request);

        return null;
    }

    @Transactional
    public Review addReview(StoreAddRequestDTO.ReviewDTO request) {
        Review newReview = StoreConverter.toReview(request);

        return null;
    }
}
