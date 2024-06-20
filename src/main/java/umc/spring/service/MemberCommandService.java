package umc.spring.service;

import umc.spring.domain.Member;
import umc.spring.domain.MemberRequestDTO;

public interface MemberCommandService {
    public Member joinMember(MemberRequestDTO.JoinDto request);
}
