package Entreprise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<UserAppEntity, Long> {
    UserAppEntity findByUsername(String username);
}
