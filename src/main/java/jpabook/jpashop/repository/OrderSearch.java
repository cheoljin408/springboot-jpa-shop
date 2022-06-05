package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EntityManager;
import java.util.List;

@Getter
@Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;
}
