package tn.esprit.spring.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.Etities.UserBal;
import tn.esprit.spring.IServices.UserBalIService;
import tn.esprit.spring.Repositories.UserBalRepository;

@Service
public class UserBalService implements UserBalIService{

	@Autowired
	UserBalRepository ur;
	private List<UserBal> users;

	@Override
	public void addUser(UserBal u) {
		ur.save(u);
		
	}

	@Override
	public UserBal signIn(String username) {		
		users = new ArrayList<UserBal>();
		ur.findAll().forEach(e -> users.add(e));
		
		if(!users.isEmpty()) {
			for (UserBal u : users) {
				if (u.getUsername().equals(username)) {
					return u;
				} 
			}
		}
		return null;

	}

}
