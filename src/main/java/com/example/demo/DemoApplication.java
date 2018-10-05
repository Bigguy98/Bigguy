package com.example.demo;

import com.example.demo.domain.Module;

import com.example.demo.domain.ModuleInteraction;
import com.example.demo.domain.User;


import com.example.demo.repository.ModuleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ModuleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    ModuleRepository moduleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModuleService moduleService;
    @Autowired
    UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {



//            User user = new User("User4");
//            User user2 = new User("User5");
//            User user3 = new User("User6");
//
//            Module module = new Module("module3","descrip");
//            Module module2 = new Module("module4","decrip2");
//
//
//            userRepository.save(user);
//            moduleRepository.save(module2);
//            moduleRepository.save(module);
//
//
//
//            ModuleInteraction moduleInteraction = new ModuleInteraction("type","detail",module,module2);
//            module.getModuleStart().add(moduleInteraction);
//            module2.getModuleEnd().add(moduleInteraction);
//
//
//
//
//            user.getOwnerModules().add(module);
//            module.setOwnerUser(user);
//
//
//            user3.getModules().add(module);
//            module.getUsers().add(user3);
//
//            user2.getModules().add(module);
//            module.getUsers().add(user2);
        User user = new User("speciall");
    }
}
