package crm.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "activity")
data class ActivityEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val date: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    val lead: LeadEntity? = null
)
