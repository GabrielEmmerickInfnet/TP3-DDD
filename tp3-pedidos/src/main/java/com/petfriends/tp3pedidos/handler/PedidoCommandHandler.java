package com.petfriends.tp3pedidos.handler;

import com.petfriends.tp3pedidos.command.AtualizarPedidoCommand;
import com.petfriends.tp3pedidos.event.PedidoAtualizadoEvent;
import org.springframework.stereotype.Service;

@Service
public class PedidoCommandHandler {

    
    public PedidoAtualizadoEvent handle(AtualizarPedidoCommand command) {
        PedidoAtualizadoEvent event = new PedidoAtualizadoEvent(command.getPedidoId(), command.getCliente(), command.getStatus());
        System.out.println("Evento persistido: " + event.getEventType() + " para o pedido ID " + command.getPedidoId());
        return event;
    }
}
