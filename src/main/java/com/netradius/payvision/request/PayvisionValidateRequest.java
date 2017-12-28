package com.netradius.payvision.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Holds the Payvision Validate Request data.
 *
 * @author Abhinav Nahar
 * @author Abhijeet Kale
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
public class PayvisionValidateRequest extends PayvisionRequest<PayvisionValidateRequest> {

  @Setter(AccessLevel.NONE)
  private TransactionType type = TransactionType.VALIDATE;

  private CreditCard creditCard;

  private BillingInfo billingInfo;

  private OrderInfo orderInfo;

  private ShippingInfo shippingInfo;
}
