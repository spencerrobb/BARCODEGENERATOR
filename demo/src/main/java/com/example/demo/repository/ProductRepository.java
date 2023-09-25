package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {
    public Product findByBarid(String barid);

    @Query(
            value = "Select count(bar_id) from tbl_product where bar_id = ?1",
            nativeQuery = true)
    public Integer countById(String barid);



}
