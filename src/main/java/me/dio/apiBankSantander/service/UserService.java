package me.dio.apiBankSantander.service;

import me.dio.apiBankSantander.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
