package ibm.web;

import ibm.domain.Hotel;
import ibm.persistence.HotelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ZhiDongWang on 9/14/2017.
 */
@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    //@RequestMapping(value = "/hotels", method = RequestMethod.GET)
    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }
}
