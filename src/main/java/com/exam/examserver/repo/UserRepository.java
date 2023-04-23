package com.exam.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exam.examserver.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Transactional
	User findByUsername(String username);

	@Transactional
	void deleteByUsername(String username);

}
