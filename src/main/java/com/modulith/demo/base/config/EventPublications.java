package com.modulith.demo.base.config;

import lombok.RequiredArgsConstructor;
import org.springframework.modulith.events.CompletedEventPublications;
import org.springframework.modulith.events.IncompleteEventPublications;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@RequiredArgsConstructor
public class EventPublications {
    private final IncompleteEventPublications incompleteEvents;
    private final CompletedEventPublications completeEvents;

    void resubmitUnpublishedEvents() {
        incompleteEvents.resubmitIncompletePublicationsOlderThan(Duration.ofSeconds(10));
    }

    void clearPublishedEvents() {
        completeEvents.deletePublicationsOlderThan(Duration.ofHours(24));
    }
}
