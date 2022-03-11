package ci.smile.smileproject.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

//importing required classes

//Annotations
@Entity
@Data
@NoArgsConstructor

public class matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String libelle;
    private int coeff;
    
}
