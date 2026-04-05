package com.example.evaluacion1.repository;

import com.example.evaluacion1.model.Solicitud;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SolicitudRepository {
   private List<Solicitud> listaSolicitudes = new ArrayList<>();

   public Solicitud buscarPorRut(int rut){  
       for(Solicitud solicitud: listaSolicitudes){
           if(solicitud.getRut()==rut){
               return solicitud;
           }
       }
       return null;
   }
   public List<Solicitud> obtenerSolicitudes(){  
       return listaSolicitudes;
   }

   public Solicitud registrarSolicitud(Solicitud solicitud){
       if(buscarPorRut(solicitud.getRut())==null){
            listaSolicitudes.add(solicitud);
            return solicitud;
       }
       return null;
   }

   public Solicitud modificarSolicitud(Solicitud solicitud){
       for(int i=0; i<listaSolicitudes.size();i++){
           if(listaSolicitudes.get(i).getRut()==solicitud.getRut()){
               listaSolicitudes.set(i,solicitud);
               return solicitud;
           }

       }
       return null;
   }


   public boolean eliminarSolicitud(int rut){
       return listaSolicitudes.removeIf(x-> x.getRut()==rut);
   }

}
