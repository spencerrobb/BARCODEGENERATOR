package com.example.demo.repository;

import com.example.demo.entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

    @Query(
            value="Select * from tbl_purchase_history where product_id = ?1",
            nativeQuery = true)
    public List<PurchaseHistory> fetchHistoryByBarId(String barid);
}
