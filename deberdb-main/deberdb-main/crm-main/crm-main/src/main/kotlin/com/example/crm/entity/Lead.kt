package crm.entity

import jakarta.persistence.*

@Entity
@Table(name = "lead")
data class LeadEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val status: String,

    val source: String? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    val customer: CustomerEntity? = null
)
