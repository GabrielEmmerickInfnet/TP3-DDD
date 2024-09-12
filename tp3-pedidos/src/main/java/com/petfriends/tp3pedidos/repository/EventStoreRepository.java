package com.petfriends.tp3pedidos.repository;

import com.petfriends.tp3pedidos.event.BaseEvent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class EventStoreRepository {

    
    private final List<BaseEvent> eventStore = new ArrayList<>();

    
    public void saveEvent(BaseEvent event) {
        eventStore.add(event);
    }

    
    public List<BaseEvent> findEventsByEntityId(UUID entityId) {
        return eventStore.stream()
                .filter(event -> event.getId().equals(entityId))
                .collect(Collectors.toList());
    }

    
    public List<BaseEvent> findAllEvents() {
        return new ArrayList<>(eventStore);
    }
}
