package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		 User user=new User(); user.setName("Durgest tiwari"); user.setCity("Delhi");
//		 user.setStatus("I am java programmer");
//		  
//		 User user1 = userRepository.save(user); System.out.println(user1);

		
		//		Create Object of User
		User user1=new User();
		user1.setName("Uttam");
		user1.setCity("city1");
		user1.setStatus("python Programmer");
	
		User user2=new User();
		user2.setName("Ankit");
		user2.setCity("city2");
		user2.setStatus("Java Programmer");
		
//		Saving Single Object
//		User resultUser1 = userRepository.save(user1);
//		System.out.println("saved user="+resultUser1);
//		System.out.println("Done");
		
		//saving multiple object using saveAll() method of CrudRepository
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->System.out.println(user));
		
//		update the user data using id->152
//		Optional<User> optional = userRepository.findById(152);
//		User user = optional.get();
//		user.setName("Ankit Tiwari");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		How to Retrieve/get/read the data
//		by id
//		Optional<User> optional = userRepository.findById(152);
//		User user = optional.get();
//		System.out.println(user);
		
		//How to Retrieve/get/read all the data present in table
		//Iterable<User> itr = userRepository.findAll();
//		
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
//		System.out.println("---------------");
//		for(User user:itr)
//		{
//			System.out.println(user);
//		}
//		System.out.println("---------------");
		//itr.forEach(user->System.out.println(user));
		
//		Delete user by Id
//		userRepository.deleteById(153);
//		System.out.println("deleted");
		
//		Deleting more than 1 object 
		
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(users->System.out.println(users));
//		userRepository.deleteAll(allusers);
		
//		using custom methods that we created in UserRepository
//		List<User> users1 = userRepository.findByName("Ankit");
//		
//		users1.forEach(user->System.out.println(user));
		
		List<User> user = userRepository.findByNameAndCity("Ankit", "city2");
		user.forEach(users1->System.out.println(users1));
	}
}
