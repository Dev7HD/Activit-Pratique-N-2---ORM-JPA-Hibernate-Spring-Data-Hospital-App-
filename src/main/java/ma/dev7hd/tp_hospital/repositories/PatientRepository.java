package ma.dev7hd.tp_hospital.repositories;

import ma.dev7hd.tp_hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByName(String name);
}
