package com.oes.service.features.user;

public interface IUserService {
    void save(User user);

    User findByEmail(String email);
}
