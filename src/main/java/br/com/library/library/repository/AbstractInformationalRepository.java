package br.com.library.library.repository;

import br.com.library.library.entity.AbstractInformational;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractInformationalRepository extends JpaRepository<AbstractInformational, Long> {
}
