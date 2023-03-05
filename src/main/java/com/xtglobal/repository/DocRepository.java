package com.xtglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtglobal.model.Doc;


@Repository
public interface DocRepository extends JpaRepository<Doc, Integer> {

}
