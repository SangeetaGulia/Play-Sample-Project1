package controllers

import javax.inject._

import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Hello... This is Play Application!"))
  }

  def greet(name: String) = Action { request: Request[AnyContent] =>
    Ok(views.html.index(s"Hello $name ... This is Play Application!"))
  }

  def greetTwo(name1: String, name2: String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(s"Hello $name1 and $name2 ... This is Play Application!"))
  }

}
