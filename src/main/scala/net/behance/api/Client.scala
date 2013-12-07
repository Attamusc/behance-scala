package net.behance.api

import dispatch._
import Defaults._
import spray.json._
import DefaultJsonProtocol._

object Client {
  def apply(accessToken: String): Client = new Client(accessToken)
}

class Client(val accessToken: String) {
  val apiRoot = "www.behance.net"

  private def endpoint(resource: String, options: Map[String, String] = Map()) = host(apiRoot).secure / "v2" / resource <<? (options +
    ("api_key" -> this.accessToken))

  // Projects
  def projects() = {
    val projects = Http(endpoint("projects") OK as.String)
    for (p <- projects) println(p)
  }
  def project() = None
  def projectComments() = None

  // Users
  def user() = None
}
