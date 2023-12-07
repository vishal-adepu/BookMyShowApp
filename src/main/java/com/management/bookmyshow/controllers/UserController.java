package com.management.bookmyshow.controllers;

import com.management.bookmyshow.dtos.CreateUserRequest;
import com.management.bookmyshow.dtos.GetUserResponse;
import com.management.bookmyshow.models.User;
import com.management.bookmyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@AllArgsConstructor     //Constructor Injection
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired      //Field Injecton
    private UserService userService;

    @PostMapping("/user")       //Create User Shortcut
    public GetUserResponse createUser(@RequestBody CreateUserRequest request){

            User user = userService.createUser(request.toUser());
            return GetUserResponse.fromUser(user);
    }




    /*@RequestMapping(path = "/user", method = RequestMethod.POST)
    User createUser(){
        return null;
    }*/

//    @PostMapping("/user")       //Create User Shortcut
//    public GetUserResponse createUser(@RequestBody CreateUserRequest request){
//        System.out.println("Got request for: " + request.getEmail() + "with password:" + request.getPassword());
//        return new GetUserResponse();
//    }

    @GetMapping("/user")
    public void create(){

        System.out.println("Got request for GET");
    }



}
