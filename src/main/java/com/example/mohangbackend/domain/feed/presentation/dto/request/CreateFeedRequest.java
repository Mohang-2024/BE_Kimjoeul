package com.example.mohangbackend.domain.feed.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CreateFeedRequest {

    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String content;

    private String imageUrl;

    private LocalDateTime createdAt;
}
