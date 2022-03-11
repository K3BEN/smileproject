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


public class classe_matiere {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int classe_id;
    private int matiere_id;
}
