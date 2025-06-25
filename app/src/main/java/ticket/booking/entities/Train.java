package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Builder
public class Train {
    
    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;
    //matrix of seats

    private Map<String, String> stationTimes;

    private List<String> stations;

    public Train(){}
    //constructor for train

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    //getter and setter for stations
    public List<String> getStations(){
        return stations;
    }

    //getter and setter for seats
    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats){
       this.seats = seats;
    }

    //getter and setter for trainId
    public String getTrainId(){
        return trainId;
    }

    //getter and setter for stationTimes
    public Map<String, String> getStationTimes(){
        return stationTimes;
    }

    //getter and setter for trainNo
    public String getTrainNo(){
        return trainNo;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    //setter for trainId
    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    //setter for stationTimes
    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTimes = stationTimes;
    }

    //setter for stations
    public void setStations(List<String> stations){
        this.stations = stations;
    }

    //getter for trainInfo
    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }

}
