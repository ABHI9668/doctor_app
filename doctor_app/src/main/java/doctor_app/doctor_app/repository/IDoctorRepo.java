package doctor_app.doctor_app.repository;

import com.geekster.DoctorAPP.model.Admin;
import com.geekster.DoctorAPP.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor,Long> {
}

