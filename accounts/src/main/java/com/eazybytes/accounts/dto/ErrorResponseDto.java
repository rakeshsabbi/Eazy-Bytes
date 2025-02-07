package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DecimalStyle;

@Schema(
        name = "Error Response",
        description = "Schema to hold error response"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Msg representing the error happened"
    )
    private String errorMsg;

    @Schema(
            description = "Error time representing error time happened"
    )
    private LocalDateTime errorTime;

}
