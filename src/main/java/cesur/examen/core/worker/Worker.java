package cesur.examen.core.worker;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno:Victor Jesus Fernandez Noguer
 * Fecha: 11/12/2023
 */
@Data
public class Worker implements Serializable {

    private Long id;
    private String name;
    private String dni;
    private Date from;

}
