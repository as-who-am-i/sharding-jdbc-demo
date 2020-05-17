package com.east.sharding.dao;

import com.east.sharding.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {

    List<User> findUsersByCityLike(String city);

}
