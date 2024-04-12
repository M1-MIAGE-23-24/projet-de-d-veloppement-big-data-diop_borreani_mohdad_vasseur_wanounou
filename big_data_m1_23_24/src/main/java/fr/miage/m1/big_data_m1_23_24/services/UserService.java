package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.User;

import java.util.List;

public interface UserService {

    public User get(Long id);

    public List<User> getAll();

    public User create(User author);

    public User edit(User author);

    public void delete(Long id);

}
