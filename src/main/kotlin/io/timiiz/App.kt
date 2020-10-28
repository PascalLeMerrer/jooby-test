package io.timiiz

import io.jooby.Kooby
import io.jooby.OpenAPIModule
import io.jooby.runApp

class App: Kooby({
  install(OpenAPIModule())

  get("/") {
    "Welcome to Jooby!"
  }
})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
