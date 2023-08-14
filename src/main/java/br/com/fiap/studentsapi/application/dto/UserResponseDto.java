package br.com.fiap.studentsapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDto {
    public Long id;
    private String name;
}
