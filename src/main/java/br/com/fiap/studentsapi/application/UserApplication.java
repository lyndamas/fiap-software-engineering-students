package br.com.fiap.studentsapi.application;

import br.com.fiap.studentsapi.application.dto.UserDto;
import br.com.fiap.studentsapi.application.dto.UserResponseDto;

import java.util.List;

public interface UserApplication {
    void createUser(UserDto userDto) throws Exception;

    List<UserResponseDto> listUsers();

    void deleteUserById(Long userId) throws Exception;
}
