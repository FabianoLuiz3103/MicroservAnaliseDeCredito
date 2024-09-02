package com.github.FabianoLuiz3103.MsAnaliseCredito.repository;

import com.github.FabianoLuiz3103.MsAnaliseCredito.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
