package br.com.FabianoLuiz3103.MsAnaliseCredito.repository;

import br.com.FabianoLuiz3103.MsAnaliseCredito.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
}
