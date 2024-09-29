package vn.hoidanit.laptopshop.service;

import org.springframework.stereotype.Service;

@Service // mô hình mvc
public class UserService {
    public String handleHello(){
        return "Hello from sevice";
    }
}
