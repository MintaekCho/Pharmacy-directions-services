package com.example.fastproject.api.service

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

//@SpringBootTest // 스프링 컨테이너를 띄워서 통합테스트 환경 구성
class KakaoUriBuilderServiceTest extends Specification {

    private KakaoUriBuilderService kakaoUriBuilderService

    //모든 피쳐 메서드 전에 실행
    def setup() {
        kakaoUriBuilderService = new KakaoUriBuilderService()
    }

    //한글 주소를 입력했을 때 URI 생성이 올바르게 되는지 테스트
    def "buildUriByAddressSearch - 한글 파라미터의 경우 정상적으로 인코딩"() {
        given:
        String address = "대구 내당동"
        def charset = StandardCharsets.UTF_8

        when:
        def uri = kakaoUriBuilderService.buildUriByAddressSearch(address)
        def decodeResult = URLDecoder.decode(uri.toString(), charset)

        then:
        decodeResult == "https://dapi.kakao.com/v2/local/search/address.json?query=대구 내당동"

    }
}
