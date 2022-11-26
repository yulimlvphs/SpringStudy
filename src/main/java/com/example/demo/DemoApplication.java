package com.example.demo;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).execute();
	}

	@Autowired
	MemberCrudRepository repository;

	private void execute(){
		executeInsert(); //등록
		executeSelect(); //전체 취득
	}

	private void executeInsert(){
		Member member = new Member(null,"이순신");
		member = repository.save(member);
		System.out.println("등록 데이터 : " + member);
	}

	private void executeSelect() {
		System.out.println("===== 전체 데이터를 취득합니다. =====");
		Iterable<Member> members = repository.findAll();
		for(Member member : members){
			System.out.println(member);
		}
	}

}
