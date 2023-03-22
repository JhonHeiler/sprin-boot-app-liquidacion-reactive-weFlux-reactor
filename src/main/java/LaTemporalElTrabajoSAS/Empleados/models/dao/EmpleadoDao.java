package LaTemporalElTrabajoSAS.Empleados.models.dao;

import LaTemporalElTrabajoSAS.Empleados.models.document.Empleado;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmpleadoDao extends ReactiveMongoRepository<Empleado, String> {


}
