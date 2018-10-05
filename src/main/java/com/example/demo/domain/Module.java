package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table
@Getter
@Setter
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    public Module(String name,String description){
        this.name = name;
        this.description = description;
        this.moduleEnd = new HashSet<>();
        this.moduleStart = new HashSet<>();
        this.users = new HashSet<>();
    }
    @OneToMany(mappedBy = "module1",cascade = CascadeType.ALL)
    private Set<ModuleInteraction> moduleStart;

    @OneToMany(mappedBy = "module2")
    private Set<ModuleInteraction> moduleEnd;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "module_user",joinColumns = @JoinColumn(name = "module_id"),inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User ownerUser;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<ModuleInteraction> getModuleStart() {
        return moduleStart;
    }

    public Set<ModuleInteraction> getModuleEnd() {
        return moduleEnd;
    }

    public Set<User> getUsers() {
        return users;
    }

    public User getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }
}
