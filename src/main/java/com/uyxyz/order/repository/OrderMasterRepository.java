package com.uyxyz.order.repository;

import com.uyxyz.order.dataobj.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
