package com.hrms.controller;

import com.hrms.exception.ResourceNotFoundException;
import com.hrms.model.LetterCreation;
import com.hrms.repository.LetterCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api/v1")
public class LetterCreationController {

    @Autowired
    private LetterCreationRepository letterCreationRepository;

    //get all samples
//		@GetMapping("getOfferLetterDetails/")
//		public List<LetterCreation> getAllLetters(){
//			return 	letterCreationRepository.findAll();
//		}

    //create new sample
    @PostMapping("/postletter_creation")
    public LetterCreation createLetter(@RequestBody LetterCreation letter) {
        return letterCreationRepository.save( letter);
    }

    //get sample by id
    @GetMapping("/getletter_creationById/{id}")
    public ResponseEntity<LetterCreation> getLetterById(@PathVariable Integer id) {
        LetterCreation  letter = letterCreationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not  exist with id:" + id));
        return ResponseEntity.ok( letter);
    }

    //get details by created_by

    @GetMapping("/getOfferLetterDetails/")
    public List<LetterCreation> getOfferLetterInfoByCreated_By(@RequestParam(name="createdby",required = false ) Integer createdby){
//			List<LetterCreation> letter=this.letterCreationRepository.searchBycreated_By(createdby);
        if(createdby!=null) {
            return letterCreationRepository.searchBycreated_By(createdby);
        }
        else {
            return letterCreationRepository.findAll();

        }

    }


    //update sample rest api
    @PutMapping("/updateletter_creation/{id}")
    public ResponseEntity<LetterCreation> updateLetter(@PathVariable Integer id,@RequestBody  LetterCreation letterDetails){
        LetterCreation  letter = letterCreationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not  exist with id:" + id));

        letter.setRole_id(letterDetails.getRole_id());
        letter.setName(letterDetails.getName());
        letter.setEmail_id(letterDetails.getEmail_id());
        letter.setMobile_no(letterDetails.getMobile_no());
        letter.setIssued_date(letterDetails.getIssued_date());
        letter.setJoining_date(letterDetails.getJoining_date());
        letter.setCtc(letterDetails.getCtc());
        letter.setVariable_percentage(letterDetails.getVariable_percentage());
        letter.setCreated_by(letterDetails.getCreated_by());
        letter.setCreated_date(letterDetails.getCreated_date());
        letter.setDesignation_id(letterDetails.getDesignation_id());
        letter.setAddress(letterDetails.getAddress());

        LetterCreation updateLetter = letterCreationRepository.save(letter);
        return ResponseEntity.ok(updateLetter);
    }

    //delete sample rest api
    @DeleteMapping("/deleteletter_creation/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteLetter(@PathVariable Integer id){
        LetterCreation letter = letterCreationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not  exist with id:" + id));

        letterCreationRepository.delete(letter);
        Map<String , Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
