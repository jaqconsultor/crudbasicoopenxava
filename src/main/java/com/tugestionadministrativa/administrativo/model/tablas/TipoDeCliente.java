package com.tugestionadministrativa.administrativo.model.tablas;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import com.tugestionadministrativa.administrativo.model.*;

import lombok.*;

@Entity @Getter @Setter
public class TipoDeCliente extends Identificable2 {
 

    @Column(length=20) // La longitud de columna se usa a nivel UI y a nivel DB
    @Required  // Se mostrar� un error de validaci�n si la propiedad nombre se deja en blanco
    String nemotecnico;
    
}





