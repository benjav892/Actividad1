package com.example.evaluacion1.service;

import com.example.evaluacion1.dto.SolicitudRequest;
import com.example.evaluacion1.model.Solicitud;
import com.example.evaluacion1.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    public Solicitud buscar(int rut){
        return solicitudRepository.buscarPorRut(rut);
    }
    public List<Solicitud> obtener(){
        return solicitudRepository.obtenerSolicitudes();
    }

    public Solicitud registrar(SolicitudRequest dto){
        Solicitud solicitud = new Solicitud();
        solicitud.setRut(dto.getRut());
        solicitud.setNombre(dto.getNombre());
        solicitud.setTipoDeAtencion(dto.getTipoDeAtencion());
        solicitud.setEstadoDelaSolicitud(dto.getEstadoDeLaSolicitud());
        solicitud.setFechaDeRegistro(dto.getFechaDeRegistro());
        solicitud.setNivelDePrioridad(dto.getNivelDePrioridad());
        return solicitudRepository.registrarSolicitud(solicitud);
    }
    public Solicitud modificar(SolicitudRequest dto){
        if(solicitudRepository.buscarPorRut(dto.getRut())==null){
            return null;
        }
        Solicitud solicitud1 = new Solicitud();
        solicitud1.setRut(dto.getRut());
        solicitud1.setNombre(dto.getNombre());
        solicitud1.setTipoDeAtencion(dto.getTipoDeAtencion());
        solicitud1.setEstadoDelaSolicitud(dto.getEstadoDeLaSolicitud());
        solicitud1.setFechaDeRegistro(dto.getFechaDeRegistro());
        solicitud1.setNivelDePrioridad(dto.getNivelDePrioridad());
        return solicitudRepository.modificarSolicitud(solicitud1);
    }
    public boolean eliminar(int rut){
        return solicitudRepository.eliminarSolicitud(rut);

    }




}
