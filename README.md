About This Repository
-------------------------
Chisel (Constructing Hardware in a Scala Embedded Language) is a modern hardware description language used to design digital systems at a higher level of abstraction compared to traditional Verilog or VHDL. It allows designers to describe hardware using parameterized and reusable constructs while ultimately generating synthesizable RTL code. Chisel is widely used in research and industry for designing processors, accelerators, and SoC components because it combines software-like productivity with hardware-accurate results.

This repository demonstrates the basic Chisel design flow by implementing a simple digital module and generating its corresponding Verilog representation. The objective of this work is to understand how hardware can be described using Chisel, elaborated through the Scala toolchain, and converted into standard Verilog for simulation and FPGA synthesis. The project serves as an introductory example to the Chisel-to-Verilog workflow and acts as a foundation for developing more complex hardware designs in future work.

The goal of this project is to understand the complete flow:

Chisel (.scala) → Verilog (.v) → Simulation / FPGA

Tools and Technologies Used 
---------------------------
    Ubuntu Linux
    Java JDK 17
    Scala CLI
    Chisel 7.x
    CIRCT (firtool backend)
    Icarus Verilog (for simulation – optional)

Project Structure
---------------------        
        counter/
        ├── counter.scala   # Chisel source file
        ├── Counter.v       # Generated Verilog file
        ├── tb_counter.v    # Verilog testbench (optional)
        └── README.md       # optional

        
Conclusion
-----------------
This project successfully demonstrates the use of Chisel to design a digital counter and generate synthesizable Verilog code. The same flow can be extended to more complex modules such as FSMs, processors, and SoC components.The chisel installation differs from ystem to sytem as per the dependencies you already installed.
