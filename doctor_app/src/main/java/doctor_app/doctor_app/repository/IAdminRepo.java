package doctor_app.doctor_app.repository;

import com.geekster.DoctorAPP.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
