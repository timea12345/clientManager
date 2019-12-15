package com.sda.timea.clientmanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;
    @Column(name = "client_name")
    private String clientName;
    @Column(name = "CNP")
    private String cnp;
    @Column(name = "phone_no")
    private String phoneNo;
    private boolean married;
    @Enumerated(value = EnumType.STRING)
    private EducationEnum education;
    @Enumerated(value = EnumType.STRING)
    private PropertyEnum property;
    private String employer;
    @Column(name = "emp_date")
    private Date empDate;
    private double salary;
    private boolean tickets;
    @OneToMany(mappedBy = "client")
    private List<ClientProduct> clientProducts = new ArrayList<>();


    public Client() {
    }

    public Client(int idClient, String clientName, String cnp, String phoneNo, boolean married, EducationEnum education, PropertyEnum property, String employer, Date empDate, double salary, boolean tickets) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.cnp = cnp;
        this.phoneNo = phoneNo;
        this.married = married;
        this.education = education;
        this.property = property;
        this.employer = employer;
        this.empDate = empDate;
        this.salary = salary;
        this.tickets = tickets;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public EducationEnum getEducation() {
        return education;
    }

    public void setEducation(EducationEnum education) {
        this.education = education;
    }

    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isTickets() {
        return tickets;
    }

    public void setTickets(boolean tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", clientName='" + clientName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", married=" + married +
                ", education=" + education +
                ", property=" + property +
                ", employer='" + employer + '\'' +
                ", empDate=" + empDate +
                ", salary=" + salary +
                ", tickets=" + tickets +
                '}';
    }
}
