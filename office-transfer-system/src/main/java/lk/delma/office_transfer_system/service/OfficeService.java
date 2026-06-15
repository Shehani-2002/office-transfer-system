package lk.delma.office_transfer_system.service;

import lk.delma.office_transfer_system.entity.Office;
import lk.delma.office_transfer_system.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    // CREATE
    public Office saveOffice(Office office) {
        return officeRepository.save(office);
    }

    // READ ALL
    public List<Office> getAllOffices() {
        return officeRepository.findAll();
    }

    // READ BY ID
    public Office getOfficeById(Long id) {
        return officeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Office not found with id: " + id));
    }

    // UPDATE
    public Office updateOffice(Long id, Office updatedOffice) {
        Office office = getOfficeById(id);

        office.setName(updatedOffice.getName());
        office.setLocation(updatedOffice.getLocation());

        return officeRepository.save(office);
    }

    // DELETE
    public void deleteOffice(Long id) {
        Office office = getOfficeById(id);
        officeRepository.delete(office);
    }
}