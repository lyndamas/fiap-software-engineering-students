package br.com.fiap.studentsapi.service.impl;

import br.com.fiap.studentsapi.model.User;
import br.com.fiap.studentsapi.service.UserService;
import br.com.fiap.studentsapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    private UserRepository userRepository;

    public UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) throws Exception {
        userRepository.save(user);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long userId) throws Exception {
        if (userRepository.findById(userId).isPresent())
            userRepository.deleteById(userId);
    }
}
