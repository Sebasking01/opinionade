package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def st = Action { implicit request =>
    Ok(views.html.st(request))
  }

}
