package com.allcodesnick.loginregistration.service;


import com.allcodesnick.loginregistration.model.User;

import java.util.List;

public interface UserService {

    List<User> listUserAccounts();

    User createUserAccount(User user);
}
