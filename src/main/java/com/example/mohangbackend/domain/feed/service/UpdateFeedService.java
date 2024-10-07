package com.example.mohangbackend.domain.feed.service;

import com.example.mohangbackend.domain.feed.domain.Feed;
import com.example.mohangbackend.domain.feed.exception.CannotBeModifiedException;
import com.example.mohangbackend.domain.feed.facade.FeedFacade;
import com.example.mohangbackend.domain.feed.presentation.dto.request.UpdateFeedRequest;
import com.example.mohangbackend.domain.user.domain.User;
import com.example.mohangbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateFeedService {

    private final UserFacade userFacade;
    private final FeedFacade feedFacade;

    @Transactional
    public void execute(Long feedId, UpdateFeedRequest updateFeedRequest) {

        User user = userFacade.getCurrentUser();
        Feed feed = feedFacade.getFeedById(feedId);

        if(!user.equals(feed.getUser())) {
            throw CannotBeModifiedException.EXCEPTION;
        }

        feed.updateFeed(updateFeedRequest.getTitle(),updateFeedRequest.getContent(), updateFeedRequest.getImageUrl());
    }
}
