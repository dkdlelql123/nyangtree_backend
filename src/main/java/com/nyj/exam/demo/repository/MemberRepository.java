package com.nyj.exam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyj.exam.demo.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}