package com.example.case_study.dto.facility;


import com.example.case_study.model.facility.FacilityType;
import com.example.case_study.model.facility.RentType;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class FacilityDto {

    private Long id;

    @NotBlank(message = "{NotBlank}")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$",message = "{Name}")
    private String name;

    @NotNull
    private int are;

    @NotNull
    private double cost;

    @NotNull
    private int maxPeoPel;

    private FacilityType facilityType;

    private RentType rentType;

    @NotBlank(message = "{NotBlank}")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Ll}\\p{Ll}+)*$",message = "{Name}")
    private String standardRoom;

    @NotNull
    private String descriptionOtherConvenience;

    @NotNull
    private double poolArea;

    @NotNull
    private int numberOfFloors;

    @NotBlank
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Ll}\\p{Ll}+)*$",message = "{Name}")
    private String facilityFree;
}
