package com.sda.timea.clientmanager.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_prod")
public class ClientProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client_product")
    private int idClientProduct;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "prod_name")
    private ProductEnum prodName;
    @Column(name = "total_value")
    private double totalValue;
    @Column(name = "new_value")
    private double newValue;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "prod_type")
    private ProductTypeEnum prodType;
    @Enumerated(value = EnumType.STRING)
    private StatusEnum status;
    @Column(name = "date_analysis")
    private Date dateAnalysis;
    @Column(name = "date_disb")
    private Date dateDisb;

    public ClientProduct() {
    }

    public ClientProduct(int idClientProduct, Client client, ProductEnum prodName, double totalValue, double newValue, ProductTypeEnum prodType, StatusEnum status, Date dateAnalysis, Date dateDisb) {
        this.idClientProduct = idClientProduct;
        this.client = client;
        this.prodName = prodName;
        this.totalValue = totalValue;
        this.newValue = newValue;
        this.prodType = prodType;
        this.status = status;
        this.dateAnalysis = dateAnalysis;
        this.dateDisb = dateDisb;
    }

    public int getIdClientProduct() {
        return idClientProduct;
    }

    public void setIdClientProduct(int idClientProduct) {
        this.idClientProduct = idClientProduct;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ProductEnum getProdName() {
        return prodName;
    }

    public void setProdName(ProductEnum prodName) {
        this.prodName = prodName;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getNewValue() {
        return newValue;
    }

    public void setNewValue(double newValue) {
        this.newValue = newValue;
    }

    public ProductTypeEnum getProdType() {
        return prodType;
    }

    public void setProdType(ProductTypeEnum prodType) {
        this.prodType = prodType;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getDateAnalysis() {
        return dateAnalysis;
    }

    public void setDateAnalysis(Date dateAnalysis) {
        this.dateAnalysis = dateAnalysis;
    }

    public Date getDateDisb() {
        return dateDisb;
    }

    public void setDateDisb(Date dateDisb) {
        this.dateDisb = dateDisb;
    }

    @Override
    public String toString() {
        return "ClientProduct{" +
                "idClientProduct=" + idClientProduct +
                ", clientId=" + client +
                ", prodName=" + prodName +
                ", totalValue=" + totalValue +
                ", newValue=" + newValue +
                ", prodType=" + prodType +
                ", status=" + status +
                ", dateAnalysis=" + dateAnalysis +
                ", dateDisb=" + dateDisb +
                '}';
    }
}
