package com.meetup.twitter.service.impl;

import com.meetup.twitter.service.TwitterService;
import com.meetup.twitter.util.TwitterUtil;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;

import java.util.List;

@Service
public class TwitterServiceImpl implements TwitterService{
    @Override
    public List<String> getTweetList(String input) throws TwitterException {
        return TwitterUtil.searchTweetsByWord(input);
    }
}
