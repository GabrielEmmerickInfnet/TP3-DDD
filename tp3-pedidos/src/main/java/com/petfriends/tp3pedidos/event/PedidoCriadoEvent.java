package com.petfriends.tp3pedidos.event;

public class PedidoCriadoEvent extends BaseEvent {

    private final Long pedidoId;
    private final String cliente;

    public PedidoCriadoEvent(Long pedidoId, String cliente) {
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
    public String getEventType() {
        return "PedidoCriado";
    }
}
