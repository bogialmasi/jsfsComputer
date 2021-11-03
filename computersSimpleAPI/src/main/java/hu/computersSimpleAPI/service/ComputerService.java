package hu.computersSimpleAPI.service;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository repository;

    public List<Computer> getComputers() {
        return repository.findAll();
    }

    public Computer getComputerBySerial(int serial) {
        Optional<Computer> computer = repository.findById(serial);
        return computer.get();
    }

    public Computer getComputerByManufacturer(String manufacturer) {
        return null;
    }
}
