package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "trade")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeDto {
    @Id
    @GeneratedValue
    private int id;
    private int amount;
    private int rank;

    @ManyToOne
    @JoinColumn(name = "rs_event_id")
    private RsEventDto rsEventDto;
}
