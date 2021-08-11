package com.example.demo;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee,Integer> {

	List<Employee> findByRegion(String region);

	List<Employee> findByNameStartingWith(String name);
	@Query("{'name':?0}")
	List<Employee> findByName(String name);
	@Query(value = "{'salary': {$gte:?0}}")
	List<Employee> findsalary(int salary);
	

}
