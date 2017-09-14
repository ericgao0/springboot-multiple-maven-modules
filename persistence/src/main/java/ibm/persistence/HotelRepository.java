package ibm.persistence;

import ibm.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ZhiDongWang on 9/14/2017.
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
