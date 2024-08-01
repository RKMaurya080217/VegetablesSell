package com.VegetablesSell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VegetablesSell.entity.User;
import com.VegetablesSell.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserById(Long userId) {
		return userRepository.findByUserId(userId);
				//.orElseThrow(() -> new UsernameNotFoundException("User not found with id " + userId));
	}

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getUser(Long userId) {
		return userRepository.findById(userId);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

}