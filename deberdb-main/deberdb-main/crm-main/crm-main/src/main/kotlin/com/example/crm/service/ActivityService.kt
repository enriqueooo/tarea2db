package crm.service

import crm.dto.ActivityDTO
import crm.mapper.CRMMapper
import crm.repository.ActivityRepository
import crm.repository.LeadRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(
    private val activityRepository: ActivityRepository,
    private val leadRepository: LeadRepository,
    private val mapper: CRMMapper
) {
    fun createActivity(dto: ActivityDTO): ActivityDTO {
        val lead = dto.leadId?.let { leadRepository.findById(it).orElse(null) }
        val activityEntity = mapper.toActivityEntity(dto, lead)
        return mapper.toActivityDTO(activityRepository.save(activityEntity))
    }
}
