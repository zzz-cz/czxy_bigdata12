package com.czxy.score.controller;

import com.czxy.score.domain.User;
import com.czxy.score.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user, HttpServletRequest request){
        System.out.println(user);
        User u = userService.login(user);
        System.out.println(u);
        request.getSession().setAttribute("user",u);
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<List<User>> find (@PathVariable Integer id){
        try {
            List<User> userList = userService.find(id);
            return new ResponseEntity<>(userList,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

	
	/**
		展示登录用户名
	*/
	@GetMapping("/searchName")
    public ResponseEntity<String> searchName(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if(user != null){
            return new ResponseEntity<>(user.getUsername(),HttpStatus.OK);
        }
        return new ResponseEntity<>("null",HttpStatus.NO_CONTENT);
    }
    
}
