package com.nyj.exam.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyj.exam.demo.model.Member;
import com.nyj.exam.demo.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	public List<Member> getAllMember() {
		System.out.println(memberRepository.findAll());
		return memberRepository.findAll();
	}
}
