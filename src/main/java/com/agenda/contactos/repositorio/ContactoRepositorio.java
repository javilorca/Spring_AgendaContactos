package com.agenda.contactos.repositorio;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.agenda.contactos.modelo.Contacto;

public interface ContactoRepositorio  extends JpaRepositoryImplementation<Contacto, Integer>{

}
