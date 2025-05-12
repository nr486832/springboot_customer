package com.example.customer.model;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private int purchaseCount;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getPurchaseCount() { return purchaseCount; }
    public void setPurchaseCount(int purchaseCount) { this.purchaseCount = purchaseCount; }
}