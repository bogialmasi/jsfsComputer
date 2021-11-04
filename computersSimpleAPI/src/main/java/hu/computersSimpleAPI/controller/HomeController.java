package hu.computersSimpleAPI.controller;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ComputerService service;

    /*----------------------------------------------------------------------------------------------------------------*/

    @GetMapping("/")
    public String home() {
        return "Működik";
    }

    @GetMapping("/computers")
    public List<Computer> getComputers() {
        return service.getComputers();
    }

    @GetMapping("/computers/{serial}")
    public Computer getComputer(@PathVariable("serial") int serial){
        return service.getComputerBySerial(serial);
    }

    @GetMapping("/computer/manufacturer/{manufacturer}")
    public Computer getComputerByManufacturer(@PathVariable("manufacturer") String manufacturer){
        System.out.println("Manufacturer: " +manufacturer);
        return service.getComputerByManufacturer(manufacturer);
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @PostMapping("/computers")
    public Computer addComputer(@RequestBody Computer computer){
        return service.addComputer(computer);
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @DeleteMapping("/comouters/{serial}")
    public void deleteComputer(@PathVariable int serial){
        service.deleteComputer(serial);
    }
}
