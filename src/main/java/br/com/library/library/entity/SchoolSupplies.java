package br.com.library.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "school_supplies")
@NoArgsConstructor
@AllArgsConstructor
public class SchoolSupplies implements Serializable {
    private String description;
}
