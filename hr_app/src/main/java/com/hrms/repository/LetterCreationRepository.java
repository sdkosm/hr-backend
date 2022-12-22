package com.hrms.repository;

import com.hrms.model.LetterCreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LetterCreationRepository  extends JpaRepository<LetterCreation , Integer> {

    @Query("select p from LetterCreation  p where p.created_by like :key")
    List<LetterCreation> searchBycreated_By (@Param("key") Integer created_by);
}
