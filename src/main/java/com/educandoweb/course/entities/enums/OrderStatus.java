package com.educandoweb.course.entities.enums;

/**
 * Enumeração que representa os diferentes estados de um pedido.
 */
public enum OrderStatus {
    /**
     * Estado de pedido aguardando pagamento.
     */
    WAITING_PAYMENT(1),
    /**
     * Estado de pedido pago.
     */
    PAID(2),
    /**
     * Estado de pedido enviado.
     */
    SHIPPED(3),
    /**
     * Estado de pedido entregue.
     */
    DELIVERED(4),
    /**
     * Estado de pedido cancelado.
     */
    CANCELED(5);

    /**
     * Código numérico associado ao estado do pedido.
     */
    private int code;

    /**
     * Construtor que inicializa o código do estado do pedido.
     * @param code código numérico do estado do pedido.
     */
    private OrderStatus(int code) {
        this.code = code;
    }

    /**
     * Obtém o código numérico do estado do pedido.
     * @return código numérico do estado do pedido.
     */
    public int getCode() {
        return code;
    }

    /**
     * Obtém o estado do pedido correspondente ao código numérico fornecido.
     * @param code código numérico do estado do pedido.
     * @return estado do pedido correspondente.
     * @throws IllegalArgumentException se o código fornecido não é válido.
     */
    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return  value;
            }
        }
        throw new IllegalArgumentException("Invalid OrdesStatus code");
    }
}