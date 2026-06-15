package lk.delma.office_transfer_system.controller;

import lk.delma.office_transfer_system.entity.Office;
import lk.delma.office_transfer_system.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/offices")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    // CREATE
    @PostMapping
    public Office create(@RequestBody Office office) {
        return officeService.saveOffice(office);
    }

    // READ ALL
    @GetMapping
    public List<Office> getAll() {
        return officeService.getAllOffices();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Office update(@PathVariable Long id, @RequestBody Office office) {
        return officeService.updateOffice(id, office);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        officeService.deleteOffice(id);
    }
}