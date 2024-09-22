package com.cidadaniaItaliana.castellani.repositories;

import com.cidadaniaItaliana.castellani.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {
    List<Cliente> findByNome(String nome);

    List<Cliente> findBySobrenome(String sobrenome);
}
