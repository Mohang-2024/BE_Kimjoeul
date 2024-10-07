package com.example.mohangbackend.domain.feed.service;

import com.example.mohangbackend.domain.feed.domain.Feed;
import com.example.mohangbackend.domain.feed.domain.repository.FeedRepository;
import com.example.mohangbackend.domain.feed.exception.CannotBeDeletedException;
import com.example.mohangbackend.domain.feed.facade.FeedFacade;
import com.example.mohangbackend.domain.user.domain.User;
import com.example.mohangbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteFeedService {

    private final UserFacade userFacade;
    private final FeedFacade feedFacade;
    private final FeedRepository feedRepository;

    @Transactional
    public void execute(Long feedId) {
        User user = userFacade.getCurrentUser();
        Feed feed = feedFacade.getFeedById(feedId);

        if(!user.equals(feed.getUser())) {
            throw CannotBeDeletedException.EXCEPTION;
        }

        feedRepository.delete(feed);
    }
}
