package com.nnobrega.jpa.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "tb_fine")
public class Fine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private Double value;

    @Column (nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn (name = "car_id")
    private Car car;

    public Fine() {
    }

    public Fine(Integer id, Double value, LocalDateTime date, Car car) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fine fine = (Fine) o;

        return Objects.equals(id, fine.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", value=" + value +
                ", date=" + date +
                ", car=" + car +
                '}';
    }
}
