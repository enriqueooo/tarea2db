package crm.dto

data class ActivityDTO(
    val id: Long?,
    val description: String,
    val date: String, // Formato ISO 8601
    val leadId: Long?
)
