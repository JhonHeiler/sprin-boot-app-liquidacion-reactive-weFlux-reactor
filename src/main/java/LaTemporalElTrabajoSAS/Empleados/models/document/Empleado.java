package LaTemporalElTrabajoSAS.Empleados.models.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "empleados")
@Data
public class Empleado {
   @Id
   private String id ;
   private String nombre ;
   private String  apellido;
   private Double salario;
   private Double  auxilioTransporte;
   private Integer diasLaborados;

}
