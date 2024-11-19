package crm.repository

import crm.entity.ActivityEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository : JpaRepository<ActivityEntity, Long>
