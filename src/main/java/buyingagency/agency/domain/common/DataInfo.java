package buyingagency.agency.domain.common;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalDateTime;

@Embeddable
@Getter
public class DataInfo {

    private LocalDateTime writeDate;
    private LocalDateTime updateDate;
    private Long writeMember;
    private Long updateMember;

    protected DataInfo() {
    }

    public DataInfo(LocalDateTime writeDate, LocalDateTime updateDate, Long writeMember, Long updateMember) {
        this.writeDate = writeDate;
        this.updateDate = updateDate;
        this.writeMember = writeMember;
        this.updateMember = updateMember;
    }
}
