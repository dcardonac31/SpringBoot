package com.davidcardona.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidcardona.models.Hotel;

public interface HotelesJpaSpring extends JpaRepository<Hotel,Integer>{

}
