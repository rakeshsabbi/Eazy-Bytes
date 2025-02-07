package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Account",
        description = "Schema to hold Account Details"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of Customer", example = "1000000000"
    )
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Customer", example = "Checking"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;


    @Schema(
            description = "Address of the Account", example = "123MainStreet"
    )
    @NotEmpty(message = "BranchAddress can not be null or empty")
    private String branchAddress;

}
