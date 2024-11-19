package crm.entity

import jakarta.persistence.*

@Entity
@Table(name = "customer")
data class CustomerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String
)
