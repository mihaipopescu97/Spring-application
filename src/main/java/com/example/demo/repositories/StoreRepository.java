package com.example.demo.repositories;

import com.example.demo.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 12/3/2022, Sat
 **/
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
