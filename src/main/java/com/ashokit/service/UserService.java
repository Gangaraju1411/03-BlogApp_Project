package com.ashokit.service;

import com.ashokit.binding.LoginForm;
import com.ashokit.binding.RegistrationForm;




public interface UserService {

	public boolean userSignup(RegistrationForm signup);

	public boolean loginVerify(LoginForm login);

}
