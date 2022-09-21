package com.nyj.exam.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "member")
@DynamicInsert	//insert시 null인 필드 제외하기 위해서 사용
@DynamicUpdate  //update시 null인 필드 제외하기 위해서 사용
public class Member {
	// MySQL에서 생성한 테이블에 대응하는 .java 파일 생성
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 
	
	@Column(name = "userId")
	private String userId;
	
	@Column(name = "userPw")
	private String	userPw; 
	
	@Column(name = "username")
	private String	username; 
	
	@Column(name = "nickname")
	private String	nickname; 
	
	@Column(name = "phone")
	private String	phone; 
	
	@Column(name = "email")
	private String	email; 
	
	// 2:일반회원, 7:관리자
	@Column(name = "authLevel")
	private Integer	authLevel; 
	
	@Column(name = "regDate")
	private String	regDate; 
	
	@Column(name = "updateDate")
	private String	updateDate; 

	// 0:탈퇴전, 1:탈퇴
	@Column(name = "delStatus") 
	private Integer	delStatus;  
	
	@Column(name = "delDate")
	private String	delDate; 
	
}
