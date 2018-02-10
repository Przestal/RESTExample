package com.sda.soccer;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    int id;
    String fname;
    String lname;
    String position;
    String club;
    String nationality;
    int price;
    double high;
    double weight;




}
