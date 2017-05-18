package com.alingluo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @name: UserRepository
 * @Description:继承JpaRepository，可以根据方法名生成SQL
 * @author Administrator
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);
}
