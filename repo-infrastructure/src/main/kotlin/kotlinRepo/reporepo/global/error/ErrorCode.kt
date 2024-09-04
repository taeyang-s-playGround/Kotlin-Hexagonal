package kotlinRepo.reporepo.global.error

import kotlinRepo.reporepo.global.error.exception.ErrorProperty

enum class ErrorCode (
    private val status: Int,
    private val message: String
) : ErrorProperty {
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),

    INVALID_TOKEN(401,"Invalid Token"),
    EXPIRED_TOKEN(401, "Expired Token"),

    EMAIL_CODE_MISS_MATCH(400, "Email Code Miss Match"),
    EMAIL_NOT_FOUND(404, "Email Not Found"),
    EMAIL_ALREADY_EXISTS(409, "Email Already Exists"),

    PASSWORD_MISS_MATCH(400, "Password Miss Match"),
    USER_NOT_FOUND(404, "User Not Found"),
    USER_ALREADY_EXISTS(409, "User Already Exists"),

    ITEM_ALREADY_EXISTS(409, "Item Already Exists"),


    REFRESH_TOKEN_NOT_FOUND(404, "Refresh Token Not Found");

    override fun message(): String = message
    override fun status(): Int = status
}