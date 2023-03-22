package LaTemporalElTrabajoSAS.Empleados.models.document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class EmpleadoLiquidado {
    private String nombre ;
    private String  apellido;
    private Double salario;
    private Double  auxilioTransporte;
    private Integer diasLaborados;
    private Double prima;
    private Double  cesantias;
    private Double interesCentias;
    private Double vacaciones;
    private Double totalLiquidacion;

}
