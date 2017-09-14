package ibm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ZhiDongWang on 9/14/2017.
 */

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int classification;
    private boolean isOpen;

    protected Hotel(){

    }

    public Hotel(String name, int classification, boolean isOpen) {
        this.name = name;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
