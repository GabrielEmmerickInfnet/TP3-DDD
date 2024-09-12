package com.petfriends.tp3pedidos.controller;

import com.petfriends.tp3pedidos.command.AtualizarPedidoCommand;
import com.petfriends.tp3pedidos.event.PedidoAtualizadoEvent;
import com.petfriends.tp3pedidos.service.CommandService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    private final CommandService commandService;

    public PedidoController(CommandService commandService) {
        this.commandService = commandService;
    }

    
    @PostMapping("/pedido/atualizar")
    public PedidoAtualizadoEvent atualizarPedido(
            @RequestParam Long pedidoId,
            @RequestParam String cliente,
            @RequestParam String status) {
        
        
        AtualizarPedidoCommand command = new AtualizarPedidoCommand(pedidoId, cliente, status);
        
        
        return commandService.executarAtualizacaoPedido(command);
    }


}
