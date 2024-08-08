package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {
	@Query("Select case when count(s) > 0 then true else false end from Person s where s.personId =?1")
	Boolean isPersonExitById(Integer id);
	
}