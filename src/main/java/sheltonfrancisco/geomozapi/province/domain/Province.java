package sheltonfrancisco.geomozapi.province.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import sheltonfrancisco.geomozapi.utils.EnumTypes;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "provinces", uniqueConstraints = {
        @UniqueConstraint(name = "uc_provinces_abbr", columnNames = {"abbr"}),
        @UniqueConstraint(name = "uc_provinces_name", columnNames = {"name"})
})
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "abbr", unique = true)
    private String abbreviation;
    @Enumerated(EnumType.STRING)
    private EnumTypes.Region region;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
