package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CharacterSheetModel;
import com.example.demo.repository.CharacterSheetRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/character-sheet")
public class CharacterSheetController {

    @Autowired
    private CharacterSheetRepository characterSheetRepository;

    //@Autowired
    //private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<CharacterSheetModel> createCharacterSheet(@RequestBody CharacterSheetModel characterSheet) {
        CharacterSheetModel newCharacterSheet = characterSheetRepository.save(characterSheet);
        return ResponseEntity.ok(newCharacterSheet);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CharacterSheetModel> findCharacterSheet(@PathVariable Long id) {
        return characterSheetRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    
}
