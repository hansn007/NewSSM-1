package com.lanou.entity;

/**
 * Created by lanou on 2017/12/3.
 */
public class Car {

    private Integer CarId;

    private Integer wineId;

    private Integer counts;

    private String userPhone;

    private Integer deleteId;
    private Integer checked;

    public Integer getChecked() {
        return checked;
    }

    public Car(Integer carId, Integer wineId, Integer counts, String userPhone, Integer deleteId, Integer checked, Wine wines) {
        CarId = carId;
        this.wineId = wineId;
        this.counts = counts;
        this.userPhone = userPhone;
        this.deleteId = deleteId;
        this.checked = checked;
        this.wines = wines;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + CarId +
                ", wineId=" + wineId +
                ", counts=" + counts +
                ", userPhone='" + userPhone + '\'' +
                ", deleteId=" + deleteId +
                ", checked=" + checked +
                ", wines=" + wines +
                '}';
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    private Wine wines;


    public Wine getWines() {
        return wines;
    }

    public void setWines(Wine wines) {
        this.wines = wines;
    }

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer carId) {
        CarId = carId;
    }

    public Integer getWineId() {
        return wineId;
    }

    public void setWineId(Integer wineId) {
        this.wineId = wineId;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }

    public Car() {
        super();
    }

}
