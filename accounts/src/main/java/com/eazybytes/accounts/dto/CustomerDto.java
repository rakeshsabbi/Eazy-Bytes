package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "Customer",
        description = "Schema holds details of customer and accounts"
)
@Data
public class CustomerDto {

    @Schema(
            description = "customer name", example = "Eazy Bank"
    )
    @NotEmpty(message = "Name Cannot be null or Empty")
    @Size(min = 5,max = 30,message = "The Length of customer should be btw 5 and 30")
    private String name;

    @Schema(
            description = "customer email", example = "EB@eazybank.com"
    )
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Schema(
            description = "customer mobileNumber", example = "9696969696"
    )
    @NotEmpty(message = "MobileNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "MobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of Customer"
    )
    private AccountsDto accountsDto;
}
