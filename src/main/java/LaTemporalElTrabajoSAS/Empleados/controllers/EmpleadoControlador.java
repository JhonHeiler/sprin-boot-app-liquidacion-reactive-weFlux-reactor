package LaTemporalElTrabajoSAS.Empleados.controllers;

import LaTemporalElTrabajoSAS.Empleados.models.document.Empleado;
import LaTemporalElTrabajoSAS.Empleados.models.document.EmpleadoLiquidado;
import LaTemporalElTrabajoSAS.Empleados.models.document.Liquidacion;
import LaTemporalElTrabajoSAS.Empleados.models.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/api/empleados")
public class EmpleadoControlador {
    @Autowired
    private EmpleadoService service;

    private Liquidacion liquidacion = new Liquidacion();



    @GetMapping
    public Flux<EmpleadoLiquidado> lista(){

        return liquidacion.ordenarPorLiquidacion(
                service.obtenerempleados()
                        .flatMap(liquidacion::liquidarEmpleado)
                );
    }
}
