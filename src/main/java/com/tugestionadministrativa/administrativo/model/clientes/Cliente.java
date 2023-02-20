package com.tugestionadministrativa.administrativo.model.clientes;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import com.tugestionadministrativa.administrativo.model.embebido.*;

import lombok.*;
 
@Entity  // Esto marca la clase Cliente como una entidad
@Getter @Setter // Esto hace los campos a continuación públicamente accesibles
@View(name="Simple", // Esta vista solo se usará cuando se especifique “Simple”
members="numero, nombredelcliente" // Muestra únicamente numero y nombre en la misma línea
)
public class Cliente {
 
    @Id  // La propiedad numero es la clave.  Las claves son obligatorias (required) por defecto
    @Column(length=6)  // La longitud de columna se usa a nivel UI y a nivel DB
    int numero;
 
    @Column(length=150) // La longitud de columna se usa a nivel UI y a nivel DB
    @Required  // Se mostrará un error de validación si la propiedad nombre se deja en blanco
    String nombredelcliente;
    
    @Embedded // Así para referenciar a una clase incrustable
    Direccion direccionfiscal; // Una referencia Java convencional
 
    @Embedded // Así para referenciar a una clase incrustable
    DatosDeContacto datosdecontacto; // Una referencia Java convencional
   
    @Embedded // Así para referenciar a una clase incrustable
    Vendedores grupodevendedores; // Una referencia Java convencional
    
    @Embedded // Así para referenciar a una clase incrustable
    RedesSociales redessociales; // Una referencia Java convencional
    
    @Embedded // Así para referenciar a una clase incrustable
    OtrosAtributos otrosatributos; // Una referencia Java convencional
    
   
}