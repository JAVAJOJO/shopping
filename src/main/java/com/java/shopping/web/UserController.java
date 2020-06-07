package com.java.shopping.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.java.shopping.pojo.User;
import com.java.shopping.service.UserService;
import com.java.shopping.util.Page4Navigator;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	@Autowired UserService userService;

    @GetMapping("/users")
    public Page4Navigator<User> list(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
    	start = start<0?0:start;
    	Page4Navigator<User> page = userService.list(start,size,5); 
        return page;
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") int id)  throws Exception {
        userService.delete(id);
        return null;
    }
        
}

