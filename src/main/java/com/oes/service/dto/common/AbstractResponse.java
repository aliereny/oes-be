package com.oes.service.dto.common;

import lombok.Data;

@Data(staticConstructor = "of")
public class AbstractResponse {
    private Boolean success;
}
