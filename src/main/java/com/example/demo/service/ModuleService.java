package com.example.demo.service;

import com.example.demo.domain.Module;
import com.example.demo.domain.ModuleInteraction;
import com.example.demo.domain.User;
import com.example.demo.repository.ModuleRepository;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    @Autowired
    ModuleRepository moduleRepository;
    @Autowired
    UserRepository userRepository;
    public void save(Module module){
        moduleRepository.save(module);
    }
    public void connectModule(String type,String detail,Module module1,Module module2){
        ModuleInteraction moduleInteraction = new ModuleInteraction(type,detail,module1,module2);
        module1.getModuleEnd().add(moduleInteraction);
        module2.getModuleStart().add(moduleInteraction);
    }
    public void addUser(Module module, User user){
        module.getUsers().add(user);
        user.getModules().add(module);
    }
    public void setOwner(Module module,User user){
        module.setOwnerUser(user);
        user.getOwnerModules().add(module);
    }
}
