package com.example.mohangbackend.domain.feed.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Getter
@NoArgsConstructor
public class UpdateFeedRequest {

    @NotNull
    private String title;

    @NotNull
    private String content;

    private String imageUrl;
}
