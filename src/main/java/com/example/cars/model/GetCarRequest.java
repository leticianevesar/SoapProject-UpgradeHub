package com.example.cars.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name ="", propOrder = {"carId"})
@XmlRootElement(name = "getCarRequest")
public class GetCarRequest {
    @XmlElement(required = true)
    protected int carId;
}
