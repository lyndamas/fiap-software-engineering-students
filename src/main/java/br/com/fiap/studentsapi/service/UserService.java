package br.com.fiap.studentsapi.service;

import br.com.fiap.studentsapi.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user) throws Exception;
    List<User> listUsers();
    void deleteUserById(Long userId) throws Exception;
}
