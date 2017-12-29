package com.netradius.payvision.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Holds the Payvision Void Request data.
 *
 * @author Abhinav Nahar
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
public class PayvisionVoidRequest extends PayvisionRequest<PayvisionVoidRequest> {

  @Setter(AccessLevel.NONE)
  @Getter
  private TransactionType type = TransactionType.VOID;

  @JsonProperty("transactionid")
  private String transactionId;
}
