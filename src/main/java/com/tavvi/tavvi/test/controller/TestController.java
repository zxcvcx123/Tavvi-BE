package com.tavvi.tavvi.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 업 무 : 테스트 컨트롤러
 * 설 명 : 테스트 컨트롤러
 *
 * Revision History
 * Author            	Date              	Description
 * ---------------   	--------------    	------------------
 * 정정모     			2025-11-10   		최초작성
 */
@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String test1() {
        return "테스트 성공입니다.";
    }
}
