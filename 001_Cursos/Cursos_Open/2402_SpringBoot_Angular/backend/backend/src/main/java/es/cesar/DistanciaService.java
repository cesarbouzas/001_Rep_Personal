package es.cesar;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


	@Service
	public class DistanciaService {

	    private final DistanciaRepository arduinoRepository;


	    public DistanciaService(DistanciaRepository arduinoRepository) {
	        this.arduinoRepository = arduinoRepository;
	    }

	    public List<Distancia> getAllArduino() {
	        return arduinoRepository.findAll();
	    }

	    public Optional<Distancia> getArduinoById(Long id) {
	        return arduinoRepository.findById(id);
	    }

	    public Distancia createArduino(Distancia arduino) {
	        return arduinoRepository.save(arduino);
	    }

	    public Distancia updateArduino(Long id, Distancia updatedArduino) {
	        if (arduinoRepository.existsById(id)) {
	            
	            return arduinoRepository.save(updatedArduino);
	        } 
	        return null;
	        }
	    public void deleteArduino(Long id) {
	        arduinoRepository.deleteById(id);
	    }
	}

