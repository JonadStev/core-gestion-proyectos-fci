package com.istartDigital.security.repository;

import com.istartDigital.security.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String nombreUsuario);
    boolean existsByEmail(String email);

    List<Usuario> findByEstado(String estado);

    Optional<Usuario> findByCedula(String cedula);
}
