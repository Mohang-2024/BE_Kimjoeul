package com.example.mohangbackend.domain.feed.presentation;

import com.example.mohangbackend.domain.feed.presentation.dto.request.CreateFeedRequest;
import com.example.mohangbackend.domain.feed.presentation.dto.request.UpdateFeedRequest;
import com.example.mohangbackend.domain.feed.service.CreateFeedService;
import com.example.mohangbackend.domain.feed.service.DeleteFeedService;
import com.example.mohangbackend.domain.feed.service.UpdateFeedService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/feeds")
@RestController
public class FeedController {

    private final DeleteFeedService deleteFeedService;
    private final UpdateFeedService updateFeedService;
    private final CreateFeedService createFeedService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createFeed(@RequestBody @Validated CreateFeedRequest createFeedRequest) {
        createFeedService.execute(createFeedRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{feed-id}")
    public void deleteFeed(@PathVariable("feed-id") Long feedId) {
        deleteFeedService.execute(feedId);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{feed-id}")
    public void updateFeed(@PathVariable("feed-id") Long feedId,
                           @RequestBody @Validated UpdateFeedRequest updateFeedRequest) {
        updateFeedService.execute(feedId, updateFeedRequest);
    }

}
