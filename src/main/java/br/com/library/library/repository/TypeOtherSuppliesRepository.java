package br.com.library.library.repository;

import br.com.library.library.entity.TypeOtherSupplies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOtherSuppliesRepository extends JpaRepository<TypeOtherSupplies, Long> {
}
