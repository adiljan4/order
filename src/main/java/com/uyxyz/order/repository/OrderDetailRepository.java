package com.uyxyz.order.repository;

import com.uyxyz.order.dataobj.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
