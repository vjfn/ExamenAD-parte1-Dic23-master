package cesur.examen.core.common;

import cesur.examen.core.worker.Worker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno:Victor Jesus Fernandez Noguer
 * Fecha: 11/12/2023
 *
 * No se permite escribir en consola desde las clases DAO, Service y Utils usando System.out.
 * En su lugar, usa log.info(), log.warning() y log.severe() para mostrar información interna
 * o para seguir la traza de ejecución.
 */


public class FileUtils {

    public static void toCSV(String fileName, List<Worker> workers) {
        /*
        Uncomment and implement body method!...
        */
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Worker worker : workers) {
                // Formato de ejemplo: id, name, dni, from
                // 1 Elena Gómez,8901234567,2022-08-10
                String line = String.format("%d,%s,%s,%tF%n", worker.getId(), worker.getName(), worker.getDni(), worker.getFrom());
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
