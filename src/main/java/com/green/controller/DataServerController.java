package com.green.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.dto.UserDto;


// 이 페이지 모든 함수는 전부 @ResponseBody 로 작동
// 1.  데이터전송표준 - soap protocol 방식 : xml
// 2.  데이터전송표준 - rst api       방식 : json/xml
// @RestController : @Controller + @ResponseBody
@RestController
public class DataServerController {
	
	@RequestMapping("/ajax3")
	public  String  ajax3() {
		String username = "카리나";
		return username;
	}
	
	// UserDto class 를 추가한 후 실행
	// 자바객체 : new UserDto( userid, userpass, username );
	// jacksonbinder 라이브러리 작동 -> 
	// js 객체  : {"userid":"karin","userpass":"1234","username":"카리나"}
	@RequestMapping("/ajax4")
	// public  String  ajax4() {
	public  UserDto  ajax4() {
		String userid = "karin";
		String userpass = "1234";
		String username = "카리나";
		UserDto user = new UserDto( userid, userpass, username );
		return user;
	}

	@RequestMapping("/ajax5")
	// public  String  ajax4() {
	public  UserDto  ajax5() {
		String userid = "karin";
		String userpass = "1234";
		String username = "카리나";
		UserDto user = new UserDto( userid, userpass, username );
		return user;
	}
	
	
}
