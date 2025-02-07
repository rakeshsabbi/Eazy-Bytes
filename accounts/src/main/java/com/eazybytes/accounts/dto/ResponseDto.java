package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Schema(
        name = " Response",
        description = "Schema to hold successful response information"
)
@Data
@Builder
@AllArgsConstructor

public class ResponseDto {

    @Schema(

            description = "status code in the response"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response"
    )
    private String statusMsg;
}
