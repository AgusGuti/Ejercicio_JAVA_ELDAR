package com.example.restservice;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Operacion;

interface OperacionRepository extends JpaRepository<Operacion, Long> {

}

