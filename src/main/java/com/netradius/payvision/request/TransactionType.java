package com.netradius.payvision.request;

/**
 * Enumerates the Transactions type.
 *
 * @author Abhinav Nahar
 */
public enum TransactionType {
  SALE,
  AUTH,
  CAPTURE,
  VOID,
  REFUND,
  CREDIT,
  VALIDATE,
  UPDATE;
}
