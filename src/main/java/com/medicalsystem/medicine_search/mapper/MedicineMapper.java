package com.medicalsystem.medicine_search.mapper;

import com.medicalsystem.medicine_search.dto.MedicineSearchResponse;
import com.medicalsystem.medicine_search.entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicineMapper {

    public MedicineSearchResponse toDto(Inventory inventory) {
        if (inventory == null) {
            return null;
        }

        return MedicineSearchResponse.builder()
                .medicineName(inventory.getMedicine().getName())
                .price(inventory.getMedicine().getPrice())
                .pharmacyName(inventory.getPharmacy().getName())
                .latitude(inventory.getPharmacy().getLatitude())
                .longitude(inventory.getPharmacy().getLongitude())
                .build();
    }
}
