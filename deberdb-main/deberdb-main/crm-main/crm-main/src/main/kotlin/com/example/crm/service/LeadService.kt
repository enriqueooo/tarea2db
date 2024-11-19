package crm.service

import crm.dto.LeadDTO
import crm.mapper.CRMMapper
import crm.repository.CustomerRepository
import crm.repository.LeadRepository
import org.springframework.stereotype.Service

@Service
class LeadService(
    private val leadRepository: LeadRepository,
    private val customerRepository: CustomerRepository,
    private val mapper: CRMMapper
) {
    fun createLead(dto: LeadDTO): LeadDTO {
        val customer = dto.customerId?.let { customerRepository.findById(it).orElse(null) }
        val leadEntity = mapper.toLeadEntity(dto, customer)
        return mapper.toLeadDTO(leadRepository.save(leadEntity))
    }
}
