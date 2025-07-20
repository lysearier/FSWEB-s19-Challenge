package com.eren.twitter_api.repository;

import com.eren.twitter_api.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}