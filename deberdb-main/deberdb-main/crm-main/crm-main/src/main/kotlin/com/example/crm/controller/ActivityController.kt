package crm.controller

import crm.dto.ActivityDTO
import crm.service.ActivityService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/activities")
class ActivityController(private val activityService: ActivityService) {
    @PostMapping
    fun createActivity(@RequestBody dto: ActivityDTO): ResponseEntity<ActivityDTO> =
        ResponseEntity.ok(activityService.createActivity(dto))
}
