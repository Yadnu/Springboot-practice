package com.yadneya.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	// JPA/Hibernate > Database
	// UserDaoService > Static List
	private static List<User> users = new ArrayList<User>();
	static {
		users.add(new User(1, "Yadneya", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Virat", LocalDate.now().minusYears(20)));
		users.add(new User(3, "Rohit", LocalDate.now().minusYears(25)));
	}
	
	
	 public List<User> findAll() {
		 return users;
	 }
	
	// public User save(User user) {
	
	public User findOne ( int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
}
}