package com.nyj.exam.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nyj.exam.demo.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

	Member findByUserId(String userId);

}
