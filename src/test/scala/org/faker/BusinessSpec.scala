package org.faker

import org.scalatest.{FlatSpec, Matchers}

class BusinessSpec extends FlatSpec with Matchers with FakerBehaviors {

  "creditCardNumber" should behave like validResult(Business.creditCardNumber)

  "creditCardType" should behave like validResult(Business.creditCardType)

  "creditCardExpiryDate" should "be a valid date" in {
    Business.creditCardExpiryDate should not be(null)
  }
}
