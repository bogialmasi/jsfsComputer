package hu.computersSimpleAPI.repository;

import hu.computersSimpleAPI.domain.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    // Integer - a tábla elsődleges kulcsának típusa

    public List<Computer> findByManufacturer(String manufacturer);
}
