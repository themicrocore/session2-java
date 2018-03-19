package com.meetup.twitter.controller;

import com.meetup.twitter.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;

import java.util.List;

@RestController
@RequestMapping(value = "/twitter")
public class TwitterController {
    @Autowired
    TwitterService twitterService;

    @GetMapping("/tweets/{key}")
    public ResponseEntity<List<String>> getTweetsbyKeyword(@PathVariable(value = "key") String key) throws TwitterException {
        List<String> response = twitterService.getTweetList(key);
        return ResponseEntity.ok().body(response);
    }
}
