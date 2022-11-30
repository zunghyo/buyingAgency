package buyingagency.agency.domain.member;

import buyingagency.agency.domain.common.DataInfo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String password;
    private String name;
    private String email;
    private String phone;

    @Embedded
    private DataInfo dataInfo;
}
