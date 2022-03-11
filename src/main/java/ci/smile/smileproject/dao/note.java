package ci.smile.smileproject.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class note {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int matiere_id;
    private double note;
    private int etudiant_id;
}
