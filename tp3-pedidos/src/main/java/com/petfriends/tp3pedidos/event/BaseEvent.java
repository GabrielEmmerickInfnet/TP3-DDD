package com.petfriends.tp3pedidos.event;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEvent {

    private final UUID id;
    private final LocalDateTime createdAt;

    public BaseEvent() {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public abstract String getEventType();
}
