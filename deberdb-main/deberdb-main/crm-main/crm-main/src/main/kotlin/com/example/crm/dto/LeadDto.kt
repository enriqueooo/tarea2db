package crm.dto

data class LeadDTO(
    val id: Long?,
    val status: String,
    val source: String?,
    val customerId: Long?
)
