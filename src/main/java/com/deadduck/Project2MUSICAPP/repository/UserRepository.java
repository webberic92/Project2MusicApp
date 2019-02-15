package com.deadduck.Project2MUSICAPP.repository;

import com.deadduck.Project2MUSICAPP.bean.User;
import com.deadduck.Project2MUSICAPP.controller.MyController;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String username, String password);
}

