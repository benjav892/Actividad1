package com.example.evaluacion1.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SolicitudRequest {

    @NotNull(message = "El rut no puede estar vacio")
    private int rut;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El tipo de atencion no puede estar vacio")
    private String tipoDeAtencion;

    @NotBlank(message = "El estado de la solicitud no puede estar vacio")
    private String estadoDeLaSolicitud;

    @NotBlank(message = "La fecha de registro no puede estar vacia")
    private String fechaDeRegistro;

    @NotBlank(message = "El nivel de prioridad no puede estar vacio")
    private String nivelDePrioridad;

}
