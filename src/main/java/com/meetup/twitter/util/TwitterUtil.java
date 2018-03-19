package com.meetup.twitter.util;

import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

public class TwitterUtil {

    private static Twitter twitter = TwitterFactory.getSingleton();

    public static List<String> searchTweetsByWord(String input) throws TwitterException {
        Query query = new Query(input);
        QueryResult queryResult = twitter.search(query);
        //List<String> results = queryResult.getTweets().stream().map(item -> item.getText());
        return getContents(queryResult.getTweets());
    }

    private static List<String> getContents(List<Status> statusList) {
        List<String> result = new ArrayList<>();
        for(Status item: statusList) {
            result.add(item.getText());
        }
        return result;
    }
}
