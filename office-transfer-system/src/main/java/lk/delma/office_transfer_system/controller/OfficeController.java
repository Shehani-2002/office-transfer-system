package lk.delma.office_transfer_system.controller;

import lk.delma.office_transfer_system.entity.Office;
import lk.delma.office_transfer_system.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offices")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    // ➕ POST - Add Office
    @PostMapping
    public Office create(@RequestBody Office office) {
        return officeService.saveOffice(office);
    }

    // 📄 GET - All Offices
    @GetMapping
    public List<Office> getAll() {
        return officeService.getAllOffices();
    }
}