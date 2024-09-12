package com.petfriends.tp3pedidos.aggregate;

import com.petfriends.tp3pedidos.command.AtualizarPedidoCommand;
import com.petfriends.tp3pedidos.event.PedidoAtualizadoEvent;
import com.petfriends.tp3pedidos.event.PedidoCriadoEvent;
import org.springframework.stereotype.Component;

@Component
public class PedidoAggregate {

    private Long pedidoId;
    private String cliente;
    private String status;

  
    public PedidoAtualizadoEvent handle(AtualizarPedidoCommand command) {
        this.pedidoId = command.getPedidoId();
        this.cliente = command.getCliente();
        this.status = command.getStatus();

        return new PedidoAtualizadoEvent(this.pedidoId, this.cliente, this.status);
    }

    
    public void apply(PedidoCriadoEvent event) {
        this.pedidoId = event.getPedidoId();
        this.cliente = event.getCliente();
        this.status = "Criado";
    }

   
}
