package controllers

import module.DatabaseAccess

import javax.inject._
import play.api.mvc._

class userdetails @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def GetDetails: Action[AnyContent] = Action{
    val userDetailTable = DatabaseAccess.userResult()
    Ok(views.html.userDetails(userDetailTable))
  }
}

