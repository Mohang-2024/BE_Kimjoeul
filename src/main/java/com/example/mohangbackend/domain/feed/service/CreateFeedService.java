package com.example.mohangbackend.domain.feed.service;

import com.example.mohangbackend.domain.feed.domain.Feed;
import com.example.mohangbackend.domain.feed.domain.repository.FeedRepository;
import com.example.mohangbackend.domain.feed.presentation.dto.request.CreateFeedRequest;
import com.example.mohangbackend.domain.user.domain.User;
import com.example.mohangbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class CreateFeedService {

    private final FeedRepository feedRepository;
    private final UserFacade userFacade;

    @Transactional
    public void execute(CreateFeedRequest createFeedRequest) {

        User user = userFacade.getCurrentUser();
        Feed feed = feedRepository.save(
                Feed.builder()
                        .id(null)
                        .title(createFeedRequest.getTitle())
                        .content(createFeedRequest.getContent())
                        .imageUrl(createFeedRequest.getImageUrl())
                        .build()
        );
    }
}
