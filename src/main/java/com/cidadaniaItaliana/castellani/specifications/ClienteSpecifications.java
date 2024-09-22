package com.cidadaniaItaliana.castellani.specifications;

import com.cidadaniaItaliana.castellani.models.Cliente;
import org.springframework.data.jpa.domain.Specification;

public class ClienteSpecifications {
    public static Specification<Cliente> nomeContains(String nome) {
        return (root, query, criteriaBuilder) -> {
            if (nome == null || nome.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
        };
    }

    public static Specification<Cliente> sobrenomeContains(String sobrenome) {
        return (root, query, criteriaBuilder) -> {
            if (sobrenome == null || sobrenome.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.like(root.get("sobrenome"), "%" + sobrenome + "%");
        };
    }
}
