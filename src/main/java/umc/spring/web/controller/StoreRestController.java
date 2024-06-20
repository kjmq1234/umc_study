package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayLoad.ApiResponse;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.MemberRequestDTO;
import umc.spring.domain.Store;
import umc.spring.domain.StoreAddRequestDTO;
import umc.spring.domain.StoreAddResponseDTO;
import umc.spring.service.store.StoreCommandService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreRestController {
    private final StoreCommandService storeCommandService;

    @PostMapping("/")
    public ApiResponse<StoreAddResponseDTO.JoinResultDTO> join(@RequestBody @Valid StoreAddRequestDTO.JoinDTO request) {
        Store store = storeCommandService.JoinStore(request);
        return ApiResponse.onSuccess(StoreConverter.toJoinResultDTO(store));
    }
}
