//> using scala 2.13.18
//> using dep org.chipsalliance::chisel:7.6.0
//> using plugin org.chipsalliance:::chisel-plugin:7.6.0

import chisel3._
import chisel3.stage.ChiselStage

class Counter extends Module {
  val out = IO(Output(UInt(8.W)))
  val count = RegInit(0.U(8.W))

  count := count + 1.U
  out := count
}

object Main extends App {
  println(
    ChiselStage.emitSystemVerilog(new Counter)
  )
}
