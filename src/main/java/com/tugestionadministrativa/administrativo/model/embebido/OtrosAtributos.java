package com.tugestionadministrativa.administrativo.model.embebido;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import com.tugestionadministrativa.administrativo.model.tablas.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class OtrosAtributos {
 	
    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=true) // La referencia puede estar sin valor
    @DescriptionsList // Así la referencia se visualiza usando un combo
    TipoDeCliente tipodecliente;

    boolean exentodeimpuesto;
    
    boolean contribuyenteespecial;
    
}