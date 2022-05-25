/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record Payment(
    Long paymentId,
    Long customerId,
    Long staffId,
    Long rentalId,
    BigDecimal amount,
    LocalDateTime paymentDate
) implements Serializable {

    private static final long serialVersionUID = 1L;

}
