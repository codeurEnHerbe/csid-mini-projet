package Entreprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends JpaRepository<UserAppEntity, Integer>{
   UserAppEntity findByUsername(String username);
}