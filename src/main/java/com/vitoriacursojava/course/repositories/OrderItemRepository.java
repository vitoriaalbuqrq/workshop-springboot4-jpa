package com.vitoriacursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriacursojava.course.entities.OrderItem;

//Mesmo sendo uma interface não precisa implementar, pois o spring data jpa ja tem uma implementação padrão para a interface.
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
