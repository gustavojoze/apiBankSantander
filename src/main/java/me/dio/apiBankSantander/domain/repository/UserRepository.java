package me.dio.apiBankSantander.domain.repository;


import me.dio.apiBankSantander.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
