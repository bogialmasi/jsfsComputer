package hu.computersSimpleAPI.service;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository repository;

    /*----------------------------------------------------------------------------------------------------------------*/

    public List<Computer> getComputers() {
        return repository.findAll();
    }

    public Computer getComputerBySerial(int serial) {
        Optional<Computer> computer = repository.findById(serial);
        if (computer.isPresent()) {
            return computer.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public Computer getComputerByManufacturer(String manufacturer) {
        return null;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    public Computer addComputer(Computer computer) {
        repository.save(computer);
        return computer;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    public void deleteComputer(int serial) {
        Optional<Computer> computer = repository.findById(serial);
        if (computer.isPresent()) {
            repository.deleteById(serial);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
