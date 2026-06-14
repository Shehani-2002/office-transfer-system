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

    public Office saveOffice(Office office) {
        return officeRepository.save(office);
    }

    public List<Office> getAll() {
        return officeRepository.findAll();
    }
}
