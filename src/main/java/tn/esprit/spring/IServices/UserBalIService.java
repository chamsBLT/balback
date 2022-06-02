package tn.esprit.spring.IServices;

import tn.esprit.spring.Etities.UserBal;

public interface UserBalIService {

	public void addUser(UserBal u);
	public UserBal signIn(String username);
}
