package br.com.fiap.studentsapi.application.impl;

import br.com.fiap.studentsapi.application.UserApplication;
import br.com.fiap.studentsapi.application.dto.UserDto;
import br.com.fiap.studentsapi.application.dto.UserResponseDto;
import br.com.fiap.studentsapi.model.User;
import br.com.fiap.studentsapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserApplicationImpl implements UserApplication {

    private UserService userService;
    
    public UserApplicationImpl(@Autowired UserService userService){
        this.userService = userService;
    }

    @Override
    public void createUser(UserDto userDto) throws Exception {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        this.userService.saveUser(user);
    }

    @Override
    public List<UserResponseDto> listUsers(){
        return userService.listUsers().stream().map(
        user -> new UserResponseDto(user.getId(), user.getName())
        ).collect(Collectors.toList());
    }

    @Override
    public void deleteUserById(Long userId) throws Exception {
        this.userService.deleteUserById(userId);
    }
}