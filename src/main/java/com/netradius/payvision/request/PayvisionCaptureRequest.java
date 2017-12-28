package com.netradius.payvision.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Holds the Payvision Capture Request data.
 *
 * @author Abhinav Nahar
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
public class PayvisionCaptureRequest extends PayvisionRequest<PayvisionCaptureRequest> {

  private BigDecimal amount;

  @JsonProperty("transactionid")
  private String transactionId;

  @Setter(AccessLevel.NONE)
  private TransactionType type = TransactionType.CAPTURE;

}
