package case_study_module2.service.impl.faciliti_service;

import case_study_module2.model.facility.Facility;
import case_study_module2.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    public static LinkedHashMap<Facility, Integer> listFacility = new LinkedHashMap<>();

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void displayListMaintain() {
        System.out.println("Maintenance Facility List:  ");

    }


}
