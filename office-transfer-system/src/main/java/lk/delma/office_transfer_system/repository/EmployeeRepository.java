package lk.delma.office_transfer_system.repository;

import lk.delma.office_transfer_system.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}