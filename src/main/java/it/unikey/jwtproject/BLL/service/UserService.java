package it.unikey.jwtproject.BLL.service;

import it.unikey.jwtproject.DAL.domain.Role;
import it.unikey.jwtproject.DAL.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();


}
