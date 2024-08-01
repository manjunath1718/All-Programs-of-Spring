package com.telusko.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

    @Query("SELECT Count(*) FROM Vaccine")
    public int getVaccinesCount();

}
