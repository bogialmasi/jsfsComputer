package hu.computersSimpleAPI.controller;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ComputerService service;

    @GetMapping("/")
    public String home() {
        return "Működik";
    }

    @GetMapping("/computers")
    public List<Computer> getComputers() {
        return service.getComputers();
    }

    @GetMapping("/computers/{serial}")
    public Computer getComputer(@PathVariable int serial){
        return service.getComputerBySerial(serial);
    }

    @GetMapping("/computer/{manufacturer}")
    public Computer getComputerByManufacturer(@PathVariable String manufacturer){
        return service.getComputerByManufacturer(manufacturer);
    }
}
