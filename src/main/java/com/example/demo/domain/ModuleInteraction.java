package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
public class ModuleInteraction implements Serializable {
    private String type;
    private String detail;
    @Id
    @ManyToOne
    @JoinColumns(@JoinColumn(name = "module_id_1"))
    private Module module1;

    @Id
    @ManyToOne
    @JoinColumn(name = "module_id_2")
    private Module module2;

    public ModuleInteraction(String type, String detail, Module module1, Module module2) {
        this.type = type;
        this.detail = detail;
        this.module1 = module1;
        this.module2 = module2;
    }

    public ModuleInteraction(String type, String detail) {
        this.type = type;
        this.detail = detail;
    }

    public void setModule1(Module module1) {
        this.module1 = module1;
    }

    public void setModule2(Module module2) {
        this.module2 = module2;
    }
}
