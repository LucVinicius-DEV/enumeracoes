package entities;

import java.util.Date;
import entities.enums.OrderStatus;

public class Order {

  // Atributos da classe
  private Integer id;         // Identificador do pedido
  private Date moment;        // Data/hora do pedido
  private OrderStatus status; // Status atual do pedido (usando enum)

  // Construtor padrão (vazio)
  public Order() {
  }

  // Construtor com parâmetros
  public Order(Integer id, Date moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  // Métodos getters e setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  // Sobrescreve toString() para exibir os dados do pedido formatados
  @Override
  public String toString() {
    return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
  }
}
