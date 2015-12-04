package com.crossover.testmaker.controller;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crossover.testmaker.model.ExamUser;
import com.crossover.testmaker.model.Role;
import com.crossover.testmaker.model.User;
import com.crossover.testmaker.service.ExamUserService;
import com.crossover.testmaker.service.UserService;
import com.crossover.testmaker.view.ExamUserView;
import com.crossover.testmaker.view.UserView;

@RestController
@RequestMapping("/users")
@Transactional
public class UserController {

	@Inject
	private UserService userService;
	@Inject
	private ExamUserService examUserService;
	
	@RequestMapping(path = "/profile", method=RequestMethod.GET)
	public ModelAndView userProfile(final HttpServletRequest request, Principal principal){
		ModelAndView model = new ModelAndView("profile");
		String username = principal.getName();
		User user = userService.getUserByUsername(username);
		List<ExamUser> examUserList = examUserService.getExamUserByUser(user);
		List<ExamUserView> examUserViewList = examUserList.stream().map(elem -> new ExamUserView(elem)).collect(Collectors.toList());
		model.addObject("user", user);
		model.addObject("examUserViewList", examUserViewList);
		return model;
	}
	
	@RequestMapping(path = "/register", method=RequestMethod.GET)
	public ModelAndView getNewUser(){
		ModelAndView model = new ModelAndView("register");
		model.addObject("userView", new UserView());
		return model;
	}
	
	@RequestMapping(path = "/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(UserView userView){
		ModelAndView model = new ModelAndView("login");
		User user = new User(userView);
		user.setPassword(new BCryptPasswordEncoder().encode(userView.getPassword()));
		user.setRole(Role.USER);
		userService.save(user);
		return model;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setExamUserService(ExamUserService examUserService) {
		this.examUserService = examUserService;
	}
}