package com.example.appbient_microservice_usuarios.api.domain.service;

import com.example.appbient_microservice_usuarios.api.domain.model.entity.Voluntario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VoluntarioService {
    List<Voluntario> getAll();
    Voluntario getById(Long id);
    Voluntario create(Voluntario request);
    Voluntario update(Long id, Voluntario request);
    ResponseEntity<?> delete(Long Voluntarioid);
}
