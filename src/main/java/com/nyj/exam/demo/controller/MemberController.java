package com.nyj.exam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nyj.exam.demo.model.Member;
import com.nyj.exam.demo.model.MemberLoginForm;
import com.nyj.exam.demo.service.MemberService;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "http://localhost:8080", allowCredentials =  "true") //CORS 문제를 해결하기 위해 사용
@RestController 
public class MemberController { 
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/api/member/list")
	public List<Member> getAllMember() { 		
		return memberService.getAllMember();
	}
	
	//consumes="application/json;"
//	public boolean doLogin(@RequestBody Member member) { 
//	public boolean doLogin(@RequestBody String userId, @RequestBody String userPw ) { 

//	@PostMapping(consumes = MediaType.ALL_VALUE) 
//	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) 
//	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED) 
//	@PostMapping(consumes = MediaType.ALL_VALUE) 
	@PostMapping("/api/member/login")
	public boolean doLogin(@RequestBody MemberLoginForm memberLoginForm) { 
		System.out.println(memberLoginForm);
		
//		Member member = memberService.findByUserId(userId);
//		System.out.println("===member===");
//		System.out.println(member);
//		if(member == null) {
//			return false;
//		}
//		if(member.getUserPw().equals(userPw) == false) {
//			return false;
//		}
		return true;
	}
}
