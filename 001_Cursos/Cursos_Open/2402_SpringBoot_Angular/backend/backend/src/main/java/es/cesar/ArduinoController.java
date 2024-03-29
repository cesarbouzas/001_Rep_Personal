package es.cesar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/distancias")
public class ArduinoController {

    private final DistanciaService arduinoService;

    @Autowired
    public ArduinoController(DistanciaService arduinoService) {
        this.arduinoService = arduinoService;
    }

    @GetMapping
    public List<Distancia> getAllArduino() {
        return arduinoService.getAllArduino();
    }

    @GetMapping("/{id}")
    public Distancia getArduinoById(@PathVariable Long id) {
        return arduinoService.getArduinoById(id)
                .orElse(null); // Handle not found case
    }

    @PostMapping
    public Distancia createArduino(@RequestBody Distancia arduino) {
        return arduinoService.createArduino(arduino);
    }

    @PutMapping("/{id}")
    public Distancia updateArduino(@PathVariable Long id, @RequestBody Distancia updatedArduino) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteArduino(@PathVariable Long id) {
        arduinoService.deleteArduino(id);
    }
}