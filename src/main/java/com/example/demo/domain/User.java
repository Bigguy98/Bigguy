package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public User(String name) {
        this.name = name;
        this.ownerModules = new HashSet<>();
        this.modules = new HashSet<>();
    }

    @OneToMany(mappedBy = "ownerUser",cascade = CascadeType.ALL)
    private Set<Module> ownerModules;

    public Set<Module> getOwnerModules() {
        return ownerModules;
    }

    public Set<Module> getModules() {
        return modules;
    }

    @ManyToMany(mappedBy = "users")
    private Set<Module> modules;
}
