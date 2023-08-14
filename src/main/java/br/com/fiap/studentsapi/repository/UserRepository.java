package br.com.fiap.studentsapi.repository;

import br.com.fiap.studentsapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

