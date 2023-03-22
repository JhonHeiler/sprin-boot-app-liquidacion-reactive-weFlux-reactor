package LaTemporalElTrabajoSAS.Empleados.models.service;

import LaTemporalElTrabajoSAS.Empleados.models.dao.EmpleadoDao;
import LaTemporalElTrabajoSAS.Empleados.models.document.Empleado;
import LaTemporalElTrabajoSAS.Empleados.models.document.EmpleadoLiquidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao dao;

    @Override
    public Flux<Empleado> obtenerempleados() {
        return dao.findAll();
    }
}
