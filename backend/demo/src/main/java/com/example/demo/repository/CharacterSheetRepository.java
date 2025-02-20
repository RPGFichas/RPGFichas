package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CharacterSheetModel;
import com.example.demo.model.UserModel;

@Repository
public interface CharacterSheetRepository extends JpaRepository<CharacterSheetModel, Long> {
    List<CharacterSheetModel> findByUsername(UserModel username);
    
}
