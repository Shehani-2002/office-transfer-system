package lk.delma.office_transfer_system.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Long inventoryId;

    @Column(name = "item_name")
    private String itemName;

    private String category;

    private Integer quantity;

    private String description;

    @ManyToOne
    @JoinColumn(name = "office_id")
    @JsonIgnoreProperties("employees")
    private Office office;

    public Inventory() {
    }

    public Inventory(Long inventoryId, String itemName, String category,
                     Integer quantity, String description, Office office) {
        this.inventoryId = inventoryId;
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
        this.description = description;
        this.office = office;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}