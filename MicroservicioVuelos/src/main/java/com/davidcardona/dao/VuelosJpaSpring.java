package com.davidcardona.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidcardona.models.Vuelo;

public interface VuelosJpaSpring extends JpaRepository<Vuelo,Integer>{

}
