package com.petfriends.tp3pedidos.command;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseCommand {

    private final UUID id;
    private final LocalDateTime createdAt;

    public BaseCommand() {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public abstract String getCommandType();
}
