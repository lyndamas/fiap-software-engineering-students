package br.com.fiap.studentsapi.controller;

import br.com.fiap.studentsapi.application.UserApplication;
import br.com.fiap.studentsapi.application.dto.UserDto;
import br.com.fiap.studentsapi.application.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserApplication userApplication;

    public UserController(
            @Autowired UserApplication userApplication
    ){
        this.userApplication = userApplication;
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto userDto) throws Exception {
        userApplication.createUser(userDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<UserResponseDto>> listUsers(){
        return ResponseEntity.ok(userApplication.listUsers());
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUserById(@PathVariable Long userId) throws Exception {
        userApplication.deleteUserById(userId);
        return ResponseEntity.ok().build();
    }
}
