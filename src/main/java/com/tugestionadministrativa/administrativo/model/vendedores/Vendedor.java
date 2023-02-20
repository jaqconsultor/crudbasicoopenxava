package com.tugestionadministrativa.administrativo.model.vendedores;
 
import javax.persistence.*;

import com.tugestionadministrativa.administrativo.model.*;
import com.tugestionadministrativa.administrativo.model.embebido.*;

import lombok.*;
 
@Entity  // Esto marca la clase Cliente como una entidad
@Getter @Setter // Esto hace los campos a continuación públicamente accesibles

public class Vendedor  extends Identificable2 {
/* 
    @Id  // La propiedad numero es la clave.  Las claves son obligatorias (required) por defecto
    @Column(length=6)  // La longitud de columna se usa a nivel UI y a nivel DB
    int numero;
 */
   
    @Embedded // Así para referenciar a una clase incrustable
    DatosDeContacto datosdecontacto; // Una referencia Java convencional
   
    @Embedded // Así para referenciar a una clase incrustable
    RedesSociales redessociales; // Una referencia Java convencional
    
}