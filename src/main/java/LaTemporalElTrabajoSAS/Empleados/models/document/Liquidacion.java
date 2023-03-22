package LaTemporalElTrabajoSAS.Empleados.models.document;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class Liquidacion {
    private Double prima;
    private Double  cesantias;
    private Double interesCentias;
    private Double vacaciones;
    private Double totalLiquidacion;

    public Mono<EmpleadoLiquidado> liquidarEmpleado(Empleado empleado){
        this.prima = ((empleado.getSalario() + empleado.getAuxilioTransporte()) * empleado.getDiasLaborados()) / 360;
        this.cesantias = (empleado.getSalario() * empleado.getDiasLaborados())/ 360;
        this.interesCentias = (cesantias * 0.12) / empleado.getDiasLaborados();
        this.vacaciones = (empleado.getSalario() * empleado.getDiasLaborados()) / 720;
        this.totalLiquidacion = prima + cesantias + interesCentias + vacaciones;
        return Mono.just(new EmpleadoLiquidado(empleado.getNombre(), empleado.getApellido(),
                empleado.getSalario(), empleado.getAuxilioTransporte(),
                empleado.getDiasLaborados(),this.prima,this.cesantias,this.interesCentias,this.vacaciones,this.totalLiquidacion));
    }

    public Flux<EmpleadoLiquidado> ordenarPorLiquidacion(Flux<EmpleadoLiquidado> empleadoLiquidados){
        return empleadoLiquidados.sort((x, y) -> (int) (x.getTotalLiquidacion() + y.getTotalLiquidacion()));
    }

}
