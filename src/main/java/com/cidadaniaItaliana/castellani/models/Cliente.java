package com.cidadaniaItaliana.castellani.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode estar vazio.")
    private String nome;

    @NotBlank(message = "O sobrenome não pode estar vazio.")
    private String sobrenome;

    @Email(message = "O e-mail deve ser válido.")
    @NotBlank(message = "O e-mail não pode estar vazio.")
    private String email;

    @NotNull(message = "A data de nascimento não pode estar vazia.")
    private LocalDate dataNascimento;

    @NotBlank(message = "O nome do antepassado não pode estar vazio.")
    private String nomeAntepassado;

    @NotNull(message = "A data de nascimento do antepassado não pode estar vazia.")
    private LocalDate dataNascimentoAntepassado;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeAntepassado() {
        return nomeAntepassado;
    }

    public void setNomeAntepassado(String nomeAntepassado) {
        this.nomeAntepassado = nomeAntepassado;
    }

    public LocalDate getDataNascimentoAntepassado() {
        return dataNascimentoAntepassado;
    }

    public void setDataNascimentoAntepassado(LocalDate dataNascimentoAntepassado) {
        this.dataNascimentoAntepassado = dataNascimentoAntepassado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nomeAntepassado='" + nomeAntepassado + '\'' +
                ", dataNascimentoAntepassado=" + dataNascimentoAntepassado +
                '}';
    }
}
