package com.petfriends.tp3pedidos.controller;

import com.petfriends.tp3pedidos.entity.Pedido;
import com.petfriends.tp3pedidos.event.BaseEvent;
import com.petfriends.tp3pedidos.service.QueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class PedidoQueryController {

    private final QueryService queryService;

    public PedidoQueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    
    @GetMapping("/eventos/pedido/{pedidoId}")
    public List<BaseEvent> getEventosPorPedido(@PathVariable UUID pedidoId) {
        return queryService.getEventsByPedidoId(pedidoId);
    }

    
    @GetMapping("/pedido/{pedidoId}")
    public Pedido getPedidoById(@PathVariable Long pedidoId) {
        return queryService.getPedidoById(pedidoId);
    }
}
