package com.example.fastproject.api.controller;

import com.example.fastproject.api.dto.KakaoApiResponseDto;
import com.example.fastproject.api.service.KakaoAddressSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kakaoApi")
public class KakaoApiController {

    private final KakaoAddressSearchService kakaoAddressSearchService;

    @GetMapping
    public ResponseEntity<KakaoApiResponseDto> KakaoAddress(@RequestParam String address){
        KakaoApiResponseDto response = kakaoAddressSearchService.requestAddressSearch(address);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
