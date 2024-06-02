package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
