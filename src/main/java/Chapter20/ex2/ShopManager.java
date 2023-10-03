package Chapter20.ex2;

import java.util.Scanner;

public class ShopManager {
    public static void main(String[] args) {
        Order[] orders = createOrders();
        OrderStatus orderStatus = readStatus();
        Order[] filteredOrders = filteredOrdersByStatus(orders, orderStatus);
        printOrders(filteredOrders, orderStatus);
    }


    private static Order[] createOrders () {
        Order[] orders = new Order[5];
        orders[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, OrderStatus.PAID);
        orders[1] = new Order("Telefon Samusng", 2499, OrderStatus.SHIPPED);
        orders[2] = new Order("Apple Iphone XS", 2999, OrderStatus.CANCELLED);
        orders[3] = new Order("Apple Iphone XS", 2999, OrderStatus.CANCELLED);
        orders[4] = new Order("Komputer asdasdasdApple MacBook Pro 2018", 4999, OrderStatus.PAID);
        return orders;
    }

    private static OrderStatus readStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj status zamówień do wyświetlania");
        for (OrderStatus c : OrderStatus.values()){
            System.out.println(c.name() + "");
        }

        String status = scanner.nextLine();
        return OrderStatus.valueOf(status);
    }

    private static Order[] filteredOrdersByStatus(Order[]orders, OrderStatus orderStatus){
        int size = countOrderByStatus(orders, orderStatus);
        Order[] orderByStatus = new Order[size];
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == orderStatus) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
        return orderByStatus;
    }

    private static int countOrderByStatus(Order[] orders, OrderStatus orderStatus){
        int count = 0;
        for (Order order: orders) {
            if (order.getStatus() == orderStatus)
                count++;
        }
        return count;
    }

    private static void printOrders (Order[] filteredOrders, OrderStatus orderStatus){
        System.out.println("Lista zamówień ze statusem " + orderStatus);
        for (Order order: filteredOrders) {
            System.out.println(order);
        }
    }
}
