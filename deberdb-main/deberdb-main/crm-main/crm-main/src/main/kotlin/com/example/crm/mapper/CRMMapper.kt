package crm.mapper

import crm.dto.ActivityDTO
import crm.dto.LeadDTO
import crm.dto.CustomerDTO
import crm.entity.ActivityEntity
import crm.entity.LeadEntity
import crm.entity.CustomerEntity
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class CRMMapper {
    fun toLeadEntity(dto: LeadDTO, customer: CustomerEntity?): LeadEntity = LeadEntity(
        id = dto.id ?: 0,
        status = dto.status,
        source = dto.source,
        customer = customer
    )

    fun toLeadDTO(entity: LeadEntity): LeadDTO = LeadDTO(
        id = entity.id,
        status = entity.status,
        source = entity.source,
        customerId = entity.customer?.id
    )

    fun toActivityEntity(dto: ActivityDTO, lead: LeadEntity?): ActivityEntity = ActivityEntity(
        id = dto.id ?: 0,
        description = dto.description,
        date = LocalDateTime.parse(dto.date),
        lead = lead
    )

    fun toActivityDTO(entity: ActivityEntity): ActivityDTO = ActivityDTO(
        id = entity.id,
        description = entity.description,
        date = entity.date.toString(),
        leadId = entity.lead?.id
    )

    fun toCustomerEntity(dto: CustomerDTO): CustomerEntity = CustomerEntity(
        id = dto.id ?: 0,
        name = dto.name
    )

    fun toCustomerDTO(entity: CustomerEntity): CustomerDTO = CustomerDTO(
        id = entity.id,
        name = entity.name
    )
}
