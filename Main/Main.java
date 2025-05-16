// Importa classes necessárias
import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Main {

    public static void main(String[] args) {

        // Cria um novo pedido (Order) com id 1080, data atual e status PENDING_PAYMENT
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        // Exibe os dados do pedido no console (usa o método toString da classe Order)
        System.out.println(order);

        // Atribui diretamente uma constante do enum OrderStatus
        OrderStatus os1 = OrderStatus.DELIVERED;

        // Converte uma String ("DELIVERED") em uma constante do enum OrderStatus
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        // Exibe os dois status no console
        System.out.println(os1);
        System.out.println(os2);
    }
}
