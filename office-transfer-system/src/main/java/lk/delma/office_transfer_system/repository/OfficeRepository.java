package lk.delma.office_transfer_system.repository;

import lk.delma.office_transfer_system.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {
}