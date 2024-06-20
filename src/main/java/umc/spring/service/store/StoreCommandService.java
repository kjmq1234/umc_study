package umc.spring.service.store;

import umc.spring.domain.Member;
import umc.spring.domain.MemberRequestDTO;
import umc.spring.domain.Store;
import umc.spring.domain.StoreAddRequestDTO;

public interface StoreCommandService {
    public Store JoinStore(StoreAddRequestDTO.JoinDTO request);

}
