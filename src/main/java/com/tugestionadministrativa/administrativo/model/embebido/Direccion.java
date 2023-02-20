package com.tugestionadministrativa.administrativo.model.embebido;
 
import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class Direccion {
 
    @Column(length = 255) // Los miembros se anotan igual que en las entidades
    String razonsocial;
 
    @Column(length = 25) // Los miembros se anotan igual que en las entidades
    String rif;

    @Column(length = 25) // Los miembros se anotan igual que en las entidades
    String nit;
    
    @Column(length = 255)
    String direccion1;
 
    @Column(length = 255)
    String direccion2;
 
    @Column(length = 50)
    Long telefono1;
 
    @Column(length = 50)
    Long telefono2;
    
    @Column(length = 50)
    Long celular1;

    @Column(length = 50)
    Long celular2;
    
}