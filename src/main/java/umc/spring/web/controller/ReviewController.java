package umc.spring.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayLoad.ApiResponse;
import umc.spring.domain.Review;
import umc.spring.domain.StoreAddRequestDTO;
import umc.spring.domain.StoreAddResponseDTO;
import umc.spring.service.MemberCommandServiceImpl;
import umc.spring.service.store.StoreCommandService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final StoreCommandService StoreCommandService;

}
