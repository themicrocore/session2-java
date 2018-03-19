package com.meetup.twitter.service;

import twitter4j.TwitterException;

import java.util.List;

public interface TwitterService {
    List<String> getTweetList(String input) throws TwitterException;
}
