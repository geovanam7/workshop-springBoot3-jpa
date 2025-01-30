package com.project.course.repositories;

import com.project.course.entities.Category;
import com.project.course.entities.OrderItem;
import com.project.course.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
