package sheltonfrancisco.geomozapi.district.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import sheltonfrancisco.geomozapi.province.domain.Province;

import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "districts", uniqueConstraints = {
        @UniqueConstraint(name = "uc_districts_abbr", columnNames = {"abbr"}),
        @UniqueConstraint(name = "uc_districts_name", columnNames = {"name"})
})
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "abbr", unique = true)
    private String abbreviation;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id")
    private Province province;
}
