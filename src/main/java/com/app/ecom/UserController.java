package com.app.ecom;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static sun.awt.image.MultiResolutionCachedImage.map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService userService;

        public ResponseEntity<List<User>> getAllUsers() {
            return new ResponseEntity<>(userService.fetchAllUsers(),HttpStatus.OK);

        }
        @GetMapping("/api/users/{id}")
        public ResponseEntity<User> getUser(@PathVariable Long id) {
//            User user = userService.fetchUser(id);
//            if (user == null)
//                return ResponseEntity.notFound().build();
//                return ResponseEntity.ok(user);
            return userService.fetchUser(id)
                      .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());


        }

        @PostMapping("/api/users")
        public ResponseEntity<String> createUser(@RequestBody User user) {
            userService.addUser(user);
            return ResponseEntity.ok("User added successfully") ;

        }

        @PutMapping("/api/users/{id}")
        public ResponseEntity<User> updateUser(@RequestBody User user) {
               userService.fetchUser(user);
               return ResponseEntity.ok("User updated successfully");
        }
}

