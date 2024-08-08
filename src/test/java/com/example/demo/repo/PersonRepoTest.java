package com.example.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Person;

@SpringBootTest
public class PersonRepoTest {

	@Autowired
	private PersonRepo personRepo;
	@Test
	void isPersonExitsById()
	{
		Person person=new Person(14,"Aniket","hyd");
		personRepo.save(person);
		
		Boolean acRes=personRepo.isPersonExitById(14);
//		assertThat(acRes).isTrue();
	}
	
	@BeforeEach
	void setUp()
	{
		System.out.println("Setup is started");
	}
	
	void tearDown()
	{
		System.out.println("--Test Over---");
		//personRepo.deleteAll();

	}
}
