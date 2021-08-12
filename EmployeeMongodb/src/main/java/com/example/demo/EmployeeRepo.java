package com.example.demo;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee,Integer> {
	@Query(value="{region:?0}")
	List<Employee> findByRegion(String region);

	List<Employee> findByNameStartingWith(String name);
	@Query("{name:?0}")
	List<Employee> findByName(String name);
	
	@Query(value = "{salary: {$gte:?0}}")
	List<Employee> findsalary(int salary);
	
	@Query(value="{age:{$lt:?0}}")
	List<Employee> getEmployeeAgeGreater(int age);
	
	@Query("{region:?0, age:{$lte:?1}}")
	List<Employee> getEmployeeAgeandRegion(String region,int age);
	
	@Query("{name:{$regex:?0}}")
	List<Employee> getEmployeeNameStartwith(String name);
	
	@Query("{salary:-1}.limit(1)")
	List<Employee> getEmployeeMaxSalary();
	

}
