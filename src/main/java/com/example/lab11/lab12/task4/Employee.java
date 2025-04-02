package com.example.lab11.lab12.task4;

import com.example.lab11.lab12.task5.Project;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private double salary;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = true)
    private Project project;

    public Employee() {}

    public Employee(String name, String email, String position, double salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
