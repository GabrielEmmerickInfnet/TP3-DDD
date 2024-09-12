package com.petfriends.tp3pedidos.event;

public class PedidoAtualizadoEvent extends BaseEvent {

    private final Long pedidoId;
    private final String cliente;
    private final String status;

    public PedidoAtualizadoEvent(Long pedidoId, String cliente, String status) {
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
    public String getEventType() {
        return "PedidoAtualizado";
    }
}
