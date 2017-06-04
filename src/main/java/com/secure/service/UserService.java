package com.secure.service;

import com.secure.entity.User;

/**
 * Created by Anastasia on 03.04.2017.
 */
public interface UserService {
    User getUser(String login);
}
