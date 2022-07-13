package com.ketul.resources;

import com.ketul.module.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class UserResource {

    @GetMapping("{id}")
    public ResponseEntity<?> getUser(@PathVariable long id) {
        User user = new User(id, "Ketul Patel", "ketul.patel@gmail.com");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
