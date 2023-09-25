package com.example.demo.repository;

import com.example.demo.entity.ScannedProd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ScanRepository extends JpaRepository<ScannedProd, String > {

    @Query(
            value="Select count(*) from tbl_scan_products where bar_id = ?1 AND user_id =?2 AND is_scanned=1",
            nativeQuery = true)
    public Integer checkIfAlreadyScanned(String barid, String userid);

}
