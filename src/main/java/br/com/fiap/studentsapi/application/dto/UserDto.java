package br.com.fiap.studentsapi.application.dto;

import lombok.Data;

/**
 * ```json
 * {
 * "id" : 1,
 * "name" : "Evelyn Damas"
 * }
 * ```
 */
@Data
public class UserDto {
    private Long id;
    private String name;
}
