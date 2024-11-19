package crm.repository

import crm.entity.LeadEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LeadRepository : JpaRepository<LeadEntity, Long>
