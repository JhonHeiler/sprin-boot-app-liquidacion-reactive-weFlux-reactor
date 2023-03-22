package LaTemporalElTrabajoSAS.Empleados.models.service;

import LaTemporalElTrabajoSAS.Empleados.models.document.Empleado;
import LaTemporalElTrabajoSAS.Empleados.models.document.EmpleadoLiquidado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpleadoService {

    Flux<Empleado> obtenerempleados();
}
