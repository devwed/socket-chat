package io.devwed.messaging.socketchat.controller;


import io.devwed.messaging.socketchat.model.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/channels")
public class ChannelController {

    private static final Logger logger = LoggerFactory.getLogger(ChannelController.class);

    @GetMapping
    public ResponseEntity<?> getChannels () {

        // call to channel service here

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getChannel (@PathVariable Long id ) {

        // call to channel service here

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createChannel(@RequestBody Channel channel) {

        // call to channel service here

        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
