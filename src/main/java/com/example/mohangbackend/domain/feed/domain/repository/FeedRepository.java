package com.example.mohangbackend.domain.feed.domain.repository;

import com.example.mohangbackend.domain.feed.domain.Feed;
import org.springframework.data.repository.CrudRepository;

public interface FeedRepository extends CrudRepository<Feed, Long> {
}
