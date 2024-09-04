package kotlinRepo.reporepo.domain.user.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class SignupWebRequest(

    @field:NotBlank
    val username: String,

    @field:NotBlank
    val accountId: String,

    @field:NotBlank
    @field:Size(min = 8, max = 20)
    val password: String,

    @field:NotBlank
    val email: String
)
