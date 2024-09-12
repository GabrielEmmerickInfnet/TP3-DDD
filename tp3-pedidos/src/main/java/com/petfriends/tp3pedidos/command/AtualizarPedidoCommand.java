package com.petfriends.tp3pedidos.command;

public class AtualizarPedidoCommand extends BaseCommand {

    private final Long pedidoId;
    private final String cliente;
    private final String status;

    public AtualizarPedidoCommand(Long pedidoId, String cliente, String status) {
        super();
        this.pedidoId = pedidoId;
        this.cliente = cliente;
        this.status = status;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public String getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String getCommandType() {
        return "AtualizarPedido";
    }
}
