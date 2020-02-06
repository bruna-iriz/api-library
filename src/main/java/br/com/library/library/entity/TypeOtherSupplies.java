package br.com.library.library.entity;

import br.com.library.library.entity.enums.NameOtherSupplies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Entity
@Table(name = "type_other_supplies")
@NoArgsConstructor
@AllArgsConstructor
public class TypeOtherSupplies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private NameOtherSupplies name;
    @Embedded
    private OtherSupplies otherSupplies;
}
