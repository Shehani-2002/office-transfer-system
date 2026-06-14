package lk.delma.office_transfer_system.repository;

import lk.delma.office_transfer_system.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}