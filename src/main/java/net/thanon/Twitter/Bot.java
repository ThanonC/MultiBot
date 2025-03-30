package net.thanon.Twitter;

import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.dto.user.User;

import java.io.File;

public class Bot {
    public Bot() {
        TwitterClient client = new TwitterClient(TwitterClient.getAuthentication(new File("C:/Users/Kai/Desktop/Idk/twitter_credentials.json")));
        User user = client.getUserFromUserName("Basi1r");
        System.out.printf("Name: %s\nTweet amount: %s\nFollowers: %s", user.getDisplayedName(), user.getTweetCount(), user.getFollowersCount());
        //so basically we will later send stats to the rest api which then get put onto the website, so we have more data :3 or database, idk, I never considered how I would do that
        //client.postTweet("Imagen not being funny and using ai and a bot");
    }
}
