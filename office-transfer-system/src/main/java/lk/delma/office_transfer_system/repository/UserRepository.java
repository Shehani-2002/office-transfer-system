package lk.delma.office_transfer_system.repository;

import lk.delma.office_transfer_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}