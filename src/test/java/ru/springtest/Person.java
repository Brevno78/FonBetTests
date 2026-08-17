package ru.springtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    String firstName;
    String lastName;
    String address;
    String city;
    int telephone;
}

