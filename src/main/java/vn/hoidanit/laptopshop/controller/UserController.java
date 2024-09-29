package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;


// Theo mô hình MVC
// @Controller // (annotation) class biến thành controller
// public class UserController {
    
//     // gọi method getHomePage
//     @RequestMapping("/")
//     public String getHomePage() {
//         return "hello from controller";
//     }
// }


// Theo mô hình restfull API
//Controller chỉ dùng để điều hướng
@RestController // (annotation) class biến thành controller
public class UserController {
    //DI Dependency Injection
    private UserService userService; // khai báo userservice
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // gọi method getHomePage
    @GetMapping("/")
    public String getHomePage() {
        return this.userService.handleHello();
    }
}
