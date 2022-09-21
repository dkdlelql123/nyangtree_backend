package com.nyj.exam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyj.exam.demo.model.Member;
import com.nyj.exam.demo.service.MemberService;

@CrossOrigin(origins = "http://localhost:5173") //CORS 문제를 해결하기 위해 사용
@RestController 
public class MemberController { 
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/api/member/list")
	public List<Member> getAllMember() {
		return memberService.getAllMember();
	}
}
