package net.behance.api

import org.scalatest._

class ClientSpec extends FunSpec with Matchers {
  describe("Client") {
    it("is instanciable") {
      val client = Client("some_access_token")
      client shouldBe a [Client]
    }
  }
}
