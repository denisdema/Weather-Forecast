package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "weather")
public class Weather {
    @Id
    private int weather_id;
    private Date date;
    private double humidity;
    private double wind_speed;

    @ManyToOne
    @JoinColumn(name ="city_id" )
    private City city;

}
