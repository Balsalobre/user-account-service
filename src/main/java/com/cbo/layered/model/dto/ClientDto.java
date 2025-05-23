package com.cbo.layered.model.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ClientDto implements Serializable {
    @Builder.Default
    private UUID clientId = UUID.randomUUID();
    private String name;
    private String surname;
    private String phone;
    private String email;
    private Date updatedAt;
    private Date registrationDate;
}
