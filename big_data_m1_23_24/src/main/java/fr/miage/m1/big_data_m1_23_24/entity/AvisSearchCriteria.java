package fr.miage.m1.big_data_m1_23_24.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AvisSearchCriteria {

    private Integer av_id;
    private Rating av_etoile;
    private String av_message;
    private UUID randonne_uuid;

}
