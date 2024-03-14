package ma.dev7hd.tp_hospital.services;

import ma.dev7hd.tp_hospital.entities.Appointment;
import ma.dev7hd.tp_hospital.entities.Consultation;
import ma.dev7hd.tp_hospital.entities.Doctor;
import ma.dev7hd.tp_hospital.entities.Patient;

import java.util.List;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Patient patientFindById(Long id);
    List<Patient> patientFindByName(String name);
    Doctor saveDoctor(Doctor doctor);
    Doctor doctorFindById(Long id);
    List<Doctor> doctorFindByName(String name);
    Appointment saveAppointment(Appointment appointment);
    Appointment appointmentFindById(String id);
    Consultation saveConsultation(Consultation consultation);
    Consultation consultationFindById(Long id);

}
