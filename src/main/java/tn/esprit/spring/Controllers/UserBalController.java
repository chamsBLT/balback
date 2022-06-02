package tn.esprit.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Etities.UserBal;
import tn.esprit.spring.IServices.UserBalIService;


@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserBalController {
	@Autowired
	UserBalIService userIS;
	
	@PostMapping("/add-user")
	@ResponseBody
	public void addUtilisateur(@RequestBody UserBal u) {
		userIS.addUser(u);
	}
	
	@GetMapping("/signIn/{username}")
	@ResponseBody
	public UserBal signIn(@PathVariable("username") String username) {
		return userIS.signIn(username);
	}

}
