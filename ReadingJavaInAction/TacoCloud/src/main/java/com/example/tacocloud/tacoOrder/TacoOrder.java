package com.example.tacocloud.tacoOrder;

import com.example.tacocloud.taco.Taco;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String deliveryName;
    @NotBlank
    private String deliveryStreet;
    @NotBlank
    private String deliveryCity;
    @NotBlank
    private String deliveryState;
    @NotBlank
    private String deliveryZip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    @Size(min = 1, message = "Create at least one taco please.")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Taco> tacos = new ArrayList<>();
    private Date placedAt;

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
