package com.honstain.netflux.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Movie {
    private String id;

    @NonNull
    private String title;

    public Movie(String id, @NonNull String title) {
        this.id = id;
        this.title = title;
    }
}
