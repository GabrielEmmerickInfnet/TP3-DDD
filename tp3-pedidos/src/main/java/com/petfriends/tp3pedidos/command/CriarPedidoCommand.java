package com.petfriends.tp3pedidos.command;

public class CriarPedidoCommand extends BaseCommand {

    private final Long pedidoId;
    private final String cliente;

    public CriarPedidoCommand(Long pedidoId, String cliente) {
        super();
        this.pedidoId = pedidoId;
        this.cliente = cliente;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String getCommandType() {
        return "CriarPedido";
    }
}
