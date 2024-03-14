package ma.dev7hd.tp_hospital.repositories;

import ma.dev7hd.tp_hospital.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {
}
