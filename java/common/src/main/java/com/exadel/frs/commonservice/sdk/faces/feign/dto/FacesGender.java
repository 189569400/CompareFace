package com.exadel.frs.commonservice.sdk.faces.feign.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FacesGender {

    private Double probability;
    private String value;
}
