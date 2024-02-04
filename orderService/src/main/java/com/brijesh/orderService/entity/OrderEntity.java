package com.brijesh.orderService.entity;import com.brijesh.orderService.model.OrderStatus;import com.brijesh.orderService.model.PaymentMode;import jakarta.persistence.*;import lombok.*;import java.time.Instant;@Entity@Getter@Setter@ToString@Builder@NoArgsConstructor@AllArgsConstructor@Table(name = "order_details")public class OrderEntity {    @Id    @GeneratedValue(strategy = GenerationType.AUTO)    private long id;    private long productId;    private long quantity;    private Instant orderDate;    private OrderStatus orderStatus;    private double totalAmount;    private PaymentMode mode;}