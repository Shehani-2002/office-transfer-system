package lk.delma.office_transfer_system.service;

import lk.delma.office_transfer_system.entity.Inventory;
import lk.delma.office_transfer_system.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));
    }

    public Inventory updateInventory(Long id, Inventory updatedInventory) {

        Inventory inventory = getInventoryById(id);

        inventory.setItemName(updatedInventory.getItemName());
        inventory.setCategory(updatedInventory.getCategory());
        inventory.setQuantity(updatedInventory.getQuantity());
        inventory.setDescription(updatedInventory.getDescription());
        inventory.setOffice(updatedInventory.getOffice());

        return inventoryRepository.save(inventory);
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}