package com.tugestionadministrativa.administrativo.model.embebido;
 
import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class RedesSociales {
 
    @Column(length = 150) // Los miembros se anotan igual que en las entidades
    String pagina_web;

    @Column(length = 150)
    String correo_principal;
    
    @Column(length = 150)
    String canal_youtube;

    @Column(length = 150)
    String instagram;
 
    @Column(length = 150)
    String twitter;
 
    @Column(length = 150)
    String skype;

    @Column(length = 150)
    String telegram;
    
    @Column(length = 150)
    String whassapt;
    
}