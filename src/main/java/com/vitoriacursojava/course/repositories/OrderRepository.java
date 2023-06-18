package com.vitoriacursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriacursojava.course.entities.Order;

//Mesmo sendo uma interface não precisa implementar, pois o spring data jpa ja tem uma implementação padrão para a interface.
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
