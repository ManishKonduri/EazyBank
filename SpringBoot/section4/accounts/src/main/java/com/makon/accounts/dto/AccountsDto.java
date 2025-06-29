package com.makon.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold account details"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Bank account",
            example = "3452167897"
    )
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private String accountNumber;

    @Schema(
            description = "Accounts Type",
            example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Branch address of the Bank account",
            example = "123 Main Street, Dallas"
    )
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
