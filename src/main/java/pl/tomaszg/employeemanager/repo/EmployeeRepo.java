package pl.tomaszg.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomaszg.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {//<podajemy klasę z której łączymy się z bazą i po przecinku Typ zmiennej klucza głównego czyli id
    void deleteEmployeeById(Long id); //tutaj spring już sam tworzy zapytanie na podstawie nazwy

    Optional<Employee> findEmployeeById(Long id); //zwraca pracownikow bo jest typ Employee, ale w Optionalu, czyli że może się zdarzyć że nie będzie co zwracać
}
