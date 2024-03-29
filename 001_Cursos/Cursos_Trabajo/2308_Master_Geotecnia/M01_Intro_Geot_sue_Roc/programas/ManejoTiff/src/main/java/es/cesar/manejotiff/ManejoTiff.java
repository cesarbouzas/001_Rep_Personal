
package es.cesar.manejotiff;

import io.pdal.Pdal;
import io.pdal.pipeline.Pipeline;



public class ManejoTiff {

    public static void main(String[] args) {
        try {
            // Inicializa PDAL
            Pdal.all();

            // Crea una tubería PDAL
            Pipeline pipeline = new Pipeline();
            pipeline.setInput("path/to/your/lidar_file.tif");

            // Ejecuta la tubería
            pipeline.execute();

            // Accede a los resultados (puedes procesar o visualizar los datos según tus necesidades)
            // Por ejemplo, puedes obtener las dimensiones de los puntos
            int pointCount = pipeline.getReader().getHeader().getPointCount();
            System.out.println("Número de puntos LiDAR: " + pointCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}