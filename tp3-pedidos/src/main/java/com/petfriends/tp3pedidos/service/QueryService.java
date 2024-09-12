package com.petfriends.tp3pedidos.service;

import com.petfriends.tp3pedidos.entity.Pedido;
import com.petfriends.tp3pedidos.event.BaseEvent;
import com.petfriends.tp3pedidos.repository.EventStoreRepository;
import com.petfriends.tp3pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class QueryService {

    private final EventStoreRepository eventStoreRepository;
    private final PedidoRepository pedidoRepository; 

    
    public QueryService(EventStoreRepository eventStoreRepository, PedidoRepository pedidoRepository) {
        this.eventStoreRepository = eventStoreRepository;
        this.pedidoRepository = pedidoRepository;  
    }

    
    public List<BaseEvent> getEventsByPedidoId(UUID pedidoId) {
        return eventStoreRepository.findEventsByEntityId(pedidoId);
    }

  
    public List<BaseEvent> getAllEvents() {
        return eventStoreRepository.findAllEvents();
    }

    
    public Pedido getPedidoById(Long pedidoId) {
        return pedidoRepository.findById(pedidoId)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com ID: " + pedidoId));
    }
}