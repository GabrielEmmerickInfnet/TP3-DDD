package com.petfriends.tp3pedidos.service;

import com.petfriends.tp3pedidos.entity.Pedido;
import com.petfriends.tp3pedidos.repository.PedidoRepository;
import com.petfriends.tp3pedidos.command.AtualizarPedidoCommand;
import com.petfriends.tp3pedidos.event.PedidoAtualizadoEvent;
import com.petfriends.tp3pedidos.event.PedidoCriadoEvent;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    private final PedidoRepository pedidoRepository;

    public CommandService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    
    public void criarPedido(Long pedidoId, String cliente) {
        Pedido novoPedido = new Pedido(pedidoId, cliente, "Criado");
        pedidoRepository.save(novoPedido); 
        System.out.println("Pedido criado e salvo no banco de dados.");
    }

   
    public PedidoAtualizadoEvent executarAtualizacaoPedido(AtualizarPedidoCommand command) {
        
        Pedido pedido = pedidoRepository.findById(command.getPedidoId())
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        pedido.setStatus(command.getStatus());
        pedido.setCliente(command.getCliente());
        pedidoRepository.save(pedido);  
        return new PedidoAtualizadoEvent(pedido.getPedidoId(), pedido.getCliente(), pedido.getStatus());
    }


	public void executarAtualizacaoPedido(Long pedidoId, String cliente, String status) {
		
		
	}
}
