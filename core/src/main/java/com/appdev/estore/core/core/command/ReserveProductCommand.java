package com.appdev.estore.core.core.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ReserveProductCommand {

    @TargetAggregateIdentifier
    private final String productId;
    private final String orderId;
    private final int quantity;
    private final String userId;
}
